//Write a program in C++ to check whether the primitive values crossing the limits or not.   

class PrimativeValues{
	
    void Emp(){
    char gender ='F';
    boolean isMarried = true;
    int noofsons =2;
    short yearofAppt = 2009;
     int YearlyPackage = 1500000;
    double height = 79.48;
    float gpa = 4.69f;
    long totalDrawn = 12047235L;
    long balance = 995324987;

   System.out.println("The Gender is : " + gender);
   System.out.println ("Is she married? : " + isMarried);
    System.out.println("Number of sons she has : " + noofsons );
    System.out.println("Year of her appointment : "+ yearofAppt);
    System.out.println("Salary for a year : "+ YearlyPackage);
    System.out.println ("Height is : " + height);
    System.out.println("GPA is "+ gpa);
    System.out.println ("Salary drawn upto : "+ totalDrawn);
    System.out.println("Balance till : "+ balance);
}

	public static void main(String args[]){
	PrimativeValues p= new PrimativeValues();
	p.Emp();

}
}