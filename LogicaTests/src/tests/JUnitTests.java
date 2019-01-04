package tests;

import static org.junit.jupiter.api.Assertions.*;

import model.TestModel;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class JUnitTests {
	
	static TestModel jtest = null;
	

/*	@BeforeAll
	void testBeforeEach() {
		System.out.println("before each");
	}
	
	@AfterEach
	void testAfterEach() {
		System.out.println("after each");
	}*/
	
/*	@BeforeAll
	static void testBefore() {
		System.out.println("before all");
	}
	
	@AfterAll
	static void testAfter() {
		System.out.println("after all");
	}*/
	
	
	// use static 
	@BeforeAll
	static void testBeforeAll() {
		jtest = new TestModel();
		jtest.setFirstname("Digbijaya");
		jtest.setLastname("Shakya");
		System.out.println("before");
		
	}
	

	@AfterAll
	static void testAfterAll() {
		System.out.println("after");
		jtest = null;
	}
	
	@Test
	@DisplayName("This is a cube tests")
	void cubeTest() {
//		TestModel jtest = new TestModel();
		
		System.out.println(jtest);
		assertEquals(27, jtest.cube(3),"Assert cube check");
//		assertNull(jtest.getFirstname());//firstname is null
		
		System.out.println("cube function tests");
	}

	//running multiple assertions
	@Test
	@DisplayName("Group assertions")
	void groupAssertions() {
		/*TestModel name1 = new TestModel();
		name1.setFirstname("Digbijaya");
		name1.setLastname("Shakya");*/
		
		//to tests multiple assert
		assertAll("fname",
				()->assertEquals("Digbijaya", jtest.getFirstname()),
				()->assertEquals("Shakya", jtest.getLastname())
		);
		
		System.out.println("Firstname and Lastname Test");
	}
	
//	@ParameterizedTest
//	@DisplayName("paramtest check")
//	@ValueSource(ints = {1,2,3})
//	void integerRange(int arg) {
//		assertTrue(arg >= 1 && arg <= 3);
//
//		System.out.println("Parameterized Test");
//	}

	static int count = 0;
	@RepeatedTest(5)
	public void repeatedTest() {
		count++;
		System.out.println("repeat" + count);
	}
	
	
}
