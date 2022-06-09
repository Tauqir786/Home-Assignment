package OOPs;

public class Student {
	// instance variable
	int studentId; // default value :0
	String studentName; // default value:null
	String studentAddress; 
	long phNo;
	
	public void setData(int id, String name,String address,long ph)
	{
		studentId=id;
		studentName=name;
		studentAddress=address;
		phNo=ph;
	}
	
	public void getData()
	{
		System.out.println("Student Id : "+studentId +" Student Name : "+studentName+" "
				+ " "+"Student Address : "+studentAddress+" "+"Student phn no : "+phNo);
	}

public static void main(String[] args) {
	Student Tauqir=new Student();
	Tauqir.setData(100, "AB Develliers"," South Africa ", 7364);
	Tauqir.getData();
	
}
}
