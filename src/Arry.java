
public class Arry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	int[] val= {10, 20, 30, 40, 100};
				                    //dynamic    three type of array in java single . 2d and 3d array
		for(int i=0;i<val.length;i++){
			System.out.println(val[i]);
		}

	}

}  */
		
		/*  int [] val = new int[4];   //2d dimention
		val[0]=10;
		val[1]=20;
		val[2]=30;
		val[3]=40;
		for(int i=0;i<val.length;i++) {
			System.out.println(val[i]);
		}
	}
}
		*/
		
		
		
		int[] [] value= {{10, 20, 30}, {60, 70, 80}, {100, 110, 120}};
		for(int i=0;i<value.length;i++){
			for (int j=0;j<value.length;j++) {
				System.out.println(value[i][j]+"  ");
			}
		}
	}
}