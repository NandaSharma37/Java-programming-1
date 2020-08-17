//Q.1: Design a Calculator class which contains four lambda methods:
//a. add(a, b)
//b. difference(a, b)
//c. product(a, b)
//d. safeDivision(a, b)
//Also design the main methods which pass actual parameters to test the Calculator class.

interface lamda{
	int test(int a,int b);
}
public class Calculator {
	public static void main(String[] args) {
		lamda add=(a,b)->(a+b);
		lamda difference=(a,b)->(a-b);
		lamda product=(a,b)->(a*b);
		lamda safeDivision=(a,b)->{
			try {
				if(b==0) {
					throw new ArithmeticException();
				}
				else {
					return a/b;
				}
			}
			catch(ArithmeticException e) {
				System.out.println("We cannot divide with zero");
			}
			return 0;
		};
		System.out.println(add.test(80,30));
		System.out.println(difference.test(40,20));
		System.out.println(product.test(80,20));
		System.out.println(safeDivision.test(60,20));
	}
}