package method_reference;

public class Custom_interface {

	public static void main(String[] args) {
		
		I_User<String,Boolean,Integer,String> obj = User::validate;
		
		System.out.println(obj.test("Viraj", 22, "viraj123@gmail.com"));
		
		Math m=new Math();
		I_User<Integer, Integer, Integer, Integer> obj2 =m::cal;
		
		System.out.println(obj2.test(10, 20, 30));
	}

}

interface I_User<T,R,U,E>
{
	R test(T t, U u, E e);
}

class User
{
	public static Boolean validate(String name, Integer age, String email )
	{
		return name.length() >=3 &&
			   age >18 &&
			   email.contains("@") ;
	}
}

class Math {
	
	public Integer cal(Integer a,Integer b, Integer c )
	{
        return (a*a + b*b + c*c) * b;
    }
}