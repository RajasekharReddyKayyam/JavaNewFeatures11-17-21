package Java17Features;

public class Switchandpatternmatching {
	public static void main(String[] args) {
		/*
		 * In Java 14, switch expressions were introduced as a preview feature,
		 *  allowing switch statements to return values.
		 *   They use the -> syntax for case labels, 
		 *   eliminating the need for break statements and preventing fall-through errors. 
		 *   Switch expressions can also handle multiple cases in a single line,
		 *    making code more concise. In multi-line case blocks, 
		 *    the yield keyword is used to return a value. 
		 *    This feature enhances readability, reduces boilerplate code,
		 *  and makes switch logic more flexible and expressive.
		 */
		 int d = 10;
	        
	        // Switch expression with return value
	        int result = switch (d) {
	            case 10 -> 10;  // Directly returns 10 if d is 10
	            case 20 -> 20;  // Returns 20 if d is 20
	            default -> {
	                // You can have more complex logic with yield
	                yield 0; // If d is not 10 or 20, return 0
	            }
	        };
	        
	        System.out.println("The result is: " + result);
	}

}
