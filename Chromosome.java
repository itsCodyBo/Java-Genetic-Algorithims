public class Chromosome {
	

	int[] x = new int[64];
	int[] y = new int[64];

	public void Chromosome(){
		//first two should always be 0,0 and 0,1
		x[0] = 0;
		x[1] = 0;
		y[0] = 0;
		y[1] = 1;
		
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





}//end Chromosome