/*Create a class named 'Shape' with a method to print "This is This is shape".
 * Then create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, 
 * both having a method to print "This is rectangular shape"
 * and "This is circular shape" respectively. Create a subclass 
 *'Square' of 'Rectangle' having a method to print "Square is a rectangle".
 *Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square'
 *class.
 */


package exercise1;
 class Shape{
	 public void method() {
		 System.out.println("This is This is Shape");
	 }
	 
 }
class Rec extends Shape{
	public  void method1() {
		System.out.println("This is rectangular shape");
	}
}


class Sq extends Rec{
	public  void method3() {
		System.out.println("Square is a rectangle");
	}
	}




class cir extends Shape{
	public  void method2() {
		System.out.println("This is circular shape");
	
}
	
	
}

public class pro {

	public static void main(String[] args) {
		Sq d=new Sq();
		d.method();
		d.method1();

	}

}
