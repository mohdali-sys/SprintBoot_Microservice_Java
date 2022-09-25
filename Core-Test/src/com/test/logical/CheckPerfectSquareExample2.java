package com.test.logical;



/*Examples of Square numbers
Check some examples of square numbers here.

1 x 1 = 12(1 pow 2)
2 x 2 = 22(2 pow 2) = 4
3 x 3 = 32(3 pow 2) = 9
4 x 4 = 42(4 pow 2) = 16
5 x 5 = 52(5 pow 2) = 25
6 x 6 = 62(6 pow 2) = 36*/
public class CheckPerfectSquareExample2 {

	public static void main(String[] args) {
		if (checkPerfectSquare(100)) {
			System.out.println("Yes, the given number is perfect square.");
		} else {
			System.out.print("No, the given number is not perfect square.");
		}
	}

	static boolean checkPerfectSquare(double number) {
		for (int i = 1; i * i <= number; i++) {
             //if (i * i = number)   
         //comparing conditions using logical AND  
			// reminder should be 0 and modules should be i
			if ((number % i == 0) && (number / i == i)) { 
            //returns true if both conditions are true      
				return true;
			}
		}
		// returns false if any one condition is false
		return false;
	}
}