package Java17Features;

public class teaxtblocks {
	public static void main(String[] args) {
		/*
		 * In Java 17, text blocks are used to represent multi-line
		 * 
		 *  strings without the need for escape sequences. 
		 *  They begin and end with triple double-quotes """ and preserve 
		 *  formatting, including newlines and indentation.
		 *   This feature makes it easier to work with multi-line strings, 
		 *   such as JSON, SQL, or HTML, while maintaining readability. 
		 *   Text blocks also eliminate 
		 * the need for concatenation or escaping special characters like \n or \t. For example:
		 */
		 String json = """
		            {
		                "name": "John",
		                "age": 30,
		                "city": "New York"
		            }
		            """;
		        System.out.println(json);
		        
		        String name="""
		        		Raj
		        		""";
		        System.out.println(name);
	}

}
