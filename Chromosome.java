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
		boolean valid = false;

		while (valid != true) {
			valid = true;
			//for every new chromosome, set the first two values as 0,0 and 0,1
			this.setX(1,1);
			this.setY(1,0);


			//used to choose a new path
			Random rn = new Random();

			int currentX=1;
			int currentY=0;

			int previousDirection = 1;

			//for each row
			for (int i=2;i<getLength();i++){

				int tempX=0;
				int tempY=0;

				//previousDirection = 1;
				int firstChoice = rn.nextInt(3)+1;
				int secondChoice = 6 - firstChoice;
				int thirdChoice = 6 - firstChoice - secondChoice;
				int count = 0;
				int original = previousDirection;
				int choice = firstChoice;

				if (count == 0) {
					choice = firstChoice;
				}
				if (count == 1){
					tempX = 0;
					tempY = 0;
					previousDirection = original;
					choice = secondChoice;
				}
				if (count == 2) {
					tempX = 0;
					tempY = 0;
					previousDirection = original;
					choice = thirdChoice;
				}

				//first choice no while loop
				if (previousDirection == 1){	
					if (choice == 1) {
						tempX += 1;
						previousDirection = 1;
					}
					else if (choice==2){
						tempY += -1;
						previousDirection = 2;
					}
					else if(choice == 3) {
						tempY += 1;
						previousDirection = 4;
					}
				}//end first if

				else if (previousDirection == 2) {
					if(choice == 1){
						tempX += -1;
						previousDirection = 3;
					}
					else if(choice == 2){
						tempX+= 1;
						previousDirection = 1;
					}
					else if(choice == 3){
						tempY += -1;
						previousDirection = 2;
					}
				}

				else if (previousDirection ==3 ) {
					if (choice == 1){
						tempX += -1;
					}
					else if(choice == 2){
						tempY += -1;
						previousDirection = 2;
					}
					else if (choice == 3){
						tempY += 1;
						previousDirection = 4;
					}
				}

				else if (previousDirection == 4) {
					if(choice==1){
						tempX += 1;
						previousDirection = 1;
					}
					else if (choice==2){
						tempX += -1;
						previousDirection = 3;
					}
					else if (choice == 3){
						tempY += 1;
						previousDirection = 4;
					}
				}
				else {
					//System.out.println("ERROR PICKING");
				}

				/*
				//first check for duplicate
				for (int j=i+1;j<i-1;j++){
					if (currentX + tempX == this.getX(j) && currentY + tempY == this.getY(j)){
						//System.out.println("FOUND CONFLICTING POINTS!");
						valid = false;
					}
				}//end for		
				*/


				currentX += tempX;
				currentY += tempY;

				this.setX(i,currentX);
				this.setY(i,currentY);


			}//end for i

			if (this.duplicateCheck()>0){
				valid = false;
			}

		}//end while

	}//end random orientation

	//a method to check for duplicates and return a count
	public int duplicateCheck(){
		
		int count =0;

		for (int i=0;i<this.getLength()-1;i++){
			int currentX = this.getX(i);
			int currentY = this.getY(i);

			for (int j=i+1;j<this.getLength()-2;j++){

				int xToCompare = this.getX(j);
				int yToCompare = this.getY(j);

				if (currentX==xToCompare && currentY ==yToCompare){
					count++;
				}
			}//end for j
		
		}//end for i
		
		return count;

	}

	//a method to check for duplicates and return a count
	public int computeFitness(){
		
		int count =0;

		for (int i=0;i<this.getLength();i++){
			int currentX = this.getX(i);
			int currentY = this.getY(i);

			for (int j=i+2;j<this.getLength()-2;j++){

				int xToCompare = this.getX(j);
				int yToCompare = this.getY(j);

				if (currentX==xToCompare+1 && currentY ==yToCompare){
					count++;
				}
				if (currentX==xToCompare-1 && currentY ==yToCompare){
					count++;
				}
				if (currentX==xToCompare && currentY ==yToCompare+1){
					count++;
				}
				if (currentX==xToCompare+1 && currentY ==yToCompare-1){
					count++;
				}

			}//end for j
		
		}//end for i
		
		return count;

	}


}//end Chromosome