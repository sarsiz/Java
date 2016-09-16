package basic_java;

class Box{
	double width;
	double height;
	double depth;
	
	//construct clone of an object
	Box(Box ob){
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}
	
	//constructor used when all dimensions are specified
	Box(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}
	
	//constructor used when no dimensions are specified
	Box(){
		width = -1;  // -1 to indicate uninitiated box
		height = -1;
		depth = -1;
	}
	
	//constructor used when cube is created
	Box(double len){
		width = height = depth = len;
	}
	
	//compute and return volume
	double volume(){
		return width*height*depth;
	}
}

//BoxWight now fully implements all constructors
class BoxWeight extends Box{
	double weight;  //weight of box
	
	//construct clone of an object
	BoxWeight(BoxWeight ob){  //pass object to constructor
		super(ob);  //we are doing this because we want to access the weight of the box
		// and calling the ob of superclass to do that
		weight = ob.weight;
	}
	
	//constructor when all parameters are specified
	BoxWeight(double w, double h, double d, double m){
		super(w,h,d); //call superclass constructor
		weight = m;
	}
	
	//default constructor
	BoxWeight() {
		super();
		weight = -1;
	}
	
	//constructor used when cube is created
	BoxWeight(double len, double m){
		super(len);
		weight = m;
	}
}

public class Inherit_box_weight {
	
	public static void main(String[] args) {
		BoxWeight myBox1 = new BoxWeight(10,20,15,34.3);
		BoxWeight myBox2 = new BoxWeight(2,3,4,0.076);
		BoxWeight myBox3 = new BoxWeight(); //default
		BoxWeight myCube = new BoxWeight(3, 2);
		BoxWeight myClone = new BoxWeight(myBox1);
		double vol;
		
		vol = myBox1.volume();
		System.out.println("Volume of myBox1 is : " + vol);
		System.out.println("Weight of myBox1 is : " + myBox1.weight);
		System.out.println();
		
		vol = myBox2.volume();
		System.out.println("Volume of myBox2 is : " + vol);
		System.out.println("Weight of myBox2 is : " + myBox2.weight);
		System.out.println();
		
		vol = myBox3.volume();
		System.out.println("Volume of myBox3 is : " + vol);
		System.out.println("Weight of myBox3 is : " + myBox3.weight);
		System.out.println();
		
		vol = myClone.volume();
		System.out.println("Volume of myClone is : " + vol);
		System.out.println("Weight of myClone is : " + myClone.weight);
		System.out.println();
		
		vol = myCube.volume();
		System.out.println("Volume of myCube is : " + vol);
		System.out.println("Weight of myCube is : " + myCube.weight);
		System.out.println();
		
	}

}
