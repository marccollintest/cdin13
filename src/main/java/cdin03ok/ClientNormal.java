package cdin03ok;

public class ClientNormal extends Client {

	public ClientNormal( float _encours) {
		super("N", _encours);
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
				if (_encours>1000 && _encours<3000)
				{
					if (pMontant >5000)
					{
						bReturn = false;
					}
				}
		return bReturn;
	}//accepte

}
