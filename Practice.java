package stream;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Practice {

	
	public static void main(String[] args) {
		 String s="ABC";
		int a=123;
		int x=0;
		
		while(a>0) {
			int rem=a%10;
			 x=x*10+rem;
			a=a/10;
		}
		System.out.println(x);
		for(int i=s.length()-1; i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		
		 int []num={1,5,6,3,58,2,5,8};
		 int []num1=Arrays.stream(num).sorted().toArray();
		 System.out.println(Arrays.toString(num1));
		// Arrays.stream(num).filter(x->for(int i=0;i>num.length/2;i++))
	}
	
}
