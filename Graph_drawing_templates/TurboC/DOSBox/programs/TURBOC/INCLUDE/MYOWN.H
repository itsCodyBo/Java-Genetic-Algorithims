

/* send the cursor to specified X, Y coordinates */
extern void goto_xy(int x, int y);

/* return the 16_bit scan code for keyboard.  */
extern readkey(void);

/* Clear the screen. */
extern void clr_window(int x1, int y1,int x2, int y2);

/* returns the current video mode */
extern video_mode(void);
