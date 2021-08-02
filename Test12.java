public class Test12{
	public static void main(String args[]){
	String str="Java";
	StringBuffer sbr= new StringBuffer(str);
	sbr.reverse();
	System.out.println(sbr);
	
	//conversion from String object to StringBuilder
	
	StringBuilder sbl=new StringBuilder(str);
	sbl.append("Values");
	System.out.println(sbl);
	}
}