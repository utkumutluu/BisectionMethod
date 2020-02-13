//-----------------------------------------//
// MATH226 - Numerical Methods for EE
// Project 02
//
// Name-Surname: Utku Mutlu
// Student ID: 041502031
//-----------------------------------------// 


import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int selected_function_number;
		int selected_method;
		float e= (float) 2.73;//I defined Euler value
		float a=0;//a is minimum value for Bisection method, and x0 value for secant method
		float b=0;//b is maximum value for Bisection method, and x1 value for secant method
		float tol=0;//tol is tollerance value
		float m=0;//m is middle point of a and b
		int sign_a=0;//a's sign
		int sign_m=0;//m's sign
		float x[] = new float[1000000];//i created very large x array
		int k=1;
		int iteration=0;



		System.out.println("Enter number of your function");
		System.out.println("1-)  x^3 - 2x - 5 = 0");
		System.out.println("2-)  e^(-x) - x = 0");
		System.out.println("3-)  x sin(x) -1= 0");
		System.out.println("4-)  x^3 - 3x^2 + 3x -1= 0");

		Scanner input = new Scanner(System.in);//I took selected function number
		selected_function_number = input.nextInt();

		System.out.println("Enter method(1-Bisection,2-Secant):");
		Scanner input5 = new Scanner(System.in);
		selected_method = input5.nextInt();//I asked which method is wanted

		

		if(selected_method==1) {
			System.out.println("Enter a value:");
			Scanner input2 = new Scanner(System.in);
			a = input2.nextFloat();//I took minimum number

			System.out.println("Enter b value:");
			Scanner input3 = new Scanner(System.in);
			b = input3.nextFloat();//I took maximum number
			
			System.out.println("Enter tollerance:");
			Scanner input4 = new Scanner(System.in);
			tol = input4.nextFloat();//I took tollerance number

			
			
			if(sign(function.select(selected_function_number,a))!=sign(function.select(selected_function_number,b))) {
				System.out.println("BISECTION METHOD");
				System.out.println("Iteration    a        f(a)      b       f(b)    ");
				while((b-a)>tol) {//while is looping according a bisection method's first rule
				m=a+(b-a)/2;// middle point formula
				System.out.println(iteration+"-)        " +a +"      "+ function.select(selected_function_number,a) +"    " + b +"     " + function.select(selected_function_number,b));
				if(sign(function.select(selected_function_number,a))==sign(function.select(selected_function_number,m))) {
					a=m;//if a and m are the same sign, a equals to m 
				}
				else  {
					b=m;//if a and m are not the same sign, b equals to m
				}
				iteration++;

			}
			}
			else {
				System.out.println("No root on between "+a+"and " +b);
			}
			System.out.println("---------------");
		}

		else if(selected_method==2) {
			System.out.println("Enter x0 value:");
			Scanner input2 = new Scanner(System.in);
			a = input2.nextFloat();//I took x0

			System.out.println("Enter x1 value:");
			Scanner input3 = new Scanner(System.in);
			b = input3.nextFloat();//I took x1
			
			System.out.println("Enter tollerance:");
			Scanner input4 = new Scanner(System.in);
			tol = input4.nextFloat();//I took tollerance number
			
			
			x[0]=a;
			x[1]=b;
			System.out.println("SECANT METHOD");
			System.out.println("Iteration     a        f(a)      x[k]-x[k-1]");
			while(Math.abs(x[k+1]-x[k])>tol) {
			x[k+1]=x[k]-(function.select(selected_function_number,x[k])*(x[k]-x[k-1])/(function.select(selected_function_number,x[k])-function.select(selected_function_number,x[k-1])));//while is looping according a secant method's first rule
			System.out.println(iteration+"          "+x[k-1]+"    "+function.select(selected_function_number,x[k-1])+"  "+(x[k]-x[k-1]));
			k++;
			iteration++;
			}
			
			
			
		}
		
		else {
			System.out.println("Please enter 1 or 2");
		}

	}



	public static float sign(float x) {// this function return -1 if x smaller than 0, otherwise return 1
		float y;
		if(x>=0) {
			y=1;
		}
		else {
			y=-1;
		}
		return y;
	}
}



