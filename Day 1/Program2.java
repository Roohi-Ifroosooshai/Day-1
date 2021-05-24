import java.util.*;

class Rectangle
{
  static String input;
  Rectangle(String input)
  {
	this.input=input;
   }
   static void display()
   {
	System.out.println("This is "+input);
  }

}


class Circle
{
  static String input;
  Circle(String input)
  {
	this.input=input;
   }
   static void display()
   {
	System.out.println("This is "+input);
  }

}

class Square
{
  static String input;
  Square(String input)
  {
	this.input=input;
   }
   static void display()
   {
	System.out.println("This is "+input);
  }

}

public class Program2
{
	public static void main(String[] args) {
	    System.out.println("Ener input shape: "); 
		Scanner sr=new Scanner(System.in);
		String input=sr.next();
		Rectangle r = new Rectangle(input);
		Circle c = new Circle(input);
		Square s = new Square(input);
		
		if (input.toLowerCase() == "rectangle")
		    Rectangle.display();
		else if (input.toLowerCase() == "circle")
		    Circle.display();
		else 
		    Square.display();
	}
}


