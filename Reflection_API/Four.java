package demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Four {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		   Class<?> cl=Class.forName("demo.Book"); 
		 
		 Method [] methods= cl.getDeclaredMethods();
		 for(Method m:methods) {
			 System.out.println(m.getName());
			 System.out.println(m.getParameterCount());
			 System.out.println(m);
		 }
		 
		 Constructor<?> con = cl.getDeclaredConstructor();
		 
		 Method m = cl.getDeclaredMethod("add",int.class, int.class);
		 
		 Book obj = (Book) con.newInstance();
		 m.setAccessible(true);
		 m.invoke(obj, 15,30);
	}

}
class Book {
	 private void add (int i , int j) {
		 System.out.println("Inside the private add method...");
		 System.out.println(i+j);
	 }
	 
	 public void add(int j) {
		 System.out.println(j*2);
	 }
}