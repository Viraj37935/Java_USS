package array;

public class Array_Third {

	public static void main(String[] args) {
		
		int [] arr = new int[5];
		
		
		arr[0] = 12;
		arr[1] = 17;
		arr[2] = 11;
		arr[3] = 19;
		arr[4] = 20;
		
		int highest = 0;
		
		for (int i=0;i<5;i++)
		{
			if(arr[i]>highest)
			{
				highest = arr[i];
			}
		}
		System.out.println(highest);

	}

}
