//Write a program in Java to check overflow/underflow during various arithmetical operation.   
class Overflow{
	public static void main(String args[]){
	int m=2147483647;
	System.out.println("Overflow the integer range and set in minimum range : "+(m+1));
	System.out.println("Increasing from its minimum range: "+(m+2));
	
	System.out.println("Product is: "+(m*m));
	
	int n=-2147483648;
	System.out.println("Underflow the integer range and set in maximum range : "+(n-1));
	System.out.println("Decreasing from its maximum range: "+(n-2));
	
	System.out.println("Product is: "+(n*n));


}


}