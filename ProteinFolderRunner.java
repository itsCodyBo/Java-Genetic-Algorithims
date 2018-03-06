import java.util.Arrays;
import java.util.Random;


public class ProteinFolderRunner {
	
	public static void main(String[] args) {

		
		ProteinFolder myProteinFolder = new ProteinFolder();

		myProteinFolder.RandomOrientation();

		//myProteinFolder.printArray();
		
		//myProteinFolder.printAsXY();

		myProteinFolder.sortArray();

		myProteinFolder.printFitness();

	}//end main




}//end runner