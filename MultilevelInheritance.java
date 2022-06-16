package OOPs.inhertance;

class Animal  //grandparent
{
	
void eat()
{
System.out.println("eating");	
}
}

class Cat extends Animal //parent
{
void meao()
{
System.out.println("meao");	
}
}

class babycat extends Cat  //child
{
void cute()
{
System.out.println("she is so cute");	
}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		babycat baby=new babycat();
		baby.eat();
		baby.meao();
		baby.cute();

	}

}
