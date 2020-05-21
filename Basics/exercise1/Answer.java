/*Create a class named 'Rectangle' with two data members 'length' and 'breadth'
and two methods to print the area and perimeter of the rectangle respectively.
Its constructor having parameters for length and breadth is used to initialize 
length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' 
class with its constructor having a parameter for its side (suppose s) calling 
the constructor of its parent class as 'super(s,s)'. Print the area and perimeter
of a rectangle and a square.*/





package exercise1;

 class Rectangle {
	int length,breadth;
	public void area()
	{
		System.out.println(length*breadth);
	}
	public void perimeter() {
		System.out.println( 2*(length+breadth));
		
	}
	
	public Rectangle(int length ,int breadth) {
		this.length =length;
		this .breadth=breadth;
		
	}
}
	class Square extends Rectangle{
	 int side;
		public Square(int s)
		{
			super(s,s);
			
		}
		
		 }
public class Answer{
	public static void main(String[] args) {
		Rectangle a=new Rectangle (2,3);
		a.area();
		a.perimeter();
		Square b=new Square(6);
		b.area();
		b.perimeter();
		

	}

}
