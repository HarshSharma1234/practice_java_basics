//3(e)program
//Final method is not modifiable by a subclass.

// Subclass inherits final methods and can access them,
//   but it can't override the inherited final method.

class X
{	
	final void go(){		
		System.out.println("final method is accessible by subclass");
	}
}

class FinalMethod extends X
{	
	/*void go(){
		System.out.println("we can not override final method");
	}*/

	public static void main(String[] args) 
	{		
		X w = new X();
		w.go();
	}	
}
