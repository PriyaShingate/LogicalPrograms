package Logical;

public class SingleTone {  //only one object return means singletone
	
	static  final SingleTone t=new SingleTone();
	
	private SingleTone() {
		
	}
	public static SingleTone getInstance()
	{
		return t;
	}
	

}

