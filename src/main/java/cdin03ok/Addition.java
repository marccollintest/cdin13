package cdin03ok;


public class Addition  {
	
	private int _op1;
	private int _op2;
	
	public Addition(int pop1, int pop2) 
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
		return(get_op1()+get_op2());
	}//calcule
	
	@Override
	public boolean equals(Object obj) {
		//Si c'est le même objet c'est forcement vrai
		if (this == obj)
			return true;
		// Si l'objet à comparer est null => Faux
		if (obj == null)
			return false;
		// Si ce n'est pas la même classe => Faux
		if (this.getClass() != obj.getClass())
			return false;
		Addition other = (Addition) obj;
		if (this.calcule()==other.calcule())
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}//equals

	@Override
	public String toString() {
		return "Addition"; 
	}

	public void M1()
	{
		throw new IllegalArgumentException();
	}
	public void M2() throws InterruptedException
	{
		Thread.sleep(2000);
	}
}
