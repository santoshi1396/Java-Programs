//Write a program in C++ to display various type or arithmetic operation using mixed data type. 
class MixOperator{
	public static void main(String args[]){
	int a=5,b=7;
	float x=3.7f,y=8.0f;
	
	System.out.println("Two integers are 5 and 7 whereas float values are 3.7 and 8.0 ");
	
	System.out.println("Addition of 2 integer: "+(a+b));

	System.out.println("Addition of 2 float: "+(x+y));
	
	System.out.println("Addition of 1 integer and 1 float: "+(a+y));
	
	System.out.println("Substraction of 2 integer: "+(a-b));

	System.out.println("Substraction of 2 float: "+(x-y));

	System.out.println("Multiplication of 2 integer: "+(a*b));
	
	System.out.println("Multiplication of 2 float: "+(a*b));
	
	System.out.println("Multiplication of 1 integer and 1 float: "+(a*y));
	
	System.out.println("Division of 2 integer: "+(a/b));
	
	System.out.println("Division of 2 float: "+(x/y));
	
	System.out.println("Division of 1 integer and 1 float: "+(a/y));
	



	}



}