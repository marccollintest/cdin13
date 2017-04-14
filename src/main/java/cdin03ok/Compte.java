package cdin03ok;

public class Compte {

	protected IWS _WS;
	private int _Montant;
	public Compte() {
		
		_WS = new WSBank();
		_Montant = 0;
	}

	public void debiter(int pMontant , String pDevise)
	{
		_Montant = _Montant - (_WS.getTaux()*pMontant);
	}
	public void crediter(int pMontant , String pDevise)
	{
		_Montant = _Montant + (_WS.getTaux()*pMontant);
	}
	public int getSolde(String pDevise)
	{
		if (pDevise.equals("€"))
		{
			return _Montant;	
		}
		else
		{
			return _Montant*_WS.getTaux();
		}
	}
	public void FTO_setWS(IWS pWS)
	{
		_WS = pWS;
	}

}
