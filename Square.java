/*
 * This class is the cookie cutter for all Square objects created
 * with this class.
 * 
 * @author Chris Myhre
 * @version 0.2
 * Practice lab working with constructors and classes.
 * Spring 2023
*/
public class Square {

	private double side; //Variable for the side length of a square.
	
	/*
	 *  The empty-argument constructor initializes all instance variables
	 */
	public Square(){
		side = 0.0;
	}//end default Square constructor
	
	/*
	 * @param l the value of l sent into preferred constructor
	 * Sets side length of the new Square to l
	 */
	public Square(int l) {
		side = l;
	}
	
	/*
	 *  @param s the value of s sent into setSide calling method
	 */
	public void setSide(double l) {
		side=l;
	}//end setSide
	
	/*
	 *  @return the side length of Square s
	 */
	public double getSide() {
		return side;
	}//end getSide
	
	/*
	 *  @return the area of Square s
	 */
		public double area(){
			return Math.pow(side,2);
		}//end area
}
