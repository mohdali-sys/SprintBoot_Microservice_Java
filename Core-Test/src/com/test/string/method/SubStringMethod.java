package com.test.string.method;

public class SubStringMethod {

	/*
	 * Returns a string that is a substring of this string. The substring begins at
	 * the specified beginIndex and extends to the character at index endIndex -
	 * 1.Thus the length of the substring is endIndex-beginIndex.
	 * 
	 * Examples:
	 * 
	 * "hamburger".substring(4, 8) returns "urge" "smiles".substring(1, 5) returns
	 * "mile"
	 */


	
	public static void main(String[] args) {
	String fruit="strawberries";
	System.out.println("SubString="+fruit.substring(2,5)); // row
	System.out.println("SubString="+fruit.substring(2)); // rawberries
	
	
	 String message = "Hello world!";
     String newMessage = message.substring(6, 12)
         + message.substring(12, 6);
     System.out.println(newMessage);
     
     int x = 100;
     double y = 100.1;
   //  boolean b = (x = y); 
     
    // int x = l, y = 6; 
   //  while (y--) 
     {
         x++; 
     }
     
     
     int x1 = 3; 
     int y1 = 1; 
   //  if (x1 = y1) /* Line 3 */
     {
         System.out.println("x =" + x); 
     }
     
     
     
     try 
     {
         Float f1 = new Float("3.0");
         int x3 = f1.intValue();
         byte b3 = f1.byteValue();
         double d = f1.doubleValue();
         System.out.println(x3 + b3 + d);
     }
     catch (NumberFormatException e) /* Line 9 */
     {
         System.out.println("bad number"); /* Line 11 */
     }

	}

}
