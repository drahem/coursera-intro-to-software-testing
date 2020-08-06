import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;				
import org.junit.Test;



/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */
public class DemoTest {

    @Test 
    public void testMain() {
    	
    	ByteArrayInputStream in = new ByteArrayInputStream("5\n3\n4\n".getBytes());
    	System.setIn(in);
    	
    	ByteArrayOutputStream out = new ByteArrayOutputStream();
    	System.setOut(new PrintStream(out));
    	
    	String [] args = {};
    	Demo.main(args);
    	
    	String output = "Enter side 1: " + System.getProperty("line.separator");
    		output += "Enter side 2: " + System.getProperty("line.separator");
    		output += "Enter side 3: " + System.getProperty("line.separator");
    		output += "This is a triangle." + System.getProperty("line.separator");
    	
    		assertEquals(output, out.toString());
    }
    
    @Test 
    public void testMain2() {
    	
    	ByteArrayInputStream in = new ByteArrayInputStream("100\n200\n300\n".getBytes());
    	System.setIn(in);
    	
    	ByteArrayOutputStream out = new ByteArrayOutputStream();
    	System.setOut(new PrintStream(out));
    	
    	String [] args = {};
    	Demo.main(args);
    	
    	String output = "Enter side 1: " + System.getProperty("line.separator");
		output += "Enter side 2: " + System.getProperty("line.separator");
		output += "Enter side 3: " + System.getProperty("line.separator");
		output += "This is not a triangle." + System.getProperty("line.separator");
	
		assertEquals(output, out.toString());
	
    }

  
	
	@Test 
    public void testIsTriangle_1() {
		assertEquals(true, Demo.isTriangle(5, 3, 4));
    }
	@Test 
	public void testIsTriangle_2() {
		assertEquals(true, Demo.isTriangle(10, 8, 3));
    }
	@Test 
	public void testIsTriangle_3() {
		assertEquals(true, Demo.isTriangle(50, 33, 48));
    }
	//not triangle 
	@Test 
	public void testIsTriangle_4() {
		assertEquals(false, Demo.isTriangle(20, 5, 6));
    }
	@Test 
	public void testIsTriangle_5() {
		assertEquals(false, Demo.isTriangle(13, 9, 3));
    }
	@Test 
	public void testIsTriangle_6() {
		assertEquals(false, Demo.isTriangle(100, 200, 300));
    }


}
