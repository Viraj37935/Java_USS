package method_reference;

import java.util.function.Predicate;

public class Arbitory_Methodref {

	public static void main(String[] args) {
	   
		Text T1 = new Text("Viraj");
		Text T2 = new Text("Developer");
		
		Predicate<Text> Check = Text::isLong;
		System.out.println(Check.test(T1));
		System.out.println(Check.test(T2));
	}

}

class Text {

     String value;

    
    public Text(String value) {
        this.value = value;
    }

    public boolean isLong() {
        return value.length() > 4;
    }

    public void printValue() {
        System.out.println("Value : " + value);
    }

    public String toUpper() {
        return value.toUpperCase();
    }

    public String getValue() {
        return value;
    }
}
