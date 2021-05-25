

import java.util.*;

 interface Shape {
   void display();
}

class Rectangle implements Shape {

   public void display() {
      System.out.println("This is Rectangle.");
   }
}

class Square implements Shape {

   public void display() {
      System.out.println("This is Square.");
   }
}

class Circle implements Shape {

   public void display() {
      System.out.println("This is Circle.");
   }
}

class ShapeFactory {
    
   public Shape getShape(String shape){
       
      if(shape == null){
         return null;
      }		
      if(shape.equalsIgnoreCase("Circle")){
         return new Circle();
         
      } else if(shape.equalsIgnoreCase("Rectangle")){
         return new Rectangle();
         
      } else if(shape.equalsIgnoreCase("Square")){
         return new Square();
      }
      return null;
   }
}


public class Program2 {

   public static void main(String[] args) {
       
      ShapeFactory shapeFactory = new ShapeFactory();
      
      System.out.println("Ener input shape: "); 
		Scanner sr=new Scanner(System.in);
		String input=sr.next();
      
      Shape shape = shapeFactory.getShape(input);
      
        if(shape.equals("CIRCLE"))
            shape.display();
        else if(shape.equals("RECTANGLE"))
            shape.display();
        else
            shape.display();
   }
}


