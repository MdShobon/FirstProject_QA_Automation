
class Myconstructor{   //constructor method
	
	// will not have return value an will be the same class name 
	Myconstructor(String s) {
	
		System.out.println(s);
	}
	Myconstructor(int a) {
		System.out.println(a);
	}
	Myconstructor(int x, int y){
		System.out.println(x+y);
	}
	Myconstructor(double z){
		System.out.println(z);
	}
}




public class ConstrMet {

	public static void main(String[] args) {
		
		Myconstructor obj1 = new Myconstructor("Java Selenium");
		Myconstructor obj2 = new Myconstructor (1000);
		Myconstructor obj3 = new Myconstructor(10, 20);
		Myconstructor obj4 = new Myconstructor (2.5);
		

	}

}
