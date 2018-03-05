import java.util.Random;

public class Chromosome {
	

	int[] x = new int[20];
	int[] y = new int[20];

	public void Chromosome(){
		
	}//end constructor

	//get an x at a given index
	public int getX(int location){
		return x[location];
	}//end getX


	//get a y at a given index
	public int getY(int location){
		return y[location];
	}//end getY

	//set at a given index
	public void setX(int location, int numberToSet) {
		x[location] = numberToSet;
	}//end setX

	//set a y at a given index
	public void setY(int location, int numberToSet) {
		y[location] = numberToSet;
	}//end SetY

	//return the length of x or y (both should be hardcoded to 64 but goo to have)
	public int getLength(){
		return x.length;
	}


	public void RandomOrientation(){

		//for every new chromosome, set the first two values as 0,0 and 0,1
		this.setX(1,1);
		this.setY(1,0);

		//start out as previous direction being 1
		int previousDirection = 1;
		int tempDirection = 1;

		//used to choose a new path
		Random rn = new Random();


		int currentX=1;
		int currentY=0;

		//for each row
		for (int i=2;i<this.getLength();i++){
			
			//xy variables
			int tempX=0;
			int tempY=0;


			int firstChoice = rn.nextInt(3)+1;
			int secondChoice = 6 - firstChoice;
			int thirdChoice = 6 - firstChoice - secondChoice;

			//previous direction = 1
			if(previousDirection == 1){
				if(firstChoice==1){
					tempX += 1;
					tempDirection = 1;
				}//end if
				if(firstChoice == 2){
					tempY += -1;
					tempDirection = 2;
				}
				if(firstChoice == 3){
					tempY += 1;
					tempDirection = 4;
				}
			}

			//previous direction = 2
			if(previousDirection == 2){
				if(firstChoice==1){
					tempX += 1;
					tempDirection = 1;
				}//end if
				if(firstChoice == 2){
					tempY += -1;
					tempDirection = 2;
				}
				if(firstChoice == 3){
					tempX += -1;
					tempDirection = 3;
				}
			}//end first if
	
			//previous direction = 3
			if(previousDirection == 3){
				if(firstChoice==1){
					tempY += 1;
					tempDirection = 4;
				}
				if(firstChoice == 2){
					tempY += -1;
					tempDirection = 2;
				}
				if(firstChoice == 3){
					tempX += -1;
					tempDirection = 3;
				}
			}//end first if

			//previous direction = 4
			if(previousDirection == 4){
				if(firstChoice==1){
					tempX += 1;
					tempDirection = 1;
				}
				if(firstChoice == 2){
					tempY += 1;
					tempDirection = 4;
				}
				if(firstChoice == 3){
					tempX += -1;
					tempDirection = 3;
				}
			}

			
			//first check for duplicate
			for (int k=0;k<i-1;k++){

				if (currentX + tempX == this.getX(k) && currentY + tempY == this.getY(k)){
					tempX = 0;
					tempY = 0;

					//previous direction = 1
					if(previousDirection == 1){
						if(secondChoice==1){
							tempX += 1;
							tempDirection = 1;
						}//end if
						if(secondChoice == 2){
							tempY += -1;
							tempDirection = 2;
						}
						if(secondChoice == 3){
							tempY += 1;
							tempDirection = 4;
						}
					}

					//previous direction = 2
					if(previousDirection == 2){
						if(secondChoice==1){
							tempX += 1;
							tempDirection = 1;
						}//end if
						if(secondChoice == 2){
							tempY += -1;
							tempDirection = 2;
						}
						if(secondChoice == 3){
							tempX += -1;
							tempDirection = 3;
						}
					}
		
					//previous direction = 3
					if(previousDirection == 3){
						if(secondChoice==1){
							tempY += 1;
							tempDirection = 4;
						}//end if
						if(secondChoice == 2){
							tempY += -1;
							tempDirection = 2;
						}
						if(secondChoice == 3){
							tempX += -1;
							tempDirection = 3;
						}
					}

					//previous direction = 4
					if(previousDirection == 4){
						if(secondChoice==1){
							tempX += 1;
							tempDirection = 1;
						}//end if
						if(secondChoice == 2){
							tempY += 1;
							tempDirection = 4;
						}
						if(secondChoice == 3){
							tempX += -1;
							tempDirection = 3;
						}
					}

				}//test for dup

			}//end for k
			

			
			//final check for duplicate
			for (int l=0;l<i-1;l++){
				if (currentX + tempX == this.getX(l) && currentY + tempY == this.getY(l)){

					tempX = 0;
					tempY = 0;

					//previous direction = 1
					if(previousDirection == 1){
						if(thirdChoice==1){
							tempX += 1;
							tempDirection = 1;
						}//end if
						if(thirdChoice == 2){
							tempY += -1;
							tempDirection = 2;
						}
						if(thirdChoice == 3){
							tempY += 1;
							tempDirection = 4;
						}
					}

					//previous direction = 2
					if(previousDirection == 2){
						if(thirdChoice==1){
							tempX += 1;
							tempDirection = 1;
						}//end if
						if(thirdChoice == 2){
							tempY += -1;
							tempDirection = 2;
						}
						if(thirdChoice == 3){
							tempX += -1;
							tempDirection = 3;
						}
					}
		
					//previous direction = 3
					if(previousDirection == 3){
						if(thirdChoice==1){
							tempY += 1;
							tempDirection = 4;
						}//end if
						if(thirdChoice == 2){
							tempY += -1;
							tempDirection = 2;
						}
						if(thirdChoice == 3){
							tempX += -1;
							tempDirection = 3;
						}
					}

					//previous direction = 4
					if(previousDirection == 4){
						if(thirdChoice==1){
							tempX += 1;
							tempDirection = 1;
						}//end if
						if(thirdChoice == 2){
							tempY += 1;
							tempDirection = 4;
						}
						if(thirdChoice == 3){
							tempX += -1;
							tempDirection = 3;
						}
					}

				}//last test for dup

			}//end for l
			
			
			currentX = currentX +  tempX;
			currentY = currentY + tempY;
			previousDirection = tempDirection;
			this.setX(i,currentX);
			this.setY(i,currentY);

		}//end for i

	}//end random orientation

	public void produceValid(){

		boolean valid = false;

		while (valid != true){

			this.RandomOrientation();

			for (int i=0;i<this.getLength();i++){

				int currentX = this.getX(i);
				int currentY = this.getY(i);
			
				for (int j=1;j<this.getLength()-1;j++) {

					int xToCompare = this.getX(j);
					int yToCompare = this.getY(j);

					if (currentX==xToCompare && currentY == yToCompare){
						continue;
					}
					else {
						valid = true;
					}
				}//end for inner

			}//end for outer

		}//end while

	}//end produce valid


}//end Chromosome