//Q.7: Write a program, creating a Triangle class which contains a method that 
//takes three parameters of the three sides of the triangle,
//‘a’, ‘b’, ‘c’, and returns you with the area of the triangle and print it.

public class Triangle {
	float getValue(int a, int b, int c) {
		float s=(a+b+c)/2;
		float area=(float) Math.sqrt(s*(s-a)-(s-b)-(s-c));
		return area;
	}
	public static void main(String[] args) {
		Triangle obj = new Triangle();
		System.out.println("Area of triangle is:"+obj.getValue(2,3,5));
	}

}