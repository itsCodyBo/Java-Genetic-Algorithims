import java.util.Random;
import java.util.Arrays;

public class HillClimber {


	public void buildArray(int[] inputArray){
		
		for (int i=0; i<inputArray.length; i++){
			if (Math.random() < 0.5) {
				
			inputArray[i] = 0;
			}
			else {
				inputArray[i] = 1;
			}

		}//end for

		//System.out.println("Sequence is: ");

		//System.out.println(Arrays.toString(inputArray));

	}//end build array

	public int countV (int[] inputArray){
		int count = 0;
		for (int i=0;i<inputArray.length;i++){
			if (inputArray[i]==1){
				count = count + 1;
			}
			else{
				continue;
			}//end else
		}//end for
		//System.out.println("The count is " + count);
		return count;
	}//end countV

	public int getFitness(int[] inputArray) {

		int count = countV(inputArray);
		int fitness = 12 * count - 160;
		int ABSfitness = Math.abs(fitness);
		
		//System.out.println("The fitness is " + ABSfitness);			
		return ABSfitness;
	
	}//end getFitness

	public void changeBit (int[] inputArray) {

		Random rn = new Random();
		int bitToChange = rn.nextInt(40);

		if(inputArray[bitToChange] == 1){
			inputArray[bitToChange] = 0;
		}
		else {
			inputArray[bitToChange] = 1;
		}

	}//end change bit




}//end HillClimber class