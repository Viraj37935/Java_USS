package demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class First_1 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		
		Class<?> cl = STD.class;
		
		Constructor<?> con = cl.getDeclaredConstructor(String.class);
		
		con.setAccessible(true);
		Object obj = con.newInstance("BMW");
		
		Method method = cl.getDeclaredMethod("update");
		Field f = cl.getDeclaredField("name");
		
		f.setAccessible(true);
		
		if(f.get(obj).equals("Mercedes")) {
			f.set(obj, "BMW");
		}
		
		method.setAccessible(true);
		String str =(String) method.invoke(obj);
		
		System.out.println(str);
		
	}

}

class STD {
	
	
	private String name = "Mercedes";
	
	private STD(String name) {
		System.out.println("Form Constructor");
	}
	
	private String update() {
		return this.name;
	}
	
	
}