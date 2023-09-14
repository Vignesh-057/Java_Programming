package Methods;

class Box {
	int len;
	int breadth;
	int height;
    
	Box(int l, int b, int h){ //constructor
		len = l;
		breadth = b;
	    height = h;
	}
	void setDim(int l, int b, int h) {
		len = l;
		this.breadth = b;
		this.height = h;
	}
	
	int volume() {
		return len * breadth * height;
	}

}

public class DemoConstructor {
	public static void main(String arg[]) {
	Box woodenBox = new Box(12,23,2);
	
	woodenBox.setDim(12, 23, 34);
	
    System.out.println("vol of woodenBox "+woodenBox.volume());
    
    Box blackBox = new Box(12,45,6);
//    blackBox.len= 12;
//    blackBox.breadth= 12;
//    blackBox.height= 12;
    System.out.println("vol of blackBox "+blackBox.volume());///invoke
    }

}
