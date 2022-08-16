package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMethods {

	
	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList();
		
		int []myarray= {12,5,3,36,42,18,5,47};
		l.add(10);
		l.add(15);
		l.add(69);
		l.add(49);
		l.add(37);
		l.add(22);
		l.add(10);
		
		System.out.println(l);
		List<Integer>l1=l.stream().filter(i->i%2==0).collect(Collectors.toList());
		List<Integer>l2=l.stream().filter(i->i%2!=0).collect(Collectors.toList());
		List<Integer>l3=l.stream().map(i->i*2).collect(Collectors.toList());
		List<Integer>l4=l.stream().filter(i->i%2==0).map(i->i+2).collect(Collectors.toList());
		List<Integer>l5=l.stream().sorted().collect(Collectors.toList());
		Integer n=l.stream().sorted().collect(Collectors.toList()).get(l.size()-2);
		System.out.println(n);
		System.out.println("2nd higeshst num is :"+n);
		// Customised sorting using comparator
		Comparator<Integer> cmp=(i1,i2)->(i1>i2)?-1:(i1<i2)?1:0;             
		List<Integer>l6=l.stream().sorted(cmp).collect(Collectors.toList());
		
		// min & max function with customised sorting order
		Integer min=l.stream().min((i1,i2)->i1.compareTo(i2)).get();
		Integer max=l.stream().max((i1,i2)->i1.compareTo(i2)).get();
		
		//convert array into stream & stream into array
		Integer [] array=l.stream().toArray(Integer[]::new);
		Stream.of(array).forEach(System.out::println);                    
	         int[]uniq=Arrays.stream(myarray).distinct().toArray(); 
	        int[] sortArray= Arrays.stream(myarray).sorted().toArray();
	        Arrays.sort(myarray);
		
		
		System.out.println("Even number is :"+l1);
		System.out.println("Odd number is :"+l2);
		System.out.println("Duble value of each element is:"+l3);
		System.out.println("Adding 2 in each even number:"+l4);
		System.out.println("Sorting order :"+l5);
		System.out.println("Customised sorting order:"+l6);
		System.out.println("min element in lis is:"+min);
		System.out.println("max elemetn in lis:"+max);
		System.out.println("Convert Stream to array:"+Arrays.toString(array));
		Stream.of(array).forEach(System.out::println);
		System.out.println(Arrays.toString(uniq));
		System.out.println("sorted array:"+Arrays.toString(sortArray));
		System.out.println(Arrays.toString(myarray));
		
		//============================================================
		// creating object of functional interface using Lambda Expression
		
		Vigetable v= ()->System.out.println("Vegitable interface");
		
		v.add();
		
		List<String> s=new ArrayList();
		
		s.add("shubham");
		s.add("onkar");
		s.add("kiran");
		s.add("viabhav");
		System.out.println("\n\n New List is--->");
	      s.forEach(list->System.out.println(list)); 
	      Stream <String> str=s.stream();
		System.out.println("total element is :"+str.count());
		//System.out.println("total element is :"+str.distinct());
	
		List<String>name1=s.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList()); //Customised sorting order
		System.out.println("List in reverse order:"+name1);
		
		Comparator<String> cop=(s1,s2)->{
			                         int h1=s1.length();
			                         int h2=s2.length();
			                          if(h1>h2)return -1;
			                          else if(h1<h2)return 1;
			                          else return s1.compareTo(s2);
		};
		List<String>name2=s.stream().sorted(cop).collect(Collectors.toList());
		System.out.println(name2);
		
		
	}
}
