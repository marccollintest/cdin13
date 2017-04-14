package cdin03okTest;
import static org.junit.Assert.*;

import org.junit.Test;

import cdin03ok.Phone;
import cdin03ok.Phone.CodeEtat;

public class PhoneTest {

	@Test
	public void test0()
	{
		Phone oPhone = new Phone();
		assertEquals(CodeEtat.REPOS,oPhone.get_etat());
	}
//	Repos	AppelEntrant	Sonnerie
	@Test
	public void test1()
	{
		Phone oPhone = new Phone();
		oPhone.appelEntrant();
		assertEquals(CodeEtat.SONNERIE, oPhone.get_etat());
	}
//	Repos	TimeOuT	Repos	
	@Test
	public void test2()
	{
		Phone oPhone = new Phone();
		oPhone.TimeOut();
		assertEquals(CodeEtat.REPOS, oPhone.get_etat());
	}
//	Repos	Decrocher	Décroché	
	@Test
	public void test3()
	{
		Phone oPhone = new Phone();
		oPhone.decrocher();
		assertEquals(CodeEtat.DECROCHE, oPhone.get_etat());
	}
//	Repos	Raccrocher	Repos	
	@Test
	public void test4()
	{
		Phone oPhone = new Phone();
		oPhone.raccrocher();
		assertEquals(CodeEtat.REPOS, oPhone.get_etat());
		oPhone.TimeOut();
		assertEquals(CodeEtat.REPOS, oPhone.get_etat());
	}
//	Repos	Numéroter	Repos	
	@Test
	public void test5()
	{
		Phone oPhone = new Phone();
		oPhone.numeroter();
		assertEquals(CodeEtat.REPOS, oPhone.get_etat());
	}
//	Repos	DecrocherCor	Repos	
	@Test
	public void test6()
	{
		Phone oPhone = new Phone();
		oPhone.decrocherCor();
		assertEquals(CodeEtat.REPOS, oPhone.get_etat());
	}
//	Repos	RaccrocherCor	Repos	
	@Test
	public void test7()
	{
		Phone oPhone = new Phone();
		oPhone.raccrocherCor();
		assertEquals(CodeEtat.REPOS, oPhone.get_etat());
	}
//	Sonnerie	AppelEntrant	Sonnerie	
	@Test
	public void test8()
	{
		Phone oPhone = new Phone();
		oPhone.set_etat(CodeEtat.SONNERIE);
		oPhone.appelEntrant();
		assertEquals(CodeEtat.SONNERIE, oPhone.get_etat());
	}
//	Sonnerie	TimeOuT	Repos	
	@Test
	public void test9()
	{
		Phone oPhone = new Phone();
		oPhone.set_etat(CodeEtat.SONNERIE);
		oPhone.TimeOut();
		assertEquals(CodeEtat.REPOS, oPhone.get_etat());
	}
//	Sonnerie	Decrocher	EnConversation	
	@Test
	public void test10()
	{
		Phone oPhone = new Phone();
		oPhone.set_etat(CodeEtat.SONNERIE);
		oPhone.decrocher();
		assertEquals(CodeEtat.ENCONV, oPhone.get_etat());
	}
//	Sonnerie	Raccrocher	Sonnerie	OUI
	@Test
	public void test11()
	{
		Phone oPhone = new Phone();
		oPhone.set_etat(CodeEtat.SONNERIE);
		oPhone.raccrocher();
		assertEquals(CodeEtat.SONNERIE, oPhone.get_etat());
	}
//	Sonnerie	Numéroter	Sonnerie	OUI
	@Test
	public void test12()
	{
		Phone oPhone = new Phone();
		oPhone.set_etat(CodeEtat.SONNERIE);
		oPhone.numeroter();
		assertEquals(CodeEtat.SONNERIE, oPhone.get_etat());
	}
//	Sonnerie	DecrocherCor	Sonnerie	OUI
	@Test
	public void test13()
	{
		Phone oPhone = new Phone();
		oPhone.set_etat(CodeEtat.SONNERIE);
		oPhone.decrocherCor();
		assertEquals(CodeEtat.SONNERIE, oPhone.get_etat());
	}
//	Sonnerie	RaccrocherCor	Sonnerie	OUI
	@Test
	public void test14()
	{
		Phone oPhone = new Phone();
		oPhone.set_etat(CodeEtat.SONNERIE);
		oPhone.raccrocherCor();
		assertEquals(CodeEtat.SONNERIE, oPhone.get_etat());
	}
//	Decroché	AppelEntrant	Décroché	
	@Test
	public void test15()
	{
		Phone oPhone = new Phone();
		oPhone.set_etat(CodeEtat.DECROCHE);
		oPhone.appelEntrant();
		assertEquals(CodeEtat.DECROCHE, oPhone.get_etat());
	}
//	Decroché	TimeOuT	Décroché	OUI
	@Test
	public void test16()
	{
		Phone oPhone = new Phone();
		oPhone.set_etat(CodeEtat.DECROCHE);
		oPhone.TimeOut();
		assertEquals(CodeEtat.DECROCHE, oPhone.get_etat());
	}
//	Decroché	Decrocher	Décroché	OUI
	@Test
	public void test17()
	{
		Phone oPhone = new Phone();
		oPhone.set_etat(CodeEtat.DECROCHE);
		oPhone.decrocher();
		assertEquals(CodeEtat.DECROCHE, oPhone.get_etat());
	}
//	Decroché	Raccrocher	Repos	
	@Test
	public void test18()
	{
		Phone oPhone = new Phone();
		oPhone.set_etat(CodeEtat.DECROCHE);
		oPhone.raccrocher();
		assertEquals(CodeEtat.REPOS, oPhone.get_etat());
	}
//	Decroché	Numéroter	En Appel	
	@Test
	public void test19()
	{
		Phone oPhone = new Phone();
		oPhone.set_etat(CodeEtat.DECROCHE);
		oPhone.numeroter();
		assertEquals(CodeEtat.ENAPPEL, oPhone.get_etat());
	}
//	Decroché	DecrocherCor	Décroché	
	@Test
	public void test20()
	{
		Phone oPhone = new Phone();
		oPhone.set_etat(CodeEtat.DECROCHE);
		oPhone.decrocherCor();
		assertEquals(CodeEtat.DECROCHE, oPhone.get_etat());
	}
//	Decroché	RaccrocherCor	Décroché	
	@Test
	public void test21()
	{
		Phone oPhone = new Phone();
		oPhone.set_etat(CodeEtat.DECROCHE);
		oPhone.raccrocherCor();
		assertEquals(CodeEtat.DECROCHE, oPhone.get_etat());
	}
//	En appel	AppelEntrant	En Appel	
	@Test
	public void test22()
	{
		Phone oPhone = new Phone();
		oPhone.set_etat(CodeEtat.ENAPPEL);
		oPhone.appelEntrant();
		assertEquals(CodeEtat.ENAPPEL, oPhone.get_etat());
	}
//	En appel	TimeOuT	Décroché	
	@Test
	public void test23()
	{
		Phone oPhone = new Phone();
		oPhone.set_etat(CodeEtat.ENAPPEL);
		oPhone.TimeOut();
		assertEquals(CodeEtat.DECROCHE, oPhone.get_etat());
	}
//	En appel	Decrocher	En appel	OUI
	@Test
	public void test24()
	{
		Phone oPhone = new Phone();
		oPhone.set_etat(CodeEtat.ENAPPEL);
		oPhone.decrocher();
		assertEquals(CodeEtat.ENAPPEL, oPhone.get_etat());
	}
//	En appel	Raccrocher	Repos	
	@Test
	public void test25()
	{
		Phone oPhone = new Phone();
		oPhone.set_etat(CodeEtat.ENAPPEL);
		oPhone.raccrocher();
		assertEquals(CodeEtat.REPOS, oPhone.get_etat());
	}
//	En appel	Numéroter	En Appel	OUI
	@Test
	public void test26()
	{
		Phone oPhone = new Phone();
		oPhone.set_etat(CodeEtat.ENAPPEL);
		oPhone.numeroter();
		assertEquals(CodeEtat.ENAPPEL, oPhone.get_etat());
	}
//	En appel	DecrocherCor	En convers	
	@Test
	public void test27()
	{
		Phone oPhone = new Phone();
		oPhone.set_etat(CodeEtat.ENAPPEL);
		oPhone.decrocherCor();
		assertEquals(CodeEtat.ENCONV, oPhone.get_etat());
	}
//	En appel	RaccrocherCor	En Appel	
	@Test
	public void test28()
	{
		Phone oPhone = new Phone();
		oPhone.set_etat(CodeEtat.ENAPPEL);
		oPhone.raccrocherCor();
		assertEquals(CodeEtat.ENAPPEL, oPhone.get_etat());
	}
//	En Conversation	AppelEntrant	En convers	
	@Test
	public void test29()
	{
		Phone oPhone = new Phone();
		oPhone.set_etat(CodeEtat.ENCONV);
		oPhone.appelEntrant();
		assertEquals(CodeEtat.ENCONV, oPhone.get_etat());
	}
//	En Conversation	TimeOuT	En Conversation	
	@Test
	public void test30()
	{
		Phone oPhone = new Phone();
		oPhone.set_etat(CodeEtat.ENCONV);
		oPhone.TimeOut();
		assertEquals(CodeEtat.ENCONV, oPhone.get_etat());
	}
//	En Conversation	Decrocher	EnConversation	OUI
	@Test
	public void test31()
	{
		Phone oPhone = new Phone();
		oPhone.set_etat(CodeEtat.ENCONV);
		oPhone.decrocher();
		assertEquals(CodeEtat.ENCONV, oPhone.get_etat());
	}
//	En Conversation	Raccrocher	Repos	
	@Test
	public void test32()
	{
		Phone oPhone = new Phone();
		oPhone.set_etat(CodeEtat.ENCONV);
		oPhone.raccrocher();
		assertEquals(CodeEtat.REPOS, oPhone.get_etat());
	}
//	En Conversation	Numéroter	EnConversation	
	@Test
	public void test33()
	{
		Phone oPhone = new Phone();
		oPhone.set_etat(CodeEtat.ENCONV);
		oPhone.numeroter();
		assertEquals(CodeEtat.ENCONV, oPhone.get_etat());
	}
//	En Conversation	DecrocherCor	EnConversation	OUI
	@Test
	public void test34()
	{
		Phone oPhone = new Phone();
		oPhone.set_etat(CodeEtat.ENCONV);
		oPhone.decrocherCor();
		assertEquals(CodeEtat.ENCONV, oPhone.get_etat());
	}
//	En Conversation	RaccrocherCor	Décroché	
	@Test
	public void test35()
	{
		Phone oPhone = new Phone();
		oPhone.set_etat(CodeEtat.ENCONV);
		oPhone.raccrocherCor();
		assertEquals(CodeEtat.DECROCHE, oPhone.get_etat());
	}

}
