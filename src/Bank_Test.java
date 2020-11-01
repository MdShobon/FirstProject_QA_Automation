
public class Bank_Test {   //method overwriting prety much is the same 
	
	//must have the same class nhame as the parent class
	//must have the same parameters as the parent class
	//method overwriting has direct correlation with inheritance and polymorphism
	//method overwring is used duringruntime polymorphysim

	public static void main(String[] args) {
		
		Bank_ABC abc = new Bank_ABC();
		Bank_EFG efg = new Bank_EFG();
		Bank_GHI ghi = new Bank_GHI();
		
		System.out.println("Bank_ABC Interest Rate: "+abc.getInterestRate());
		System.out.println("Bank_EFG Interest Rate: "+efg.getInterestRate());
		System.out.println("Bank_GHI Interest Rate: "+ghi.getInterestRate());

	}

}



//over writing has to have return value thats way we use intianl 0 for method over writing 