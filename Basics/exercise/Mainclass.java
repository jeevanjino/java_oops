/*Create a class with a method that prints "This is parent class" and its subclass with another method that prints "This is child class". Now, create an object for each of the class and call
1 - method of parent class by object of parent class
2 - method of child class by object of child class
3 - method of parent class by object of child class */
package exercise;
class Pclass{
	public void pmethod()
	{
	 System.out.println("parent class");
 }
}

class Cclass extends Pclass
{
	public void  cmethod()
	{
	 System.out.println("child class");
 }
}
	
	public class Mainclass {

	public static void main(String[] args) {
		Pclass a=new Pclass();
		Cclass b=new Cclass();
		a.pmethod();
		b.cmethod();
		a.pmethod();

	}

}
