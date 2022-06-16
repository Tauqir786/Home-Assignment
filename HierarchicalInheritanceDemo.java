package OOPs.inhertance;

// parent class
class Bank
{
public void getInterestLoan()
{
System.out.println("8% Interest Rate...!");	
}
} // end parent class
// child class // multiple child
class SBI extends Bank
{
public void accountCreated()
{
System.out.println("Your Account has been Created");	
}
}
class HDFC extends Bank
{
public void atmPinGenerate()
{
System.out.println("ATM pin is 1254");	
}
}
class Axis extends Bank
{
public void creditCard()
{
System.out.println("Credit Card has been Approve");	
}
} //child class end
public class HierarchicalInheritanceDemo {

	public static void main(String[] args) {
		
		Axis axis = new Axis();
		axis.creditCard();
		axis.getInterestLoan();
		HDFC hdfc = new HDFC();
		hdfc.atmPinGenerate();
		SBI sbi = new SBI();
		sbi.accountCreated();
		
	}

}
