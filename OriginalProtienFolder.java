	//3d array of 200 64rowx2column 2d arrays
	int[][][] population = new int[200][64][2];


	

	public void RandomOrientation () {

		//these are the variables we will need for the protein foling random orientation 
		int previousDirection, presentDirection;
		int X, Y;	
		//variables to use in methods
		int validFolding;

		//random int for selection
		Random rn = new Random();


		//the variable we will use to keep track of our xy coordinates and fill our lists
		//this says "for each chromosome we have" out of all 200
		for (int i=0; i<population.length;i++) {

			//set validFolding to true
			validFolding = 1;

			//always fill the first two xy coordinates with these numbers
			population[i][0][0] = 0;
			population[i][0][1] = 0;
			population[i][1][0] = 1;
			population[i][1][1] = 0;
			X = 1;
			Y = 0;
			//we always start off with a previous direction of 1
			previousDirection = 1;

			//this says "for each row"
			for (int j=3;j<population[i].length;j++){
				
				//this says "for each column"
				for (int k=0; k<population[j][k].length;k++){
					
					int selection = rn.nextInt(3);


					switch (previousDirection) {

						case 1:
							//To go forward again
							if (selection == 1) {
								X += 1;
								previousDirection = 1;
							}
							//to go down
							else if (selection == 2) {
								Y += -1;
								previousDirection = 2;
							}
							//to go up
							else if (selection == 3) {
								Y += 1;
								previousDirection = 4;
							}
							break;
						//if our last move was down	
						case 2:
							//To go forward again
							if (selection == 1) {
								X += 1;
								previousDirection = 1;
							}
							//to go down
							else if (selection == 2) {
								Y += -1;
								previousDirection = 2;
							}
							//to go left
							else if (selection == 3) {
								X += -1;
								previousDirection = 3;
							}
							break;
						case 3:
							//To go up
							if (selection == 1) {
								Y += 1;
								previousDirection = 4;
							}
							//to go down
							else if (selection == 2) {
								Y += -1;
								previousDirection = 2;
							}
							//to go left again
							else if (selection == 3) {
								X += -1;
								previousDirection = 3;
							}
							break;
						case 4:

							//To go forward (right) again
							if (selection == 1) {
								X += 1;
								previousDirection = 1;
							}
							//to go left
							else if (selection == 2) {
								X += -1;
								previousDirection = 3;
							}
							//to go up
							else if (selection == 3) {
								Y += 1;
								previousDirection = 4;
							}
							break;

						}//end switch statement

						//flag to check if valid
						int flag = 0;
						
						//start a while loop here to check if our last entry was legal
						
						while (flag!=1){
							//again, this says for each row
							for (int m=0;m<population[i].length;m++){
				
								//this says "for each column"
								for (int k=0; k<population[j][k].length;k++){

								}
							}

						}//end while
				}//end k for

			}//end j for

		}//end i for

		//first variable for the switch statement is direction, which will always be 1 to start out

	}//end RandomOrientation

	















	public void printArray(int[][] arrayToPrint){
		for (int i=0; i<arrayToPrint.length; i++) {
			for (int j=0;j<arrayToPrint.length;j++){
				System.out.printf("%5d ", arrayToPrint[i][j]);
			}
			System.out.println();
		}
	}//end printArray