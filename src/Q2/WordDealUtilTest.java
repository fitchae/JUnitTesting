package Q2;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;


public class WordDealUtilTest {

	private static WordDealUtil wordDealUtil = new  WordDealUtil();
	@Before
	public void setUp() throws Exception {
	}
	@Before
	public void echoBefore()
	{
		System.out.println("Check Test Environment! Start the Test");
	}
	
	@After
	public void echoAfter()
	{
		System.out.println("Test Finish! Check Result");
	}
	// Test wordEormat4DB with normal condition
	@Test
	public void wordEormat4DBNormal()
	{
		String value = wordDealUtil.wordFormat4DB("employeeInfo");
		assertEquals("Not equal to employee_info","employee_info",value);
	
	}
	// Test wordEormat4DB with normal condition
	@Test
	public void wordEormat4DBNull()
	{
		String target = null;
		String result = wordDealUtil.wordFormat4DB(target);
		assertNull(result);
	}
	
	// Test wordEormat4DB with empty string condition
	@Test
	public void wordEormat4DBEmpty()
	{
		
		String value = wordDealUtil.wordFormat4DB("");
		assertEquals("Not equal to \'\'","",value);
		
	
	}
	
	// Test First character with upper case
	@Test
	public void wordEormat4DBBegin()
	{
		String value = wordDealUtil.wordFormat4DB("employeeInfo");
		assertEquals("Not equal to employee_info","employee_info",value);
	}
	// Test Last character with upper case
	@Test
	public void wordEormat4DBEnd()
	{
		String value = wordDealUtil.wordFormat4DB("employeeInfoA");
		assertEquals("Not equal to employee_info_a","employee_info_a",value);
	
	}
	// Test more than one character with upper case
	@Test
	public void wordEormat4DBTogether()
	{
		String value = wordDealUtil.wordFormat4DB("employeeAInfo");
		assertEquals("Not equal to employee_a_info","employee_a_info",value);
	
	}

}
