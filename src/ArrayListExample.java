import java.util.ArrayList;
import java.util.List;


//Arrylist
public class ArrayListExample {

	public static void main(String[] args) {
		
		List<String> val=new ArrayList<>();  // list then use java.util then array list use array list all the way bottom u will find 
		val.add("TV");
		val.add("Ia");
		val.add("Awesome");
		
		for (int i=0;i<val.size();i++) {
			System.out.println(val.get(i));
		}
		

	}

}
