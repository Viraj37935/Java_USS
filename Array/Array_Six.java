package array;

public class Array_Six {

	public static void main(String[] args) {
		
		int [] arr = new int[20];
		int sum = 0;
		
		for (int i= 0; i<20; i++)
		{
			boolean value = false;
			arr[i]=i+2;
			for(int j=2;j<arr[i];j++)
			{
				if(arr[i]%j==0)
				{
					value = true;
				}
			}
			if(value==true)
			{
				System.out.println(arr[i]+"=> composite");
			}
			else
			{
				System.out.println(arr[i]+"=> Prime");
				sum=sum+arr[i];
			}
		}
		System.out.println("Sum of prime num =" + sum);
	}

}
