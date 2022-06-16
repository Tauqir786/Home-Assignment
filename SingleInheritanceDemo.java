package OOPs.inhertance;

//super/parent/base class

class User{
	public int id;
	public String name;
	public String address;
	public long phno;
	int x=10;
	
	public User(int id, String name, String address, long phno) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phno = phno;
	}
	
	public void setData(int id,String name,String address,long phno)
	{
	this.id=id;
	this.name=name;
	this.address=address;
	this.phno=phno;
	}
	
	public void getData()
	{
		System.out.println("Id: "+ this.id);
		System.out.println("Name: "+ this.name);
		System.out.println("Address: "+ this.address);
		System.out.println("phon No: "+ this.phno);
	}
	
}

//sub/child,derived class
class Student extends User
{
	//own features
	public int rollno;
	public double marks;
    int x=100;
	
    
    public Student(int id, String name, String address, long phno,
    		int rollno,double marks)
    {
    	//reuse parent class constructor
    	super(id,name,address,phno); //invoke parent class constructor
    	this.rollno=rollno;
    	this.marks=marks;
    }
    
	void display()
	{
		int x=200;
		System.out.println("child class");
		System.out.println("local variable: "+x);//200
		System.out.println("Instance variable: "+this.x); //100
		System.out.println("parent Instance variable: "+super.x);//10
	}
	
	public void getData()
	{
		super.getData();
		System.out.println("Roll No: "+this.rollno); 
		System.out.println("Marks: "+this.marks);
	}
}


public class SingleInheritanceDemo {

	public static void main(String[] args) {
		/*Student student1=new Student();
		student1.setData(101, "nikhil", "sealdah", 9903456);
        student1.getData();
        student1.display();*/
        
        
        Student student1=new Student(102,"Tauqir Iqbal","Metiabruz",6786543,7,90);
        student1.getData();
	}

}
