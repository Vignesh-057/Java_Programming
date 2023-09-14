package Methods;


class Boxx {
	int len;
	int breadth;
	int height;

	int volume() {
		return len * breadth * height;
	}

}

public class InokeMethod {
	public static void main(String arg[]) {
	Boxx woodenBoxx = new Boxx();
	woodenBoxx.len = 100;
	woodenBoxx.breadth = 12;
	woodenBoxx.height=12;
	
    System.out.println("vol of woodenBoxx "+woodenBoxx.volume());//invoke
    
    Boxx blackBoxx = new Boxx();
    blackBoxx.len= 12;
    blackBoxx.breadth= 12;
    blackBoxx.height= 12;
    System.out.println("vol of blackBoxx "+blackBoxx.volume());///invoke
    }

}
