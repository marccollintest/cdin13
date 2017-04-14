package cdin03ok;

import cdin03ok.Phone2.Phone2CodeEtat;
import cdin03ok.Phone2.Phone2Action;

public class Phone2EtatREPOS extends Phone2Etat
{
	public Phone2EtatREPOS() {
		_codeEtat = Phone2CodeEtat.REPOS;
	}

	public Phone2Etat setAction (Phone2Action pAction)
	{
		switch(pAction)
		{
			case DECROCHER:
				return new Phone2EtatDECROCHE();
			case APPELENTRANT:
				return new Phone2EtatSONNERIE();
			default:
				return this;
		}
	}

	
}//Phone2Etat
