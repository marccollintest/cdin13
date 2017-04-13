package cdin03okTest;

import static org.junit.Assert.*;
import org.junit.Test;

import cdin03ok.Addition;

public class AdditionTest {

	@Test
	public void testConstructeur()
	{
		Addition obj = new Addition(3,2);

		assertEquals(3, obj.get_op1());
		
		assertEquals(2, obj.get_op2());
//		fail("Echec volontaire");
	}
	@Test
	public void testAccesseur()
	{
		Addition obj = new Addition(0,0);
		obj.set_op1(3);
		assertEquals(3, obj.get_op1());
		obj.set_op2(2);
			assertEquals(2, obj.get_op2());
	}
	@Test
	public void testCalcule()
	{
		Addition obj = new Addition(3,2);
		assertEquals(5, obj.calcule());
	}
	@Test
	public void testtoString()
	{
		Addition obj = new Addition(3,2);
		assertEquals("Addition", obj.toString());
	}

	@Test
	public void testEqualsNull()
	{
		Addition obj = new Addition(3,2);
		assertFalse(obj.equals(null));
	}

	@Test
	public void testEqualsOther()
	{
		Addition obj = new Addition(3,2);
		assertFalse(obj.equals(new String()));
	}
	@Test
	public void testEqualsThis()
	{
		Addition obj = new Addition(3,2);
		assertTrue(obj.equals(obj));
	}

	@Test
	public void testEqualsAdditionDifferente()
	{
		Addition obj = new Addition(3,2);
		Addition obj2 = new Addition(5,3);
		assertFalse(obj.equals(obj2));
	}
	@Test
	/*
	 * Test la méthode equals avec une addition avec le même résultat
	 */
	public void testEqualsAdditionEquals()
	{
		//Arrange
		Addition obj = new Addition(3,2);
		Addition obj2 = new Addition(4,1);
		//Act
		boolean bResult= obj.equals(obj2);
		//Assert
		assertTrue(bResult);
	}
	
	@Test 
	public void testM1()
	{
		Addition obj =new Addition(0, 0);
		try
		{
			obj.M1();
			fail("J'aurais du avoir une exception");
		}
		catch (IllegalArgumentException ex)
		{
		}
		
	}
	@Test (expected=IllegalArgumentException.class)
	public void testM1Bis()
	{
		Addition obj =new Addition(0, 0);
		obj.M1();
	}
	@Test(timeout=3000)
	public void testM2()
	{
		Addition obj =new Addition(0, 0);
		try
		{
			obj.M2();
		}
		catch (Throwable ex)
		{
		}
	}
}
