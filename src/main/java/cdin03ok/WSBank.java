package cdin03ok;

import java.util.Random;

public class WSBank implements IWS {

	public WSBank() {
		// TODO Auto-generated constructor stub
	}

	
	/* (non-Javadoc)
	 * @see cdin03ok.IWS#getTaux()
	 */
	public int getTaux()
	{
		//.....
		// Apple au WS de la bank;
		return (int) Math.rint(Math.random());
	}
}
