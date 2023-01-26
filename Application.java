/*
 * This class uses Square & ArrayFun classes to create a Square Array and
 * put to use all methods programmed in both classes.
 * 
 * @author Chris Myhre
 * @version 0.2
 * Practice lab working with constructors and classes.
 * Spring 2023
*/
public class Application {

	public static void main(String[] args) {
		/*
		 * Below is all methods from the Square & ArrayFun classes being tested in this application.
		 */
		ArrayFun array = new ArrayFun();
		array.forward();
		array.backward();
		array.sum();
		Square s = new Square();
		array.setArrayItem(4, s);
		array.getArrayItem(4);
		array.forward();
		array.sum();
		s.setSide(19);
		s.getSide();
		s.area();
		array.setArrayItem(0,s);
		array.forward();
		array.sum();
	}
}
