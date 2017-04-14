package cdin03ok;


public class Phone {

	public enum CodeEtat {REPOS,DECROCHE,ENAPPEL,ENCONV,SONNERIE};

	private CodeEtat _etat;
	
	public Phone() {
		_etat = CodeEtat.REPOS;
	}

	public CodeEtat get_etat() {
		return _etat;
	}

	public void set_etat(CodeEtat _etat) {
		this._etat = _etat;
	}
	
	public void appelEntrant()
	{
		
		switch (_etat)
		{
		case REPOS:
			_etat=CodeEtat.SONNERIE;
		break;
		
		}
	}

	public void TimeOut()
	{
		
		switch (_etat)
		{
		case ENAPPEL:
			_etat=CodeEtat.DECROCHE;
		break;
		
		case SONNERIE:
			_etat=CodeEtat.REPOS;
		break;
		}
	}

	public void decrocher()
	{
		switch (_etat)
		{
		case SONNERIE:
			_etat=CodeEtat.ENCONV;
		break;
		case REPOS:
			_etat=CodeEtat.DECROCHE;
		break;
		
		}
	}
	public void raccrocher()
	{
		switch (_etat)
		{
		case DECROCHE:
			_etat=CodeEtat.REPOS;
		break;
		case ENAPPEL:
			_etat=CodeEtat.REPOS;
		
		case ENCONV:
			_etat=CodeEtat.REPOS;
		}
		
	}
	public void numeroter()
	{
		
		switch (_etat)
		{
		case DECROCHE:
			_etat=CodeEtat.ENAPPEL;
		break;
		
		}
	}
	public void raccrocherCor()
	{
		switch (_etat)
		{
		case ENCONV:
			_etat=CodeEtat.DECROCHE;
		break;
		
		}
	
	}
	public void decrocherCor()
	{
		
		switch (_etat)
		{
		case ENAPPEL:
			_etat=CodeEtat.ENCONV;
		break;
		
		}
	}
}
