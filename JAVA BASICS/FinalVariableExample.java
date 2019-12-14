//program3(d)

//once we have declared the value of final variable we cannot change it

class FinalVariable 
{	
	
	final static String name = "mohan";	
	 
	 

	public static void main(String[] args) 
	{	
		
		 FinalVariable  a = new  FinalVariable ();
	
		
		name = "dinesh";//can not reassign the value to the final variable
		
	    System.out.println(name);
	}
}