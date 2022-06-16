package OOPs;

class Rectangle
{
	private int length;
	private int breadth;

	//assigning value in above variables using constructor
	
	public Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}

	
	
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}



	//using setter method object can be initialize
	public void setLength(int length) {
		this.length = length;
	}



	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}


	//method for calculate perimeter of rectangle
	public  int calculatePerimeter()
	{
		
	int p=2*(this.length+ this.breadth);
		return p;
	}
	
	//method for calculate area of rectangle
	public int calculateArea()
	{
	
	   int a=(length*breadth);
	    return a;
	}

}//end class bracket



public class RectangleAreaPerimeter {

	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle(50, 40);
		int p=rectangle.calculatePerimeter();
		System.out.println("perimeter: " +p);
		int a=rectangle.calculateArea();
		System.out.println("Area: " +a);
		
		Rectangle rectangle1=new Rectangle();
		rectangle.setLength(30);
		rectangle.setBreadth(40);
		
		
	}

}
