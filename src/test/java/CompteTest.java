import static org.junit.Assert.*;

import org.junit.Test;

import cdin03ok.Compte;
import cdin03ok.CompteSub;
import cdin03ok.WSBankStub;

public class CompteTest {

	@Test
	public void test0() {
		
		CompteSub oCmp = new CompteSub();
		oCmp.setWS(new WSBankStub());
		oCmp.crediter(1000, "$");

		assertEquals(2000, oCmp.getSolde("€"));
		
	}

}
