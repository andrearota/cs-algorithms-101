import static org.junit.Assert.*;

import org.junit.Test;


public class JavaMiscTest {
	
	@Test
	public void testOverride() {
		
		Object o1 = new Object();
		Object o2 = new String("Hello world");
		
		assertEquals("object", JavaMiscTest.foo(o1));
		// This won't be called as the input is typed as object
		assertNotEquals("string", JavaMiscTest.foo(o2));	
		assertEquals("string", JavaMiscTest.foo((String)o2));		
		
	}

	private static String foo(Object o) {
		return "object";
	}
	
	private static String foo(String s) {
		return "string";
	}
	
	@Test
	public void testFinalize() {
		
		// Never rely on finalize().
		// 1. it will be called by the JVM garbage collector
		// 2. you cannot know which thread will be used (GC is multi threaded)
		// 3. you should use it to release non Java resources
		class Foo {
			
			@Override
			public void finalize() {
				System.out.println("Finalized");
			}
		}
		
		Foo f = new Foo();
		f = null;
		
	}
	

}
