package cdin03ok;

import cdin03ok.Phone2.Phone2Action;
import cdin03ok.Phone2.Phone2CodeEtat;

public class Phone2EtatENCONV extends Phone2Etat
{
	
	public Phone2EtatENCONV() {
		_codeEtat = Phone2CodeEtat.ENCONV;
	}

	public Phone2Etat setAction (Phone2Action pAction)
	{
		switch(pAction)
		{
			case RACCROCHER:
				return new Phone2EtatREPOS();
			case RACCROCHERCOR:
				return new Phone2EtatDECROCHE();
			default:
				return this;
		}
	}

}//Phone2Etat
