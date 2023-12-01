package annotation.prc;

import java.lang.reflect.Field;

public class Result {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		Ex e = new Ex(3);
		result(e);
	}
	
	public static void result(Object obj) throws IllegalArgumentException, IllegalAccessException {
		Class clazz = obj.getClass();
		Field[] fields = clazz.getDeclaredFields();
		
		for(Field f : fields) {
			Count annotation = f.getDeclaredAnnotation(Count.class);
			
			if(annotation!=null) {
				f.setAccessible(true);
				Object value = f.get(obj);
				
				if(value != null&value instanceof Integer) {
					int expectedValue = annotation.count();
					int fieldValue = (int) value;
					
					if(fieldValue != expectedValue) {
						throw new IllegalArgumentException (f.getName()+"필드는 "+expectedValue+"값이어야함");
					}
				}
			}
		}
	}
}
