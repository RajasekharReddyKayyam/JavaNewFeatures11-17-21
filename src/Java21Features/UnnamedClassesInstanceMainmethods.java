package Java21Features;

public class UnnamedClassesInstanceMainmethods {
	
	
	/*
	 * In Java 21, unnamed classes, such as anonymous and local classes,
	 *  are more flexible and easier to use, especially with enhancements like 
	 *  pattern matching. These classes can now have more concise structures, 
	 *  making it simpler to implement interfaces or extend classes without
	 *   needing a named class. The main method in Java 21 can leverage these 
	 *   unnamed classes for quick and temporary implementations, streamlining code. 
	 *   Additionally, Java 21 allows the use of record types and simplified 
	 *   syntax in the main method, further reducing boilerplate. Overall, t
	 *   he updates make working with unnamed classes and the main method more
	 *    expressive and efficient.




	 */
	//Example Of instance main method 
	void main() {
		System.out.println("main");
	}
	
	//Unnamed classes cannot implement interface they extends by Object class
	//They are final resides in unnamed package
	//This unnamed Class only have one constrcutor i.e is Defalut no-Arg constructor
	//This classes must have main method main()

}
