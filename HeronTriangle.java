//Write a program in C++ to find the area of any triangle using Heron's Formula.   
class HeronTriangle{
	public static void main(String args[]){
	
	int a=5,b=5,c=5;
	double s = (a+b+c)/2;
	double area;
	area = Math.sqrt(s*(s-a)*(s-b)*(s-c));	
	
	System.out.println("Area of Any Trianhle using Heron's formula is: "+area);
	}

}