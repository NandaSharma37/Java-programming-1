//Q.5: Print the sum, difference and product of two complex numbers by creating a class named
//'Complex' with separate methods for each operation whose real and imaginary parts are entered by user.

import java.util.Scanner;

public class Complex {
    double real;
    double imag;

    Complex(){
    	
    }
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public static Complex sum(Complex n1, Complex n2)
    {
        Complex temp = new Complex();
        temp.real = n1.real + n2.real;
        temp.imag = n1.imag + n2.imag;

        return(temp);
    }
    public static Complex difference(Complex n1, Complex n2)
    {
        Complex temp = new Complex();
        temp.real = n1.real - n2.real;
        temp.imag = n1.imag - n2.imag;

        return(temp);
    }
    public static Complex product(Complex n1, Complex n2)
    {
        Complex temp = new Complex();
        temp.real = n1.real * n2.real;
        temp.imag = n1.imag * n2.imag;

        return(temp);
    }
    public static void main(String[] args) {
    	@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        Complex n1 = new Complex(sc.nextDouble(), sc.nextDouble());
        Complex n2 = new Complex(sc.nextDouble(), sc.nextDouble());
        Complex sum,difference,product;

        sum = sum(n1,n2);
        difference = difference(n1,n2);
        product = product(n1,n2);
        System.out.printf("Sum = %.1f + %.1fi\n", sum.real, sum.imag);
        System.out.printf("Difference = %.1f + %.1fi\n", difference.real, difference.imag);
        System.out.printf("Product = %.1f + %.1fi\n", product.real, product.imag);
    }
}