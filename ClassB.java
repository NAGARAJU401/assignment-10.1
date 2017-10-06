package Mypackage;
//package : Package is name that organizes a set of related classes and interfaces similar to
public class ClassB {
	//public is a Java keyword which declares a member's access as public.
	//class can be defined as a template that describes the state that the object of its type support.

	public static void main(String[] args) 
		//Public is a keyword that is used as an access modifier for methods and variables.
		//static used to prepare a field,method or inner classes as a class field.
		//void: it is void if the method does not return a value.
		//main:it is a function name When a program starts running, it has to start execution from somewhere.
		//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
		// TODO Auto-generated method stub
	{
	System.out.println("The properties of a cat is:");
	//system : system is a class in java language.lang package
			//out : out is the static member of system class.It's type PrintStream
			//println: which is used to print the output.
			//Inside the brackets is value which to be printed
	ClassA demo=new ClassA();//creating an object
	System.out.println("here the classA methods have been called in another package");
	//system : system is a class in java language.lang package
	//out : out is the static member of system class.It's type PrintStream
	//println: which is used to print the output.
	//Inside the brackets is value which to be printed
    demo.drink();//calling drink
	demo.run();//calling run
	
	

	}

}
