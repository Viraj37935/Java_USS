package first;

public class For_Loop7 {

	public static void main(String[] args) {
		
		int[] Temp = {30, 32, 33, 31, 34, 35, 36, 37, 35, 34, 33, 32};
		
		for (int hour = 0; hour < Temp.length; hour++)
		{
			System.out.println("Hour " + (hour + 1 ) + ": Temperature = " + Temp[hour] + " `C");
		}

	}

}
