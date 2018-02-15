/*  Hoque: A Turbo C based graphics template for students of CSCI 4631/5631.
           Turbo C is very old but simple - may help you learn basic graphics programming faster.
*/

#include<stdio.h>                              /* Standard I/O functiond  */
#include<graphics.h>
#include<conio.h>    													/* COLORS , kbhit(),     ...*/
#include<stdlib.h>
#include<dos.h>
#include<math.h>                              /* fmod,     ...............*/



/*//////////////////////////////////////////////////////////////////////////*/
/*//////////////////////////////////////////////////////////////////////////*/
/*//////////////////////////////////////////////////////////////////////////*/
/*//////////////////////////////////////////////////////////////////////////*/
/* Main of the program              */

void main (void)
{
 char Read;
 int pixcolor;

 int gdriver=DETECT,     /* This segment is for initializing the graphics system */
		 gmode;
		 gdriver=VGA;
		 gmode=VGAHI;
		 initgraph(&gdriver,&gmode,"");



do{
					/* setbkcolor(BLACK); */                      /* back-ground color is black*/

			setfillstyle(1,WHITE);
			bar(0,0,639,479);                                   /* Using fore-color creating a background */

			 setcolor(RED);
			 line(10, 5, 350, 320);   /* Draw line #1 with RED color)*/

             setcolor(BLUE);
						 circle(300, 200, 150);  /* ciccle(x,y,r), where (x,y) is the center, r = radius */

             pixcolor = getpixel(10,5);

             setcolor(pixcolor);        /* Use the read color at (10,5) which was the color of the drawn line #1 */
			 line(100, 50, 300, 50);    /* Draw Line #2 with the same color */

																									 /*                 */
			 setcolor(BLACK);                            /*                 */
			 settextstyle(DEFAULT_FONT,HORIZ_DIR,2);     /*   For repeat    */
			 outtextxy(200,400,"Repeat ? (Y/N) ");       /*                 */
			 do{	Read=getch();}                         /*                 */
			 while (Read!='Y' && Read!='y' && Read!='n' && Read!='N');

	 } while(Read=='Y' || Read=='y');
}

