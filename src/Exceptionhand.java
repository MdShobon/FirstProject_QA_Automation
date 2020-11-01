
public class Exceptionhand {

	public static void main(String[] args) {
		/*try
		{
		int a=5; b=0; result;
		
		result=a/b;
		
		System.out.println();
	}
		catch(Exception x)
		{
			System.out.println("Divide by zero out is: "x);
		}
		
		
	}

}
*/
		
		// try catch block
		//tell how to do you catch error within your script or specific method during the run times 
		//tell some of the steps you take in order to catch error or issue within your script?
		//tell some ways you debug your within your scripts 
		//tell the purpose of tty catch block?
		
		try {
			
	int a[]=new int[5];  //array out of out
	a[1]=6;    // array can go 0-10 maximum
	a[4]=20;
	a[10]=50;
	
	}
		catch(Exception X) {
			System.out.println(X);
		}
}
	}
