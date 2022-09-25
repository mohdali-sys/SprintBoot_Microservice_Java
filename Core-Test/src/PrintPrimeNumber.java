import java.util.Arrays;

public class PrintPrimeNumber {

	public static void main(String[] args) {
		
		/*
		 * for(int i=1;i<=100;i++) { if(i%i >=0 ) {
		 * System.out.println("Prime  number:"+i); } }
		 */

	int arr[]= {10,20,10,30,50,20,100};
int result[]=	removeDuplicate(arr);
for(int i=0;i<result.length;i++)
{
	//System.out.print(" "+arr[i]);
}
	}
	
	private static int[] removeDuplicate(int [] array)
	{
	Arrays.sort(array);	
	
	int [] result= new int [array.length];
	int previous=array[0];
	result[0]=previous;
	for(int i=1;i<array.length;i++)
	{
		int ch=array[i];
		if(previous != ch)
		{
			result[i]=ch;
		}
		previous=ch;
		System.out.println(result[i]);
	}
	return result;
		
	}

}
