
public class Methodload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//if you have the same action or class with different values 
		//or a process of multiple  method under a class . method main will be the same but parameter will be different. 

		System.out.println(Add(5, 10));
		System.out.println(Add(2.5, 10.65));
		System.out.println(Add("name: ", "Automation"));
		
		
	}
	
	
	public static int Add(int a, int b) {
		return(a+b);
	}
	public static double Add(double a, double b) {
		return(a+b);
	}
	public static String Add(String a, String b) {
		return(a+b);
	}
	
}


