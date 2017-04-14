package cdin03ok;

import cdin03ok.Phone2.Phone2Action;
import cdin03ok.Phone2.Phone2CodeEtat;

public class Phone2EtatENAPPEL extends Phone2Etat
{
	
	public Phone2EtatENAPPEL()
	{
	_codeEtat = Phone2CodeEtat.ENAPPEL;
	}

	public Phone2Etat setAction (Phone2Action pAction)
	{
		switch(pAction)
		{
			case DECROCHERCOR:
				return new Phone2EtatENCONV();
			case RACCROCHER:
				return new Phone2EtatREPOS();
			case TIMEOUT:
				return new Phone2EtatDECROCHE();
			default:
				return this;
		}
	}

}//Phone2Etat
