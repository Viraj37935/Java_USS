package array;

public class Array_Four {

	public static void main(String[] args) {
		int [] arr = new int[5];
		
		arr[0] = 12;
		arr[1] = 17;
		arr[2] = 11;
		arr[3] = 19;
		arr[4] = 20;
		
		int sum = 0;
		
		for (int i=0;i<5;i++)
		{
			sum = sum + arr[i];
		}
		System.out.println("Sum of num is : " + sum );

	}

}
