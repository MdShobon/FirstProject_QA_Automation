
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Printing a string "Hello World"
		
		System.out.println("Hello World");
		
		// static = acting as a global  intiator for you
		//int - data type
		//num1 = variable 
		//2 is assingng value of the variable 
		// sum = is a variable 
		
		int num1 = 2, num2 = 5, sum;   // this is one of example of local variable 
		
		sum = num1+num2;
		
		System.out.println("Total: "+sum);
		
		
		// three type of variable in java programming language 
		// local  variable , instance variable, static variable 
		// local variable - which is use inside the class like sum1 and sum2. can be accessed within the instance of a class. lcoal is lcoal variable
		//static variable will not change stays the same it can be out side of the method 
		//but not out side of the class. static is a global variable, shared among instances of a class
		

	// one of example int is a static variable where using globally 

	int num3 = 5, num4 = 8, total; // this is one of example of local variable ( local variable you can not reuse it but value i can change it 
	
	total = num3-num4;
	System.out.println("Total: "+total);
	
			
}
	
}


