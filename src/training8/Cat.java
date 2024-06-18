package training8;

public class Cat extends Animal{
	public void Sleep() {
		System.out.println("スースー");
	}
	
	@Override
	public void Speak()
	{
	    System.out.println( "ニャー" );
	}

}
