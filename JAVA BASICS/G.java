
//An abstract class can extend a concrete class.

//case 2: A concrete class can extend an abstract class.

//Case 3: you can't instantiate an abstract class.


//Sub-class must either override the inherited 
//abstract method or declare itself abstract.

abstract class H
{
	abstract void go();
}

//Case 1 & 3:

class G extends H 
{
	void go(){
		System.out.println("Here we are overriding the method go() of abstract class H");
	}
	public static void main(String[] args){
		G x = new G();
		x.go();
	}
}
