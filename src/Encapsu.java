//Encapsulations set and get method 
class Encapsulations{  //Subclass/Child Class
	//Abstract class where hide the data in Getter and Setter Method 
	//This class does not have any method
	private int ssn;
	private String Name;
	private int Age;
	private int ZipCode;
	
	public int getSSN() {
		return ssn;
	}
	public String getName() {
		return Name;
	}
	public int getAge() {
		return Age;
	}
	public int getZipCode() {
		return ZipCode;
	}
	
	public void SetSSN(int newValue) {
		ssn = newValue;
	}
	
	public void SetName(String newValue) {
		Name = newValue;
	}
	
	public void SetAge(int newValue) {
		Age = newValue;
	}

	public void SetZipCode(int newValue) {
		ZipCode = newValue;
	}
}




public class Encapsu { //parent class 

	public static void main(String[] args) {
		
		Encapsulations obj = new Encapsulations();  // reason creating a new object
		//absorber the data from the Abstract class and passing it one by one this Method i can also extend the data 
		obj.SetName("Prosmart");
		obj.SetSSN(111111);
		obj.SetAge(50);
		obj.SetZipCode(11417);
		
		System.out.println("Employee name: "+obj.getName());
		System.out.println("Employee SSN: "+obj.getSSN());
		System.out.println("Employee Age: "+obj.getAge());
		System.out.println("Employee ZipCode: "+obj.getZipCode());
		
	}
}


