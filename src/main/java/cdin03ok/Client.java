package cdin03ok;

public class Client {
	private String _type;
	private float _encours;
	public Client(String _type, float _encours) {
		super();
		this._type = _type;
		this._encours = _encours;
	}
	public boolean accepte(float pMontant)
	{
		// et c'est l� que l'on met le code FFF
		// Cas de refus
		//Client � surveiller : Commande > 5000 
		//					    (encours >1000 et commande > 1000)
		//Client Normal : encours entre 1000 et 3000 et commande > 5000 ou 
		//                 encours>3000 et commande > 1000
		//Client Premium : Encours > 3000 et Commande > 5000
		boolean bReturn = false;
		if( _type.equals("N"))
			{
				if (_encours<3000)
				{
						bReturn = true;
				}
				if ( _encours>3000)
				{
					if (pMontant<1000)
					{
						bReturn = true;
					}
				}
			}
		if(_type.equals("P"))
			{
				if (_encours<3000)
				{
						bReturn = true;
				}
				if (_encours>3000 )
				{
					if (pMontant <5000)
					{
						bReturn = true;
					}
				}
			}
		if(_type.equals("S"))
			{
				if (_encours<1000)
				{
					if (pMontant <5000)
					{
						bReturn = true;
					}
				}
				if (_encours>1000 && _encours<3000)
				{
					if (pMontant <1000)
					{
						bReturn = true;
					}
				}
				if (_encours>3000 )
				{
					if (pMontant <1000)
					{
						bReturn = true;
					}
				}
			}

		return bReturn;
	}//accepte
}//Client
