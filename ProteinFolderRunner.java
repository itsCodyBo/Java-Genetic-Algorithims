import java.util.Arrays;


public class ProteinFolderRunner {
	
	public static void main(String[] args) {

		int[][][] population = new int[200][64][2];

		System.out.println("Number of Subjects: " + population.length);

		System.out.println("Number of Rows: " + population[1].length);

		System.out.println("Number of Columns: " + population[1][1].length);

		int rand = (int) (Math.random() * 4) + 1;
		System.out.println(rand);

	}//end main




}//end runner