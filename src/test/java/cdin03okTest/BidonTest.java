package cdin03okTest;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.LinkOption;

import javax.swing.JFrame;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cdin03ok.Bidon;

public class BidonTest {
	
	Bidon _obj;

	@Before
	public void setup()
	{
		_obj = new Bidon();
		System.out.println("Création du contexte");
	}
	@After
	public void teardown()
	{
		_obj = null;
		System.out.println("Suppresssion du contexte");
	}
	@Test(expected = IllegalArgumentException.class)
	//Test de la méthode M1 qui renvoie une exception
	public void testM1() {
		System.out.println("testM1");
		_obj.M1(15);
	}

	@Test
	//Test de la méthode M1 qui renvoie une exception
	public void testM1AvecParaminf10() {
		_obj.M1(5);
	}
	@Test(timeout = 1550)
	//Test de la méthode M2 qui attends n secondes
	public void testM2() {
		System.out.println("testM2");
		_obj.M2(1500);
	}
	
}






