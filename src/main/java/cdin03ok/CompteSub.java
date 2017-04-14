package cdin03ok;

public class CompteSub extends Compte {

	public CompteSub() {
	}
	//Injection de dépendance
	public void setWS(IWS pWS)
	{
		_WS = pWS;
	}

}
