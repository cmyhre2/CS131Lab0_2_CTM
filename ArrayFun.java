/*
 * This class is a cookie cutter for all Arrays used in the Application class
 * 
 * @author Chris Myhre
 * @version 0.2
 * Practice lab working with arrays & classes.
 * Spring 2023
*/
public class ArrayFun {
	private Square [] myArray = new Square[6]; //myArray is the array that will hold square objects.
	private double sum; //holds the sum of all squares' areas when sum() is called upon.
	
	/*
	 * @param index the value index specifies the element in the square array to replace
	 * @param s the value s is a square that will replace the square in the spot array[index]
	 */
	public void setArrayItem(int index, Square s) {
		myArray[index]=s;
	}//end setArrayItem
	
	/*
	 * @param index the value of index passed into calling method
	 * Gets & prints Square side & area info
	 */
	public void getArrayItem(int index) {
		System.out.printf("\nSquare " + index + " Side Length: " + myArray[index].getSide());
		System.out.printf("\nSquare " + index + " Area: " + myArray[index].area());
	}//end getArrayItem
	
	/*
	 * The empty-argument constructor initializes all instance variables
	 */
	public ArrayFun() {
		for(int i = 0; i<6; i++) {
			myArray[i] = new Square(i);
		}
	}//end default constructor
		
		/*
		 * Prints the array of squares in order
		 */
	public void forward(){
		for(int i=0; i<6; i++) {
			System.out.printf("\nSquare " + i + " Area: " + myArray[i].area());
		}
	}//end forward
			
		/*
		 * Prints the array in backward order
		 */
	public void backward(){
		for(int i=5; i>-1; i--) {
			System.out.printf("\nSquare " + i + " Area: " + myArray[i].area());	
		}
	}//end backward
		
	/*
	 * Calculates & prints the sum of areas of the square array.
	 */
	public void sum() {
		sum = 0;
		for(int i=0; i<6; i++) {
			sum = sum + myArray[i].area();
		}
		System.out.printf("\nSum of Areas of this Square Array: " + sum);
	}//end sum
}
