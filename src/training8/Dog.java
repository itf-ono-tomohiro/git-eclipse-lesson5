package training8;

public class Dog extends Animal{
	public void Run(){
		System.out.println("トコトコ");
	}
	
	@Override
	public void Speak()
	{
	    System.out.println( "ワンワン" );
	}

}
