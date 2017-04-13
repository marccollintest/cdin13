package cdin03ok;

public abstract class Client {
	protected String _type;
	protected float _encours;
	protected Client(String _type, float _encours) {
		super();
		this._type = _type;
		this._encours = _encours;
	}
	public abstract boolean accepte(float pMontant);
}//Client
