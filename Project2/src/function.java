//-----------------------------------------//
// MATH226 - Numerical Methods for EE
// Project 02
//
// Name-Surname: Utku Mutlu
// Student ID: 041502031
//-----------------------------------------// 


public class function {

	public static void main(String[] args) {


	}

	public static float select(int selected_function_number,  float x) {//this select function works like f(x)
		float e=(float) 2.72; //I defined Euler value
		float f =0; //I created f whic is equal to selected function
		switch(selected_function_number) {// I choose function according to selected_function_number
		case 1:
			f= (float) (Math.pow(x,3)-2*x-5);
			break;

		case 2:
			f= (float) (Math.pow(e,(-x))-x);
			break;
		case 3:
			f= (float) (x*Math.sin(x)-1);
			break;
		case 4:
			f= (float) (Math.pow(x,3)-3*Math.pow(x,2)+3*x-1);
			break;
		}
		return f;
	}
}
