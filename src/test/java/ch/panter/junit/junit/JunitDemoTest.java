package ch.panter.junit.junit;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ch.panter.junit.JunitDemo;
//NEW static import for assert methods
import static org.junit.Assert.*;


public class JunitDemoTest {

	
	/** our instance under test */
    private JunitDemo junitdemo_testclass; 


    @Before
    public void init() {
        junitdemo_testclass = new JunitDemo();
    }

    @After
    public void clear() {
    	junitdemo_testclass = null;
    }


    @BeforeClass
    public static void beforeEverything() {
    }

    @AfterClass
    public static void cleanUp() {
    }

    
    // Test:
    // Method isEmpty have to return true when
    // String == NULL or 0 signs
    @Test
    public void isEmptytest() {
    	String teststring = null;
    	String teststring1 = "";
    	String teststring2 = "Elefant";
    	String teststring3 = "  ";
    	
    	assertTrue(junitdemo_testclass.isEmpty(teststring));
    	assertTrue(junitdemo_testclass.isEmpty(teststring1));
    	
    	assertFalse(junitdemo_testclass.isEmpty(teststring2));
    	assertFalse(junitdemo_testclass.isEmpty(teststring3));
    }
    
    
    /**
     * Returns a copy of str with the first character converted to uppercase and 	the remainder to lowercase.
     * 
     * Example:
     * "hello".capitalize    #=> "Hello"
     * "HELLO".capitalize    #=> "Hello"
     * "123ABC".capitalize   #=> "123abc"
     */
    @Test
    public void capitalizetest() {
    	String teststring = "TEST";
    	String teststring1 = "test";
    	String teststring2 = "123456789";
    	String teststring3 = "T123456789T";
    	String teststring4 = "t123456789t";
    	String teststring5 = "t";
    	String teststring6 = "T";
    	
    	assertEquals("Test",junitdemo_testclass.capitalize(teststring));
    	assertEquals("Test",junitdemo_testclass.capitalize(teststring1));
    	assertEquals("123456789",junitdemo_testclass.capitalize(teststring2));
    	assertEquals("T123456789t",junitdemo_testclass.capitalize(teststring3));
    	assertEquals("T123456789t",junitdemo_testclass.capitalize(teststring4));
    	assertEquals("T",junitdemo_testclass.capitalize(teststring5));
    	assertEquals("T",junitdemo_testclass.capitalize(teststring6));
    }
    
    
    /**
     * Reverses the given String character by character. E.g.
     * <code>"Test Hsz"</code> becomes <code>"zsH tseT"</code>
     * 
     * @param s  string to reverse
     * @return reversed string
     * @throws NullPointerException when given argument is null
     */
    @Test
    public void reversetest() {
    	String teststring = "MaoaM";
    	String teststring1 = "123Test";
    	String teststring2 = "123456789";
    	String teststring5 = "t";
    	String teststring6 = "T";
    	
    	assertEquals("MaoaM",junitdemo_testclass.reverse(teststring));
    	assertEquals("tseT321",junitdemo_testclass.reverse(teststring1));
    	assertEquals("987654321",junitdemo_testclass.reverse(teststring2));
    	assertEquals("t",junitdemo_testclass.reverse(teststring5));
    	assertEquals("T",junitdemo_testclass.reverse(teststring6));
    }
    

    @Test(expected=NullPointerException.class) 
      public void reverse_excp_test() {
    	String teststring = null;
    	junitdemo_testclass.reverse(teststring);
    }

    
    /**
     * Joins the given strings to one string. Each given string is separated by
     * a whitespace, but there will be no trailing whitespaces.
     * 
     * E.g. <code>join("a","b","c")<code> will result in 
     * <code>"a b c"<code>.
     * 
     * @param strings
     *            strings to join
     * @return the concatenated string
     */
    @Test
    public void jointest() {
    	List<String> testlist = new ArrayList<String>();
    	List<String> testlist1 = new ArrayList<String>();
    	
    	testlist.add("MaoaM");
    	testlist.add("MaoaM");
    	
    	testlist1.add("123");
    	testlist1.add("456");
    	testlist1.add("78A");
    	
    	assertEquals("MaoaM MaoaM",junitdemo_testclass.join(testlist));
    	assertEquals("123 456 78A",junitdemo_testclass.join(testlist1));
    }
    
	
}
