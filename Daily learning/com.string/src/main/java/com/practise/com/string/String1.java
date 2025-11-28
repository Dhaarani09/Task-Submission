package com.practise.com.string;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class String1 {
	
	public static void main(String args[]) {
	
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" World !");
		System.out.println(sb);
		
		sb.insert(5, "Java");
		System.out.println(sb);
		
		sb.delete(5,  10);
		System.out.println(sb);
		
		sb.deleteCharAt(0);
		System.out.println(sb);
		
		sb.replace(6,11,"Universe");
		System.out.println(sb);
		
		String text = "Apple,Mango,Grape,Orange,Banana";
		StringTokenizer st = new StringTokenizer(text, ",");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		StringJoiner sj = new StringJoiner(",");
		sj.add("Apple");
		sj.add("Banana");
		sj.add("Cherry");
		System.out.println(sj);
		
		Fruits[] fruits = new Fruits[10];
		fruits[0] = new Fruits("Apple","Red",10.0);
		fruits[1] = new Fruits("Banana","Yellow",15.0);
		fruits[2] = new Fruits("Orange","Orange",20.0);
		
		for(int i=0;i<fruits.length;i++) {
			System.out.println("Cost of " + fruits[i].getName() + " is : " + fruits[i].getPrice());
		}
	}
	
	

}
                                                                                                                  