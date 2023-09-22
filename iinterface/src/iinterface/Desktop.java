package iinterface;

public interface Desktop {
	
	void copy();
	void paste();
	void cut();
	void capture();
	
	public static void main (String[] args)
	{
		Dell d1=new Dell();
		d1.capture();
		
		Mobile m1=new Mobile();
		m1.copy();
	}

}
