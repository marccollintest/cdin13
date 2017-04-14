package cdin03ok;

import cdin03ok.Phone2.Phone2CodeEtat;
import cdin03ok.Phone2.Phone2Action;

public class Phone2EtatDECROCHE extends Phone2Etat
{
	
	public Phone2EtatDECROCHE() {
		_codeEtat = Phone2CodeEtat.DECROCHE;
	}

	public Phone2Etat setAction (Phone2Action pAction)
	{
		switch(pAction)
		{
		case NUMEROTER:
			return new Phone2EtatENAPPEL();
		case RACCROCHER:
			return new Phone2EtatREPOS();
			default:
				return this;
		}
	}

}//Phone2Etat
