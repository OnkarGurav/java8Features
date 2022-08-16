package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Allmatch {

	public static void main(String[] args) {
		
		Integer [] num= {2,4,6,9};
		
		List<Integer> in=new ArrayList();
		
		in.add(12);
		in.add(14);
		in.add(16);
		in.add(20);
	//	if All value match from list then only return ture and if any one value Not match predicate fun then return false
		boolean x =in.stream().allMatch(no->no%2==0);
		System.out.println(x);
		Arrays.stream(num).allMatch(no->{
			if(no%2==0) {
				System.out.println("even no"+no);
				return true;				
			}
			else {
				System.out.println("odd no "+no);
				return false;				
			}
		});
		
	// if non value match from list then only return ture and if any one value match predicate fun then return false
		boolean y=in.stream().noneMatch(no->no%2==0);
		System.out.println(y);
	}
}
