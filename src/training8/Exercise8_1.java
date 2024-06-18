package training8;

public class Exercise8_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.Name = "タマ";
		cat.Age = 3;
		dog.Name = "ポチ";
		dog.Age = 5;
		
		cat.ShowProfile();
		cat.Sleep();
		cat.Speak();
		dog.ShowProfile();
		dog.Run();
		dog.Speak();
		
		Animal[] animal = new Animal[4];
		animal[0] = new Cat();
		animal[1] = new Dog();
		animal[2] = new Cat();
		animal[3] = new Dog();
		
		for(int i = 0; i < animal.length;i++) {
			animal[i].Speak();
		}
		
		/*別解
		for(Animal pet:animal) {
			pet.Speak();
		}
		*/
	}

}
