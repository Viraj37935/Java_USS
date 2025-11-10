package Abstraction;

public class Interface_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface I_UPI {
	
	public String sendmoney (String ac_no, double amt);
	
	public String recivemoney(String num, double amt );
}


class Google_pay  implements I_UPI {
	
	@Override
	public String sendmoney(String ac_no, double amt) {
		
		return "money sent to "+ ac_no+" "+"Amount" + amt;
	}

	@Override
	public String recivemoney(String num, double amt) {
	
		return null;
	}
	
}