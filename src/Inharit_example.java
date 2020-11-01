/*
class DemoHonda{   
	void ha1 () {
		System.out.println("Brand Name is Honda");
	}
}

class DemoHonda2 extends DemoHonda{  
	void ha2 () {   
		System.out.println("Model is Civic");
	}
}

class DemoHonda3 extends DemoHonda2{ 
	void ha3 () {
		System.out.println("Color is Red");
	}
}

class DemoHonda4 extends DemoHonda3{ 
	void ha4 () {
		System.out.println("Highest speed is 137 MPH");
	}
}

class DemoHonda5 extends DemoHonda4{ 
	void ha5 () {
		System.out.println("6.8 sec 0-60 MPH");
	}
}

class DemoHonda6 extends DemoHonda5{ 
	void ha6 () {
		System.out.println("Fast break");
	}
}



class DemoBmw{   
	void bm1 () {
		System.out.println("Brand Name is BMW");
	}
}

class DemoBmw2 extends DemoBmw{  
	void bm2 () {   
		System.out.println("Model is 3 Series");
	}
}

class DemoBmw3 extends DemoBmw2{ 
	void bm3 () {
		System.out.println("Color is Blue");
	}
}

class DemoBmw4 extends DemoBmw3{ 
	void bm4 () {
		System.out.println("Highest speed is 165 MPH");
	}
}

class DemoBmw5 extends DemoBmw4{ 
	void bm5 () {
		System.out.println("3.8 sec 0-60 MPH");
	}
}

class DemoBmw6 extends DemoBmw5{ 
	void bm6 () {
		System.out.println("Fast break");
	}
}




class DemoLexus{   
	void lx1 () {
		System.out.println("Brand Name is Lexus");
	}
}

class DemoLexus2 extends DemoLexus{  
	void lx2 () {   
		System.out.println("Model is RX 350");
	}
}

class DemoLexus3 extends DemoLexus2{ 
	void lx3 () {
		System.out.println("Color is BLACK");
	}
}

class DemoLexus4 extends DemoLexus3{ 
	void lx4 () {
		System.out.println("Highest speed is 150 MPH");
	}
}

class DemoLexus5 extends DemoLexus4{ 
	void lx5 () {
		System.out.println("5.8 sec 0-60 MPH");
	}
}

class DemoLexus6 extends DemoLexus5{ 
	void lx6 () {
		System.out.println("Hydraulic Brake");
	}
}




public class Inharit_example {

	public static void main(String[] args) {
		
		
		DemoHonda6 obj=new DemoHonda6();
		obj.ha1();
		obj.ha2();
		obj.ha3();
		obj.ha4();
		obj.ha5();
		obj.ha6();
	
	
		DemoBmw6 obj1=new DemoBmw6();
		
		obj1.bm1();
		obj1.bm2();
		obj1.bm3();
		obj1.bm4();
		obj1.bm5();
		obj1.bm6();

		DemoLexus6 obj2=new DemoLexus6();
		obj2.lx1();
		obj2.lx2();
		obj2.lx3();
		obj2.lx4();
		obj2.lx5();
		obj2.lx6();

		
	}

}
*/


// inharinace is  

class vehicle{
	void honda() {
		
		String Model= "Civic";
		int speed= 135;
		String colot= "Black";
		int brake= 4;
		
		System.out.println("The Brand is Honda car. "+"Model is: "+ Model+".Top Speed is: "+speed+".Color is: "+colot+".Total break is: "+brake);
		
	}
}



class bmw extends vehicle {
	void Bmw() {
		
		String Model= "3SERIES";
		int speed= 180;
		String colot= "Blue";
		int brake= 5;
		
		System.out.println("The Brand is BMW car. "+"Model is: "+ Model+".Top Speed is: "+speed+".Color is: "+colot+".Total break is: "+brake);		
	}
}



class lexus extends bmw {
	void Lexus() {
		
		String Model= "RX350";
		int speed= 200;
		String colot= "White";
		int brake= 5;
		
		System.out.println("The Brand is LEXUS car. "+"Model is: "+ Model+".Top Speed is: "+speed+".Color is: "+colot+".Total break is: "+brake);		
		
	}
}


class audi extends lexus {
	void Audi() {
	
		String Model= "A6";
		int speed= 220;
		String colot= "Sky Blue";
		int brake= 5;
		
		System.out.println("The Brand is audi car. "+"Model is: "+ Model+".Top Speed is: "+speed+".Color is: "+colot+".Total break is: "+brake);		
		
	}
}


					public class Inharit_example {
					
						public static void main(String[] args) {
					
					audi obj=new audi();
					obj.Lexus();
					obj.Bmw();
					obj.Lexus();
					obj.honda();
					
					

	

					
}
}
