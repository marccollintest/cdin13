package cdin03ok;

import cdin03ok.Phone2.Phone2Action;
import cdin03ok.Phone2.Phone2CodeEtat;

public class Phone2EtatSONNERIE extends Phone2Etat
{
	public Phone2EtatSONNERIE()
	{
		_codeEtat = Phone2CodeEtat.SONNERIE; 
	}
	
	
	public Phone2Etat setAction (Phone2Action pAction)
	{
		switch(pAction)
		{
			case DECROCHER:
				return new Phone2EtatENCONV();
			case TIMEOUT:
				return new Phone2EtatREPOS();
			default:
				return this;
		}
	}

}//Phone2Etat
