import java.util.Arrays;


public class ProteinFolderRunner {
	
	public static void main(String[] args) {

			//fitness?
			//initialize a 2 dimensional array
			int[][] mainArray = new int[64][200];

			//intialize a copy of the array
			int[][] copyArray = Arrays.copyOf(mainArray,mainArray.length);

			ProteinFolder proteinFolder = new ProteinFolder();
			proteinFolder.fillArray(mainArray);

			proteinFolder.printArray(mainArray);

	}//end main




}//end runner