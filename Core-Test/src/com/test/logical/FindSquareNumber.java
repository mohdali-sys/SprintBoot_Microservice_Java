package com.test.logical;

public class FindSquareNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Custom  Square :"+sqrt(100));
		System.out.println(" Build in  Square:"+findSquare1(100));

	}


		private static double sqrt(double X) {
		    for (int i = 1; i < X; ++i) {
		        int p = i * i;
		        if (p == X) {
		            // perfect square
		            return i;
		        }
		        if (p > X) {
		            // found left part of decimal
		            return sqrt(X, i - 1, i);
		        }
		    }
		    return Double.NaN;
		}
		
		private static double sqrt(double X, double low, double high) {
		    double mid = (low + high) / 2;
		    double p = mid * mid;
		    // uncomment below line to see how we reach the final answer
		    // System.out.println(low + " " + high + " " + mid + " " + p);
		    double PRECISION=0.0;
		    if (p == X || (Math.abs(X - p) < PRECISION)) {
		        return mid;
		    }
		    if (p < X) {
		        return sqrt(X, mid, high);
		    }
		    return sqrt(X, low, mid);
		}
		
	static double findSquare1(double n)
	{
		return Math.sqrt(n);
	}
}
