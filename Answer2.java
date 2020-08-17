//Q.2: Create two classes:
//BaseClass
//The Rectangle class should have two data fields-width and height of int types. The class should have display() method, to print the width and height of the rectangle separated by space.
//DerivedClass
//The RectangleArea class is derived from Rectangle class, i.e., it is the sub-class of Rectangle class.The class should have read_input() method, to read the values of width and height of the rectangle. 
//The class should also overload the display() method to print the area (width*height) of the rectangle.

import java.util.Scanner;

class Rectangle
{
	int height;
	int width;
	void display(int width,int height) 
{
		System.out.println(width+" "+height);
	}
}
class Finding_Area extends Rectangle
{
	void read_inputs() 
{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		width= sc.nextInt();
		height=sc.nextInt();
	}
	void display() 
{
		System.out.println(width*height);
	}
	public static void main(String[] args) 
{
		Finding_Area obj = new Finding_Area();
		obj.read_inputs();
		obj.display(obj.width,obj.height);
		obj.display();
	}
}