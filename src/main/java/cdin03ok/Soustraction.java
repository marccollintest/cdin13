package cdin03ok;


public class Soustraction  {
	
	private int _op1;
	private int _op2;
	
	public Soustraction(int pop1, int pop2) 
	{
		set_op1(pop1);
		set_op2(pop2);
	}
	public int get_op1() {
		return _op1;
	}
	public void set_op1(int _op1) {
		this._op1 = _op1;
	}
	public int get_op2() {
		return _op2;
	}
	public void set_op2(int _op2) {
		this._op2 = _op2;
	}
	public int calcule()
	{
		return _op1-_op2;
	}//calcule
	
}
