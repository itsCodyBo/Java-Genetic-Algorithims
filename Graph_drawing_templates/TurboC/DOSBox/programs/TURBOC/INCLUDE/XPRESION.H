/* Manzur M.
   Friendly Copyright (c) April, 1992.

   You can change anything.
   Let me share your experience. */

#include <string.h>
#include <stdio.h>
#include <alloc.h>
#include <math.h>
#include <io.h>
#include <stdlib.h>
#include <dos.h>
#include <ctype.h>

typedef unsigned char BYTE;

typedef struct{
		BYTE a;
		BYTE b;
		BYTE c;
	   }DATE;

typedef struct{
		BYTE name[11];
		BYTE type;
		BYTE length;
		BYTE decimal;
		union{
			BYTE *character;
			int *integer;
			float *real;
			DATE *date;
		}ptr;
		BYTE status;
	   }FIELD_MEMORY_STRUCTURE;

typedef union{
		struct{
			char a;
			char b;
			char c;
			char d;
		}c;
		int i;
		long l;
		float f;
	   }CIF;

DATE DaTE(void);
int DAY(BYTE *exp,int *ec);
int MONTH(BYTE *exp,int *ec);
int YEAR(BYTE *exp,int *ec);
BYTE DELETED(void);
float DISKSPACE(void);
char *DTOC(BYTE *exp,int *ec);
char *FIELD(BYTE *exp,int *ec);
BYTE FiLE(BYTE *exp,int *ec);
char *LEFT(BYTE *exp,int *ec);
int LEN(BYTE *exp,int *ec);
float LOG(BYTE *exp,int *ec);
char *LOWER(BYTE *exp,int *ec);
DATE LUPDATE(void);
float RECCOUNT(void);
float RECNO(void);
int RECSIZE(void);
char *REPLICATE(BYTE *exp,int *ec);
int ROW(void);
int COL(void);
FIELD_MEMORY_STRUCTURE MAX(BYTE *exp,int *ec);
FIELD_MEMORY_STRUCTURE MIN(BYTE *exp,int *ec);
char *RIGHT(BYTE *exp,int *ec);
char *RTRIM(BYTE *exp,int *ec);
char *TRIM(BYTE *exp,int *ec);
char *LTRIM(BYTE *exp,int *ec);
char *SPACE(BYTE *exp,int *ec);
float SQRT(BYTE *exp,int *ec);
char *STR(BYTE *exp,int *ec);
char *STUFF(BYTE *exp,int *ec);
char *TIME(void);
char *UPPER(BYTE *exp,int *ec);
float VAL(BYTE *exp,int *ec);
char *SUBSTR(BYTE *exp,int *ecount);

void ffree(FIELD_MEMORY_STRUCTURE f);
int cmpdate(DATE m, DATE n);

FIELD_MEMORY_STRUCTURE EvaluateExpression(BYTE *exp, int *ecount);

/******************************************************************************\

   旼컴컴컴컴컴컴컴컴컴컴컴컴컴�
   � Operand specifier pattern �
   읕컴컴컴컴컴컴컴컴컴컴컴컴컴昴�
     栢栢栢栢栢栢栢栢栢栢栢栢栢栢�

     旼컴컴컴컴컴컴컴컴컴컴컴컴컴컴컴컴컴 Operand specifier bit, must be 0 (Zero)
     �
     �           旼컴컴컴컴컴컴컴컴컴컴컴 Work area specifier for Field
	�           �                          00000 : Memory
	�  旼컴컴컴컨컴컴컴컴�                 00001 : Work area 1 ....
	�  �                 �                 00010 : Work area 2 ....
   旼컴쩡컴쩡컴쩡컴쩡컴쩡컴쩡컴쩡컴�
   � 7 � 6 � 5 � 4 � 3 � 2 � 1 � 0 �
   읕컴좔컴좔컴좔컴좔컴좔컴좔컴좔컴�
                �         � �     �
                읕컴컫컴컴� 읕컫컴�
                     �         읕컴컴컴� Type specifier
                     �                     00 : Constant
                     �                     11 : Memory/Field
                     �
                     읕컴컴컴컴컴컴컴컴� Constant specifier
                                           000 : Character
                                           001 : Integer
                                           010 : Date
                                           011 : Logical False
                                           100 : Memo
                                           101 : Real
                                           110 : Mismatch
                                           111 : Logical True


   旼컴컴컴컴컴컴컴컴컴컴컴컴컴커
   � Operator specifier pattern �
   읕컴컴컴컴컴컴컴컴컴컴컴컴컴켸栢
     栢栢栢栢栢栢栢栢栢栢栢栢栢栢栢


       旼컴컴컴컴컴컴컴컴컴컴컴컴컴컴컴컴 Operator specifier bits, must be 10 (bit#7:1, bit#6:0)
       �
    旼컨컴�
    �     �
   旼컴쩡컴쩡컴쩡컴쩡컴쩡컴쩡컴쩡컴�
   � 7 � 6 � 5 � 4 � 3 � 2 � 1 � 0 �
   읕컴좔컴좔컴좔컴좔컴좔컴좔컴좔컴�
            �                     �
            읕컴컴컴컴컫컴컴컴컴컴�
                       �
                       읕컴컴컴컴컴컴컴컴 Operator codes
                                             0 : (
                                             1 : )
                                             2 : NOT
                                             3 : unary -
                                             4 : *
                                             5 : /
                                             6 : +
                                             7 : -
                                             8 : <
                                             9 : <=
                                             A : >
                                             B : >=
                                             C : =
                                             D : <>
                                             E : AND
                                             F : OR
                                            10 : XOR
                                            11 : ^ or **

 \*****************************************************************************/