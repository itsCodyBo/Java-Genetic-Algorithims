import java.util.Random;
import java.util.Arrays;


public class HillClimberRunner {
	


	public static void main(String[] args){

		//START FIRST SEQUENCE BUILD
		int[] firstSequence = new int[40];
		int[] secondSequence;
		HillClimber myClimber = new HillClimber();
		myClimber.buildArray(firstSequence);




		for (int i = 0; i<100; i++){

			secondSequence = Arrays.copyOf(firstSequence,firstSequence.length);

			//change bit in second sequence
			myClimber.changeBit(secondSequence);


			System.out.println("The first count is " + myClimber.countV(firstSequence));
			int firstFitness = myClimber.getFitness(firstSequence);
			System.out.println("The first fitness is " + firstFitness);
			System.out.println();
			
			System.out.println("The second count is " + myClimber.countV(secondSequence));
			int secondFitness = myClimber.getFitness(secondSequence);
			System.out.println("The second fitness is " + secondFitness);
			System.out.println();

			
			if (secondFitness > firstFitness){
				System.out.println();
				System.out.println("The SECOND sequence is greater with a fitness of " + secondFitness);
				firstSequence = Arrays.copyOf(secondSequence, secondSequence.length);
			}
			else {
				System.out.println();
				firstSequence = Arrays.copyOf(firstSequence,firstSequence.length);
				System.out.println("The FIRST sequence is greater with a fitness of " + firstFitness);

			}
			


		}//end for



	}//end main


}