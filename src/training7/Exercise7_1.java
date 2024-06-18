package training7;

class Dog
{
    private String Name;
    private int age;
    
    public void SetAge(int age) {
    	this.age = age;
    }

    public void SetName( String nm )
    {
        Name = nm;
    }

    public void ShowProfile()
    {
        System.out.println( "名前は、" + Name + "です。" );
        System.out.println( "年齢は、" + age + "歳です。" );
    }
}

public class Exercise7_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Dog dog = new Dog();
		Dog dog2 = new Dog();
		dog.SetName("ポチ");
		dog.SetAge(5);
		dog2.SetName("たろう");
		dog2.SetAge(3);
		dog.ShowProfile();
		dog2.ShowProfile();

	}

}
