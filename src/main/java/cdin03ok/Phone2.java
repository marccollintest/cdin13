package cdin03ok;


public class Phone2 {

	public enum Phone2Action {DECROCHER,RACCROCHER,NUMEROTER,DECROCHERCOR,RACCROCHERCOR,APPELENTRANT,TIMEOUT};

	public enum Phone2CodeEtat {REPOS,DECROCHE,ENAPPEL,ENCONV,SONNERIE};

	private Phone2Etat _etat;
	
	public Phone2() {
		_etat = new Phone2EtatREPOS();
	}

	public Phone2CodeEtat get_etat() {
		return _etat.get_codeEtat();
	}

	public void FTO_set_etat(Phone2CodeEtat pEtat) {
		switch (pEtat)
		{
		case REPOS:
			_etat= new Phone2EtatREPOS();
			break;
		case DECROCHE:
			_etat= new Phone2EtatDECROCHE();
			break;
		case ENAPPEL:
			_etat= new Phone2EtatENAPPEL();
			break;
		case ENCONV:
			_etat= new Phone2EtatENCONV();
			break;
		case SONNERIE:
			_etat= new Phone2EtatSONNERIE();
			break;
		}
	}
	
	public void appelEntrant()
	{
		_etat = _etat.setAction(Phone2Action.APPELENTRANT);
	}
	public void TimeOut()
	{
		_etat = _etat.setAction(Phone2Action.TIMEOUT);
	}
	public void decrocher()
	{
		_etat = _etat.setAction(Phone2Action.DECROCHER);
	}
	public void raccrocher()
	{
		_etat = _etat.setAction(Phone2Action.RACCROCHER);
	}
	public void numeroter()
	{
		_etat = _etat.setAction(Phone2Action.NUMEROTER);
	}
	public void raccrocherCor()
	{
		_etat = _etat.setAction(Phone2Action.RACCROCHERCOR);
	}
	public void decrocherCor()
	{
		_etat = _etat.setAction(Phone2Action.DECROCHERCOR);
	}
}
