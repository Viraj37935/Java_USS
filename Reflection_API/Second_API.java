package demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Second_API {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		 Class<?> cls = STD.class;
		 
		 Constructor<?> constructor = cls.getDeclaredConstructor(int.class,String.class);
		 
		 constructor.setAccessible(true);
		 Object obj = constructor.newInstance(50,"Developer");
		 
		 Method[] method= cls.getDeclaredMethods();
		 for(Method m : method) {
			 m.setAccessible(true);
			 m.invoke(obj);
		 }
		 
		 Field[] f = cls.getDeclaredFields();
		 for(Field f1 : f) {
			 f1.setAccessible(true);
			System.out.println(f1.getName() + " " + f1.get(obj));
		 }
	}

}

class STD{
	
	private int id;
	private String name;
	
	public STD() {
		System.out.println("Default Constructor");
	}
	
	public STD(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	private void secretMethod() {
		System.out.println("Private method executed!");
	}
	
	public void show() {
		System.out.println("Student id: " + this.id+ " " + "Student Name: " + this.name);
	}
}