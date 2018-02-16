import java.util.Arrays;

public class ProteinFolder {
	


	public void fillArray (int[][] arrayToFill) {

		for (int i = 0; i < arrayToFill.length; i++) {

   			for (int j = 0; j < arrayToFill[i].length; j++) {

   				if (Math.random() < 0.5) {

					arrayToFill[i][j] = 0;

				}//end if

				else {

					arrayToFill[i][j] = -1;
				
				}//end else

    		}//end inner for

		}//end outer for

	}//end fillArray

	public void printArray(int[][] arrayToPrint){
		for (int i=0; i<arrayToPrint.length; i++) {
			for (int j=0;j<arrayToPrint.length;j++){
				System.out.printf("%5d ", arrayToPrint[i][j]);
			}
			System.out.println();
		}
	}//end printArray


}//end ProteinFolder