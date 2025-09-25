package array;

public class Array_Seven {

	public static void main(String[] args) {
		
		int [] str = new int[5];
		
		for (int i = 0; i<5; i++)
		{
			str[i] = i + 1 ;
		}
		
		int sum;
		
		for(int i = 0; i<5; i++)
		{
			if(str[i] % 3 ==1)
			{
				System.out.println(str[i]);
			}
		}
	}

}
