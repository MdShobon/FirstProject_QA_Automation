class demo{   //Father or Mother   or grand father
	void m1 () {
		System.out.println("Manual Testing");
	}
}  //Single Inheritance
//Multi Level Inheritance
//Hierarchical Inheritance
//Hybrid Inheritance
//Multipath inheritance
//Multiple Inheritance

class demo2 extends demo{  //child-1  or father
	void m2 () {   // i can use public void or only void 
		System.out.println("Automation Test");
	}
}

class demo3 extends demo2{  //child-2 or son
	void m3 () {
		System.out.println("Java Selenium");
	}
}  // extends is a word syntex of inharitence 


//purpose or use it - car or different company for different characetiest // car is grand father honda is a father and civic is a song


public class inherit {

	public static void main(String[] args) {
		demo3 obj=new demo3();
		obj.m1();
		obj.m2();
		obj.m3();

	}

}






