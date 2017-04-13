package cdin03ok;


public class Bidon {
	
	
	public void M1(int pParam)
	{
			throw new IllegalArgumentException("Param >10");
	}

	public void M2(int pParam)
	{
		try {
			Thread.sleep(pParam);
		} catch (InterruptedException e) {
		}
	}//M2
	

}//Bidon
