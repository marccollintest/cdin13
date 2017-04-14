package cdin03okTest;
import static org.junit.Assert.*;

import org.junit.Test;

import cdin03ok.Phone2;
import cdin03ok.Phone2.Phone2CodeEtat;

public class Phone2Test {

	@Test
	public void test0()
	{
		Phone2 oPhone2 = new Phone2();
		assertEquals(Phone2CodeEtat.REPOS,oPhone2.get_etat());
	}
//	Repos	AppelEntrant	Sonnerie
	@Test
	public void test1()
	{
		Phone2 oPhone2 = new Phone2();
		oPhone2.appelEntrant();
		assertEquals(Phone2CodeEtat.SONNERIE, oPhone2.get_etat());
	}
//	Repos	TimeOuT	Repos	
	@Test
	public void test2()
	{
		Phone2 oPhone2 = new Phone2();
		oPhone2.TimeOut();
		assertEquals(Phone2CodeEtat.REPOS, oPhone2.get_etat());
	}
//	Repos	Decrocher	Décroché	
	@Test
	public void test3()
	{
		Phone2 oPhone2 = new Phone2();
		oPhone2.decrocher();
		assertEquals(Phone2CodeEtat.DECROCHE, oPhone2.get_etat());
	}
//	Repos	Raccrocher	Repos	
	@Test
	public void test4()
	{
		Phone2 oPhone2 = new Phone2();
		oPhone2.raccrocher();
		assertEquals(Phone2CodeEtat.REPOS, oPhone2.get_etat());
		oPhone2.TimeOut();
		assertEquals(Phone2CodeEtat.REPOS, oPhone2.get_etat());
	}
//	Repos	Numéroter	Repos	
	@Test
	public void test5()
	{
		Phone2 oPhone2 = new Phone2();
		oPhone2.numeroter();
		assertEquals(Phone2CodeEtat.REPOS, oPhone2.get_etat());
	}
//	Repos	DecrocherCor	Repos	
	@Test
	public void test6()
	{
		Phone2 oPhone2 = new Phone2();
		oPhone2.decrocherCor();
		assertEquals(Phone2CodeEtat.REPOS, oPhone2.get_etat());
	}
//	Repos	RaccrocherCor	Repos	
	@Test
	public void test7()
	{
		Phone2 oPhone2 = new Phone2();
		oPhone2.raccrocherCor();
		assertEquals(Phone2CodeEtat.REPOS, oPhone2.get_etat());
	}
//	Sonnerie	AppelEntrant	Sonnerie	
	@Test
	public void test8()
	{
		Phone2 oPhone2 = new Phone2();
		oPhone2.FTO_set_etat(Phone2CodeEtat.SONNERIE);
		oPhone2.appelEntrant();
		assertEquals(Phone2CodeEtat.SONNERIE, oPhone2.get_etat());
	}
//	Sonnerie	TimeOuT	Repos	
	@Test
	public void test9()
	{
		Phone2 oPhone2 = new Phone2();
		oPhone2.FTO_set_etat(Phone2CodeEtat.SONNERIE);
		oPhone2.TimeOut();
		assertEquals(Phone2CodeEtat.REPOS, oPhone2.get_etat());
	}
//	Sonnerie	Decrocher	EnConversation	
	@Test
	public void test10()
	{
		Phone2 oPhone2 = new Phone2();
		oPhone2.FTO_set_etat(Phone2CodeEtat.SONNERIE);
		oPhone2.decrocher();
		assertEquals(Phone2CodeEtat.ENCONV, oPhone2.get_etat());
	}
//	Sonnerie	Raccrocher	Sonnerie	OUI
	@Test
	public void test11()
	{
		Phone2 oPhone2 = new Phone2();
		oPhone2.FTO_set_etat(Phone2CodeEtat.SONNERIE);
		oPhone2.raccrocher();
		assertEquals(Phone2CodeEtat.SONNERIE, oPhone2.get_etat());
	}
//	Sonnerie	Numéroter	Sonnerie	OUI
	@Test
	public void test12()
	{
		Phone2 oPhone2 = new Phone2();
		oPhone2.FTO_set_etat(Phone2CodeEtat.SONNERIE);
		oPhone2.numeroter();
		assertEquals(Phone2CodeEtat.SONNERIE, oPhone2.get_etat());
	}
//	Sonnerie	DecrocherCor	Sonnerie	OUI
	@Test
	public void test13()
	{
		Phone2 oPhone2 = new Phone2();
		oPhone2.FTO_set_etat(Phone2CodeEtat.SONNERIE);
		oPhone2.decrocherCor();
		assertEquals(Phone2CodeEtat.SONNERIE, oPhone2.get_etat());
	}
//	Sonnerie	RaccrocherCor	Sonnerie	OUI
	@Test
	public void test14()
	{
		Phone2 oPhone2 = new Phone2();
		oPhone2.FTO_set_etat(Phone2CodeEtat.SONNERIE);
		oPhone2.raccrocherCor();
		assertEquals(Phone2CodeEtat.SONNERIE, oPhone2.get_etat());
	}
//	Decroché	AppelEntrant	Décroché	
	@Test
	public void test15()
	{
		Phone2 oPhone2 = new Phone2();
		oPhone2.FTO_set_etat(Phone2CodeEtat.DECROCHE);
		oPhone2.appelEntrant();
		assertEquals(Phone2CodeEtat.DECROCHE, oPhone2.get_etat());
	}
//	Decroché	TimeOuT	Décroché	OUI
	@Test
	public void test16()
	{
		Phone2 oPhone2 = new Phone2();
		oPhone2.FTO_set_etat(Phone2CodeEtat.DECROCHE);
		oPhone2.TimeOut();
		assertEquals(Phone2CodeEtat.DECROCHE, oPhone2.get_etat());
	}
//	Decroché	Decrocher	Décroché	OUI
	@Test
	public void test17()
	{
		Phone2 oPhone2 = new Phone2();
		oPhone2.FTO_set_etat(Phone2CodeEtat.DECROCHE);
		oPhone2.decrocher();
		assertEquals(Phone2CodeEtat.DECROCHE, oPhone2.get_etat());
	}
//	Decroché	Raccrocher	Repos	
	@Test
	public void test18()
	{
		Phone2 oPhone2 = new Phone2();
		oPhone2.FTO_set_etat(Phone2CodeEtat.DECROCHE);
		oPhone2.raccrocher();
		assertEquals(Phone2CodeEtat.REPOS, oPhone2.get_etat());
	}
//	Decroché	Numéroter	En Appel	
	@Test
	public void test19()
	{
		Phone2 oPhone2 = new Phone2();
		oPhone2.FTO_set_etat(Phone2CodeEtat.DECROCHE);
		oPhone2.numeroter();
		assertEquals(Phone2CodeEtat.ENAPPEL, oPhone2.get_etat());
	}
//	Decroché	DecrocherCor	Décroché	
	@Test
	public void test20()
	{
		Phone2 oPhone2 = new Phone2();
		oPhone2.FTO_set_etat(Phone2CodeEtat.DECROCHE);
		oPhone2.decrocherCor();
		assertEquals(Phone2CodeEtat.DECROCHE, oPhone2.get_etat());
	}
//	Decroché	RaccrocherCor	Décroché	
	@Test
	public void test21()
	{
		Phone2 oPhone2 = new Phone2();
		oPhone2.FTO_set_etat(Phone2CodeEtat.DECROCHE);
		oPhone2.raccrocherCor();
		assertEquals(Phone2CodeEtat.DECROCHE, oPhone2.get_etat());
	}
//	En appel	AppelEntrant	En Appel	
	@Test
	public void test22()
	{
		Phone2 oPhone2 = new Phone2();
		oPhone2.FTO_set_etat(Phone2CodeEtat.ENAPPEL);
		oPhone2.appelEntrant();
		assertEquals(Phone2CodeEtat.ENAPPEL, oPhone2.get_etat());
	}
//	En appel	TimeOuT	Décroché	
	@Test
	public void test23()
	{
		Phone2 oPhone2 = new Phone2();
		oPhone2.FTO_set_etat(Phone2CodeEtat.ENAPPEL);
		oPhone2.TimeOut();
		assertEquals(Phone2CodeEtat.DECROCHE, oPhone2.get_etat());
	}
//	En appel	Decrocher	En appel	OUI
	@Test
	public void test24()
	{
		Phone2 oPhone2 = new Phone2();
		oPhone2.FTO_set_etat(Phone2CodeEtat.ENAPPEL);
		oPhone2.decrocher();
		assertEquals(Phone2CodeEtat.ENAPPEL, oPhone2.get_etat());
	}
//	En appel	Raccrocher	Repos	
	@Test
	public void test25()
	{
		Phone2 oPhone2 = new Phone2();
		oPhone2.FTO_set_etat(Phone2CodeEtat.ENAPPEL);
		oPhone2.raccrocher();
		assertEquals(Phone2CodeEtat.REPOS, oPhone2.get_etat());
	}
//	En appel	Numéroter	En Appel	OUI
	@Test
	public void test26()
	{
		Phone2 oPhone2 = new Phone2();
		oPhone2.FTO_set_etat(Phone2CodeEtat.ENAPPEL);
		oPhone2.numeroter();
		assertEquals(Phone2CodeEtat.ENAPPEL, oPhone2.get_etat());
	}
//	En appel	DecrocherCor	En convers	
	@Test
	public void test27()
	{
		Phone2 oPhone2 = new Phone2();
		oPhone2.FTO_set_etat(Phone2CodeEtat.ENAPPEL);
		oPhone2.decrocherCor();
		assertEquals(Phone2CodeEtat.ENCONV, oPhone2.get_etat());
	}
//	En appel	RaccrocherCor	En Appel	
	@Test
	public void test28()
	{
		Phone2 oPhone2 = new Phone2();
		oPhone2.FTO_set_etat(Phone2CodeEtat.ENAPPEL);
		oPhone2.raccrocherCor();
		assertEquals(Phone2CodeEtat.ENAPPEL, oPhone2.get_etat());
	}
//	En Conversation	AppelEntrant	En convers	
	@Test
	public void test29()
	{
		Phone2 oPhone2 = new Phone2();
		oPhone2.FTO_set_etat(Phone2CodeEtat.ENCONV);
		oPhone2.appelEntrant();
		assertEquals(Phone2CodeEtat.ENCONV, oPhone2.get_etat());
	}
//	En Conversation	TimeOuT	En Conversation	
	@Test
	public void test30()
	{
		Phone2 oPhone2 = new Phone2();
		oPhone2.FTO_set_etat(Phone2CodeEtat.ENCONV);
		oPhone2.TimeOut();
		assertEquals(Phone2CodeEtat.ENCONV, oPhone2.get_etat());
	}
//	En Conversation	Decrocher	EnConversation	OUI
	@Test
	public void test31()
	{
		Phone2 oPhone2 = new Phone2();
		oPhone2.FTO_set_etat(Phone2CodeEtat.ENCONV);
		oPhone2.decrocher();
		assertEquals(Phone2CodeEtat.ENCONV, oPhone2.get_etat());
	}
//	En Conversation	Raccrocher	Repos	
	@Test
	public void test32()
	{
		Phone2 oPhone2 = new Phone2();
		oPhone2.FTO_set_etat(Phone2CodeEtat.ENCONV);
		oPhone2.raccrocher();
		assertEquals(Phone2CodeEtat.REPOS, oPhone2.get_etat());
	}
//	En Conversation	Numéroter	EnConversation	
	@Test
	public void test33()
	{
		Phone2 oPhone2 = new Phone2();
		oPhone2.FTO_set_etat(Phone2CodeEtat.ENCONV);
		oPhone2.numeroter();
		assertEquals(Phone2CodeEtat.ENCONV, oPhone2.get_etat());
	}
//	En Conversation	DecrocherCor	EnConversation	OUI
	@Test
	public void test34()
	{
		Phone2 oPhone2 = new Phone2();
		oPhone2.FTO_set_etat(Phone2CodeEtat.ENCONV);
		oPhone2.decrocherCor();
		assertEquals(Phone2CodeEtat.ENCONV, oPhone2.get_etat());
	}
//	En Conversation	RaccrocherCor	Décroché	
	@Test
	public void test35()
	{
		Phone2 oPhone2 = new Phone2();
		oPhone2.FTO_set_etat(Phone2CodeEtat.ENCONV);
		oPhone2.raccrocherCor();
		assertEquals(Phone2CodeEtat.DECROCHE, oPhone2.get_etat());
	}

}
