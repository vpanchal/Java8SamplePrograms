package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

interface ShowNumber{
	void displayCount(int i, int x);
}

/*class ShowNumberImpl implements ShowNumber
{

	@Override
	public void displayCount(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Sum of both number: = " + (x + y));
		
	}
	
}
*/public class LamdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowNumber s;
		/*s = new ShowNumber() {
			
			@Override
			public void displayCount(int i, int x) {
				// TODO Auto-generated method stub
				//https://github.com/albanoj2/order-rest-backend.git
				
					System.out.println("Sum of both number: = " + ( i + x));
			}
		};*/
		
		String str = "Vimal";
		int h = str.hashCode();
		System.out.println(0x1F);
		System.out.println( (h << 7) - h + (h >>> 9) + (h >>> 17));
		s = (i, x) -> System.out.println("Sum of both number: = " + (i + x));
		s.displayCount(6, 6);
		
		List<Integer> obje = Arrays.asList(4,5,6,7,8,9,0,10);
	/*	Consumer<Integer> con = new Consumer<Integer>() {
			
			@Override
			public void accept(Integer arg0) {
				// TODO Auto-generated method stub
				System.out.println(" Number is  = "+arg0);
			}	
		};*/
		obje.forEach(con -> System.out.println(" Number is  = "+ con));
		
		Stream<Integer> st = obje.stream();
		st.forEach(System.out::println);

	}

}
