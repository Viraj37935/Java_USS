package IBM;

public class Logical_1 {

	public static void main(String[] args) {
		
		int i =Que_1.calc(5, 8);
		System.out.println(i);
	}

}

class Que_1{
	
	public static int calc(int pq,int jd)
	{
		 if(jd <=pq)
		 {
			 return -1;
		 }
		 if(jd-pq==1)
		 {
			 return -1;
		 }
		    
		 int pq_sum=pq*(jd-1);
		 int jq_sum=jd-1;
		 int counter=1;
		 
		 while(jq_sum<=pq_sum)
		 {
			 ++counter;
			 pq_sum=pq_sum+pq;
			 jq_sum=jq_sum+(jd-1);
			 
			 System.out.println("pq:"+pq_sum);
			 System.out.println("jq:"+jq_sum);
			 System.out.println("day:"+counter);
			 System.out.println("*********DAY FINISHED..");
		 }
		 return counter;
	}
	
}