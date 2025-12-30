package optinal_class;

import java.util.Optional;

public class Optinal_methods2 {
	
	/**
	 * For Creating Object of Optinal<T> Class -> 
	 * 
	 * optinal.of() method.              
	 * optinal.ofNullable() method.
	 * optional.empty() method. 
	 * 
	 * these 3 methods is Static method for creating obj.
	 */

	public static void main(String[] args) {
		 
		 // 1️ of() -> Creates Optional with non-null value 
			// With help of of() method we can create object of Optional<T> Class.
         Optional<String> opt1 = Optional.of("Hello");
        System.out.println("Value: " + opt1.get());
        
        // 2️ empty() -> Creates Optional with no value.
        Optional<String> opt2 = Optional.empty();
        System.out.println("isPresent: " + opt2.isPresent());
        
        // 3️ ofNullable() -> Creates Optional that allows null value.
        String name = null;
        Optional<String> opt3 = Optional.ofNullable(name);
        System.out.println("ofNullable: " + opt3.orElse("No Name"));
        
        // 4️ get() -> Returns value if present, else throws exception.
        Optional<Integer> opt4 = Optional.of(10);
        System.out.println("get: " + opt4.get());

        // 5️ isPresent() -> Returns true if value exists.
        if(opt1.isPresent()) {
            System.out.println("opt1 has value");
        }

        // 6️ ifPresent() -> Executes logic only if value exists / take ref of Consumer<T>.
        opt1.ifPresent(val -> System.out.println("Value using ifPresent: " + val));

        // 7️ orElse() -> Returns value if exists else given default.
        System.out.println(opt3.orElse("Default Value"));

        // 8️ orElseThrow() -> Throws exception if no value exist.
        try {
            opt2.orElseThrow(() -> new RuntimeException("No value found!"));
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
	}

}
