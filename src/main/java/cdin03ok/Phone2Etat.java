package cdin03ok;

import cdin03ok.Phone2.Phone2CodeEtat;
import cdin03ok.Phone2.Phone2Action;

public abstract class Phone2Etat
{
	
	protected Phone2CodeEtat _codeEtat;
	
	public abstract Phone2Etat setAction (Phone2Action pAction);

	public Phone2CodeEtat get_codeEtat() {
		return _codeEtat;
	}

}//Phone2Etat
