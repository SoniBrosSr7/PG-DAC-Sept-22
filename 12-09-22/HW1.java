import java.lang.*;

class HW1
{
	final strictfp public static void main(String args[])
	{
		System.out.println("Hello");
	}
}

/*
1. public static void main (String[] args) 			Running
2. public static void main (String args[])			Running
3. public static void main(String... args[])		Compile time error. 
4. static public void main(String args[])			Running (could be used interchangably)
5. public void main(String args[])					Compile time error. (main method is not static)
6. static void main(String args[])					Run time error. 
7. public void static main (Static args[])			Compile time error.
#reason: when we do not define any access modifier. By default the it is package private. Thus there is no 
compile time error but there would be run time error. 
8. abstract public static void main(String args[])	Compile time error
9. public static final void main(String args[])		Running
10.final public static void main(String args[])		Running	
#Final is also a method which is used when we do not want any subclass to override the method.
11.final strictfp public static void main(String args[])	Running
#strictfp is a keyword used for strict point keyword. 
*/