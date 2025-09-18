package array;

public class Array_First {

	public static void main(String[] args) {

		
		
		char[] arr = new char[100];
		
		for (int i = 0; i < 100; i++)
		{
			arr[i] = (char) (i+65);
		}
		
		for (int i = 1; i < 100; i++ )
		{
			System.out.println(arr[i]);
		}
		
	}

}
