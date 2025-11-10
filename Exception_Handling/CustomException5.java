package CustomException;

public class CustomException5 {

	public static void main(String[] args) {

		int num = -2;

		try {
			if (num < 0) {
				throw new negativeNumException();
			}
		} catch (negativeNumException e) {
			System.out.println(e.getMessage());
		}

	}

}

class negativeNumException extends Exception {

	public negativeNumException() {
		super("number is negative");
	}
}
