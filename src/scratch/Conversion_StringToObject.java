package scratch;

public class Conversion_StringToObject {
	public static void main(String[] args) throws Exception {
		//direct assignment
		String s = "hello";
		Object o = s;
		System.out.println(o);
		
		//using Class.forName()
		// throws Exception
		Class c = Class.forName("java.lang.String");
		System.out.println("class name : " + c.getName());
		System.out.println("super class name : " + c.getSuperclass().getName());
	}
}
