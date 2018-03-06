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

		for (int i=0;i<population.length;i++){
			population[i].RandomOrientation();
		}

	}//end RandomOrientation

	//this method prints our array as X,Y pairs and also returns a duplicate count of the string. Purely for visual purposes
	public void printArray(){

		for (int i=0;i<1;i++){

			for (int j=0;j<population[i].getLength();j++){

				System.out.println("X" + j + ": " + population[i].getX(j) + " " + "Y"+ j + ": " + population[i].getY(j));
				System.out.println();

			}//end j

			System.out.println("The duplicate count is: " + population[i].duplicateCheck());
			System.out.println("The fitness is " + population[i].computeFitness());
			//population[i].computeFitness();

		}//end i

	}//end printArray
 	

}//end ProteinFolder