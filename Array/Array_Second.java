package array;

public class Array_Second {

	public static void main(String[] args) {
		
		int[] arr = new int[1000];
	
		for(int i = 0; i < 1000; i++)
		{
			arr[i] = i + 1;
		}
		
		for(int i = 0; i < 1000; i++)
		{
			if(arr[i]%3!=0)
			{
				System.out.println(arr[i]);
			}
		}
		
		
	}

}
