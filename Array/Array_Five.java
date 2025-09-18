package array;

public class Array_Five {

	public static void main(String[] args) {
		
		int [] num = new int[10];
		int sum = 0;
		
		for(int i =0;i<10;i++)
		{
			num[i] = i+1;
		}
		
		for(int i=0;i<10;i++)
		{
			if(num[i]%2!=0)
			{
				sum = sum + num[i];
			}
		}
		
		System.out.println(sum);

	}

}
