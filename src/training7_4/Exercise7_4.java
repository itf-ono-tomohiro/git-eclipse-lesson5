package training7_4;

class Dog
{
    private String Name;
    private int age;
    private String type;
    
    public Dog(String type) {
    	this.type = type;
    }
    
    public void SetAge(int age) {
    	this.age = age;
    }

    public void SetName( String nm )
    {
        Name = nm;
    }

    public void ShowProfile()
    {
    	System.out.println( "犬種は、" + type + "です。" );
        System.out.println( "名前は、" + Name + "です。" );
        System.out.println( "年齢は、" + age + "歳です。" );
    }
}

public class Exercise7_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Dog dog = new Dog("ゴールデンレトリバー");
		dog.SetName("ポチ");
		dog.SetAge(5);
		dog.ShowProfile();

	}

}
