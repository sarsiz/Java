package basic_java;

class A{
	int i,j;
	
	void showij(){
		System.out.println("i is " + i + " and j is " + j);
	}
}

class B extends A{
	int k;
	
	void showk(){
		System.out.println("k is " + k);
	}
	
	void sum(){
		System.out.println("i+j+k is : " + (i+j+k) + " and i is " + i + " and j is " + j);
	}
}

public class Inhertitance_practise {

	public static void main(String[] args) {
		A superOb = new A();
		B subOb = new B();
		
		superOb.i = 10;
		superOb.j = 20;
		System.out.println("Contents of the superOb");
		subOb.showij();
		superOb.showij();
		
		subOb.k = 40;
		System.out.println("Contents of the subOb");
		subOb.showk();
		subOb.i = 1;
		subOb.j = 2;
		
		System.out.println("Sum of i,j,k ");
		subOb.sum();
	}

}





/*class Shape {
    public double area ()
    {
        return 0;     // Since this is just a generic "Shape" we will assume the area as zero.
                    // The actual area of a shape must be overridden by a subclass, as we see below.
                    // You will learn later that there is a way to force a subclass to override a method,
                    // but for this simple example we will ignore that.
    }
}


class Circle extends Shape {                    // class declaration
    Circle (double diameter) {                  // constructor
        this.diameter = diameter;
    }
    private static final double PI = Math.PI;   // constant
    private double diameter;                    // instance variable
    
    public double area () {                     // dynamic method
        double radius = diameter / 2.0;
        return PI * radius * radius;
    }

}


class Rectangle extends Shape {
    // Your code goes here

}


public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle (2.5);
        Shape s2 = new Rectangle (5.0, 4.0);
        
        System.out.println (s1.area());
        System.out.println (s2.area());
    }
}
*/