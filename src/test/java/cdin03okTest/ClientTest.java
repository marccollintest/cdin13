package cdin03okTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import cdin03ok.Client;

public class ClientTest {
	/*Type	Encours	Montant	Resultat*/

//S	<1000	<1000	OK
	@Test
	public void test1()
	{
		Client oClt = new Client ("S",900);
		boolean bRes = oClt.accepte(900);
		assertTrue(bRes);		
	}
//S	<1000	[1000-5000]	OK
	@Test
	public void test2()
	{
		Client oClt = new Client ("S",900);
		boolean bRes = oClt.accepte(3000);
		assertTrue(bRes);		
	}
//S	<1000	>5000	NOK
	@Test
	public void test3()
	{
		Client oClt = new Client ("S",900);
		boolean bRes = oClt.accepte(6000);
		assertFalse(bRes);		
	}
//S	[1000-3000]	<1000	OK
	@Test
	public void test4()
	{
		Client oClt = new Client ("S",2000);
		boolean bRes = oClt.accepte(500);
		assertTrue(bRes);		
	}
//S	[1000-3000]	[1000-5000]	NOK
	@Test
	public void test5()
	{
		Client oClt = new Client ("S",2000);
		boolean bRes = oClt.accepte(3000);
		assertFalse(bRes);		
	}
//S	[1000-3000]	>5000	NOK
	@Test
	public void test6()
	{
		Client oClt = new Client ("S",2000);
		boolean bRes = oClt.accepte(6000);
		assertFalse(bRes);		
	}
//S	>3000	<1000	OK
	@Test
	public void test7()
	{
		Client oClt = new Client ("S",5000);
		boolean bRes = oClt.accepte(500);
		assertTrue(bRes);		
	}
//S	>3000	[1000-5000]	NOK
	@Test
	public void test8()
	{
		Client oClt = new Client ("S",5000);
		boolean bRes = oClt.accepte(3000);
		assertFalse(bRes);		
	}
//S	>3000	>5000	NOK
	@Test
	public void test9()
	{
		Client oClt = new Client ("S",5000);
		boolean bRes = oClt.accepte(6000);
		assertFalse(bRes);		
	}
//N	<1000	<1000	OK
	@Test
	public void test10()
	{
		Client oClt = new Client ("N",900);
		boolean bRes = oClt.accepte(500);
		assertTrue(bRes);		
	}
//N	<1000	[1000-5000]	OK
	@Test
	public void test11()
	{
		Client oClt = new Client ("N",900);
		boolean bRes = oClt.accepte(2000);
		assertTrue(bRes);		
	}
//N	<1000	>5000	OK
	@Test
	public void test12()
	{
		Client oClt = new Client ("N",900);
		boolean bRes = oClt.accepte(6000);
		assertTrue(bRes);		
	}
//N	[1000-3000]	<1000	OK
	@Test
	public void test13()
	{
		Client oClt = new Client ("N",2000);
		boolean bRes = oClt.accepte(500);
		assertTrue(bRes);		
	}
//N	[1000-3000]	[1000-5000]	OK
	@Test
	public void test14()
	{
		Client oClt = new Client ("N",2000);
		boolean bRes = oClt.accepte(2000);
		assertTrue(bRes);		
	}
//N	[1000-3000]	>5000	NOK
	@Test
	public void test15()
	{
		Client oClt = new Client ("N",2000);
		boolean bRes = oClt.accepte(6000);
		assertFalse(bRes);		
	}
//N	>3000	<1000	OK
	@Test
	public void test16()
	{
		Client oClt = new Client ("N",5000);
		boolean bRes = oClt.accepte(500);
		assertTrue(bRes);		
	}
//N	>3000	[1000-5000]	NOK
	@Test
	public void test17()
	{
		Client oClt = new Client ("N",5000);
		boolean bRes = oClt.accepte(2000);
		assertFalse(bRes);		
	}
//N	>3000	>5000	NOK
	@Test
	public void test18()
	{
		Client oClt = new Client ("N",5000);
		boolean bRes = oClt.accepte(6000);
		assertFalse(bRes);		
	}
//P	<1000	<1000	OK
	@Test
	public void test19()
	{
		Client oClt = new Client ("P",500);
		boolean bRes = oClt.accepte(600);
		assertTrue(bRes);		
	}
//P	<1000	[1000-5000]	OK
	@Test
	public void test20()
	{
		Client oClt = new Client ("P",500);
		boolean bRes = oClt.accepte(2000);
		assertTrue(bRes);		
	}
//P	<1000	>5000	OK
	@Test
	public void test21()
	{
		Client oClt = new Client ("P",500);
		boolean bRes = oClt.accepte(6000);
		assertTrue(bRes);		
	}
//P	[1000-3000]	<1000	OK
	@Test
	public void test22()
	{
		Client oClt = new Client ("P",2000);
		boolean bRes = oClt.accepte(600);
		assertTrue(bRes);		
	}
//P	[1000-3000]	[1000-5000]	OK
	@Test
	public void test23()
	{
		Client oClt = new Client ("P",2000);
		boolean bRes = oClt.accepte(2000);
		assertTrue(bRes);		
	}
//P	[1000-3000]	>5000	OK
	@Test
	public void test24()
	{
		Client oClt = new Client ("P",2000);
		boolean bRes = oClt.accepte(6000);
		assertTrue(bRes);		
	}
//P	>3000	<1000	OK
	@Test
	public void test25()
	{
		Client oClt = new Client ("P",6000);
		boolean bRes = oClt.accepte(600);
		assertTrue(bRes);		
	}
//P	>3000	[1000-5000]	OK
	@Test
	public void test26()
	{
		Client oClt = new Client ("P",6000);
		boolean bRes = oClt.accepte(2000);
		assertTrue(bRes);		
	}
//P	>3000	>5000	NOK
	@Test
	public void test27()
	{
		Client oClt = new Client ("P",6000);
		boolean bRes = oClt.accepte(6000);
		assertFalse(bRes);		
	}

}
