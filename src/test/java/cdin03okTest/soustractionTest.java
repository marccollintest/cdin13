package cdin03okTest;

import static org.junit.Assert.*;

import org.junit.Test;

import cdin03ok.Soustraction;

public class soustractionTest {

	@Test
	public void testConstructeur()
	{
		Soustraction obj = new Soustraction(5, 3);
		
		assertEquals(5, obj.get_op1());
		assertEquals(3, obj.get_op2());

		obj = new Soustraction(7, 6);
		
		assertEquals(7, obj.get_op1());
		assertEquals(6, obj.get_op2());

	}

	@Test
	public void testCalcule()
	{
		Soustraction obj = new Soustraction(7, 5);
		assertEquals(2,  obj.calcule());

		obj = new Soustraction(8, 5);
		assertEquals(3,  obj.calcule());
	}
}
