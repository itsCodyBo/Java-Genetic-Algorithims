


#include <stdio.h>
#include <conio.h>
#include <ctype.h>
#include <dos.h>
#include <math.h>
#include <graphics.h>
#include <dir.h>

 typedef char string[20];

 void Initializer(void);
 void Curs_move(void);
 void Option(void);
 void Putpoint(int x, int y, int color);
 void Linem(int startx, int starty, int endx, int endy, int color);
 void Palette(int pnum);
 void Mode(int mode_code);
 void Xhairs(int x, int y);
 void Goto_xy(int x, int y);
 int Screen_info(int on_flag, int erase_flag);
 void Eraser(int x, int y,char extra);
 int Screen_save(void);
 void Prev_screen(void);
 int Readkey(void);
 void Menu(void);
 void Move(char);
 char *Read_string(void);
 void Save(void);
 void Mess(char []);
 void Load(void);
 void Help(void);
 void New(void);
 int Menu_load(void);
 void Move_load(char);
 int Help_on_help(void);

 void Print_buf(void);
 void Set_graphics(int cols, char density);
 void Reset_prn(void);
 void Print(char ch);

 string str[6] = {
		    "Save",
		    "Load",
		    "New",
		    "Print",
		    "Help",
		    "Quit"
		 };
 typedef struct point{
	      char name[13];
	      struct point *back;
	      struct point *front;
	      } pointer;
 pointer *listb, *listf, *ptr1, *ptr2;

 int elem_no = 0, felem_no = 0;
 char s[10],s1[2];
 int load_flag = 1;
 union k{
	    char c[2];
	    int i;
	  } key;

 int x = 100, y = 100;
 int cc = 1, j;
 int on_flag = 1, erase_flag = 0;
 int inc = 1;