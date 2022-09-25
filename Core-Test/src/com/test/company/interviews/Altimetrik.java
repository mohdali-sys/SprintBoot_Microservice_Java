package com.test.company.interviews;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Altimetrik {

	public static void main(String[] args) {
	//	String str="Tab@#re@#j";
		//		output:jer@#ba@#t
		//		j
		/*
		 * char charArray[]=str.toCharArray(); StringBuilder sb= new
		 * StringBuilder(charArray.length);
		 * 
		 * for(int i=charArray.length-1;i>=0;i--) { if((int)charArray[i] >=65 &&
		 * (int)charArray[i] >=97 ) { sb.append(charArray[i]); } else {
		 * sb.insert(i,charArray[i]); } } System.out.println("New Str: "+str);
		 */
				
				 String plain = "Tab@#re@#j";
				 // Output should be : jer@#ba@#T

				    String reversed = Arrays.stream(plain.split(" ")).map(str -> {
				        char[] chars = str.toCharArray();
				        int i = 0;
				        int j = chars.length - 1;
				        while(i < j) {
				            if(Character.isLetter(chars[i]) && Character.isLetter(chars[j])) {
				                char tmp = chars[i];
				                chars[i] = chars[j];
				                chars[j] = tmp;
				                i++;
				                j--;
				            } else if(!Character.isLetter(chars[i]))
				            {
				                i++;
				            }
				            else
				            {
				                j--;
				            }
				        }
				        return new String(chars);
				    }).collect(Collectors.joining(" "));
				    
				    System.out.print(reversed);

	}

}
