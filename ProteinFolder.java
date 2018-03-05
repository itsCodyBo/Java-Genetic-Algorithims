import java.util.Arrays;
import java.util.Random;

public class ProteinFolder {

	//this will represent our population
	Chromosome[] population = new Chromosome[200];
	//object to produce randoms when needed
	Random rn = new Random();

	public ProteinFolder(){

		//our constructor simply makes an instance of a chromosome in each of our 200 N
		for (int i=0;i<population.length; i++){

			population[i] = new Chromosome();

		}//end for
	}//end constructor

	//start RandomOrientation
	public void RandomOrientation(){

		/*
		//this says "for each chromosome in the population"
		for (int i = 0; i<population.length;i++) {

			int currentX=1;
			int currentY=0;
			int previousDirection = 1;
			int tempX=1;
			int tempY=0;
			int tempDirection=previousDirection;

			//set first two values
			population[i].setX(1, currentX);
			population[i].setY(1, currentY);

			//this says for each row in the population's chromosome, starting at the third position
			for (int j = 2;j<population[i].getLength(); j++) {

				int firstChoice = rn.nextInt(3)+1;
				int nextChoice = 5 - firstChoice;
				int finalChoice = 5 - firstChoice - nextChoice;
				
				//pick a new direction based off of previous direction
				if (previousDirection == 1) {
					if(firstChoice == 1){
						tempX += 1;
						tempDirection = 1;
					}
					if (firstChoice == 2){
						tempY += -1;
						tempDirection = 2;
					}	
					if (firstChoice == 3){
						tempY += 1;
						tempDirection = 4;
					}
				}//end case 1

				else if (previousDirection ==2){
					if(firstChoice == 1){
						tempX += 1;
						tempDirection = 1;
					}
					if (firstChoice == 2) {
						tempY += -1;
						tempDirection = 2;
					}
					if (firstChoice == 3){
						tempY += -1;
						tempDirection = 3;
					}
				}//end case 2

				else if (previousDirection == 3){
					if (firstChoice == 1) {
						tempY += 1;
						tempDirection = 4;
					}
					if (firstChoice == 2) { 
						tempY += -1;
						tempDirection = 2;
					}					
					//to go left again
					if (firstChoice == 3)  {
						tempX += -1;
						tempDirection = 3;
					}
				}//end case 3

				else if (previousDirection == 4) {
					if (firstChoice == 1) {
						tempX += 1;
						tempDirection = 1;
					}
					if (firstChoice == 2) {
						tempX += -1;
						tempDirection = 3;
					}
					if (firstChoice == 3) {
						tempY += 1;
						tempDirection = 4;
					}
				}//end case 4

				for (int k=0;k<j-1;k++){
			
					if (population[i].getX(k)==tempX && population[i].getY(k)==tempY){
					
						tempX = currentX;
						tempY = currentY;

						//pick a new direction based off of previous direction
						if (previousDirection == 1) {
							if(nextChoice == 1) {
								tempX += 1;
								tempDirection = 1;
							}
							if (nextChoice == 2) {
								tempY += -1;
								tempDirection = 2;
							}
							if (nextChoice == 3) {
								tempY += 1;
								tempDirection = 4;
							}
						}//end case 1

						else if (previousDirection ==2){
							if(nextChoice == 1) {
								tempX += 1;
								tempDirection = 1;
							}
							if (nextChoice == 2) {
								tempY += -1;
								tempDirection = 2;
							}
							if (nextChoice == 3) {
								tempY += -1;
								tempDirection = 3;
							}
						}//end case 2

						else if (previousDirection == 3){
							if (nextChoice == 1) {
								tempY += 1;
								tempDirection = 4;
							}
							if (nextChoice == 2) {
								tempY += -1;
								tempDirection = 2;
							}					
							//to go left again
							if (nextChoice == 3) {
								tempX += -1;
								tempDirection = 3;
							}
						}//end case 3

						else if (previousDirection == 4) {
							if (nextChoice == 1) 
								tempX += 1;
								tempDirection = 1;
							if (nextChoice == 2) 
								tempX += -1;
								tempDirection = 3;
							if (nextChoice == 3) 
								tempY += 1;
								tempDirection = 4;
						}//end case 4
					
					}//end if 

					
					for (int l=0;l<j-1;l++){
			
						if (population[i].getX(l)==tempX && population[i].getY(l)==tempY){
					
							tempX = currentX;
							tempY = currentY;

							//pick a new direction based off of previous direction
							if (previousDirection == 1) {
								if(finalChoice == 1) {
									tempX += 1;
									tempDirection = 1;
								}
								if (finalChoice == 2) {
									tempY += -1;
									tempDirection = 2;
								}
								if (finalChoice == 3) {
									tempY += 1;
									tempDirection = 4;
								}
							}//end case 1

							else if (previousDirection ==2){
								if(finalChoice == 1) {
									tempX += 1;
									tempDirection = 1;
								}
								if (finalChoice == 2) {
									tempY += -1;
									tempDirection = 2;
								}
								if (finalChoice == 3) {
									tempY += -1;
									tempDirection = 3;
								}
							}//end case 2

							else if (previousDirection == 3){
								if (finalChoice == 1) {
									tempY += 1;
									tempDirection = 4;
								}
								if (finalChoice == 2) {
									tempY += -1;
									tempDirection = 2;
								}					
								//to go left again
								if (finalChoice == 3) {
									tempX += -1;
									tempDirection = 3;
								}
							}//end case 3

							else if (previousDirection == 4) {
								if (finalChoice == 1) 
									tempX += 1;
									tempDirection = 1;
								if (finalChoice == 2) 
									tempX += -1;
									tempDirection = 3;
								if (finalChoice == 3) 
									tempY += 1;
									tempDirection = 4;
							}//end case 4
					
						}//end if 

					}//end l loop
					
				}//end k loop

				currentX = tempX;
				currentY = tempY;
				previousDirection = tempDirection;
				population[i].setX(j,currentX);
				population[i].setY(j,currentY);	

			}//end int j loop	

		}//end i for loop
		*/

		for (int i=0;i<population.length;i++){
			population[i].produceValid();
		}

	}//end RandomOrientation

	public void printArray(){

		for (int i=0;i<1;i++){

			for (int j=0;j<population[i].getLength();j++){

				System.out.println("X" + j + ": " + population[i].getX(j) + " " + "Y"+ j + ": " + population[i].getY(j));
				System.out.println();

			}

		}

	}//end printArray
 	

}//end ProteinFolder