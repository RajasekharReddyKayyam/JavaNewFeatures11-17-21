package Java17Features;

record Car (String name,String owner){
	
}

 class records {
	public static void main(String[] args) {
		/*
		 * A record in java 17 is special type of a class which reduces the boiler plate code
		 * which are immutable and final by default 
		 * thease can have static fields and static methods 
		 * can have instance methods 
		 * thease can implements interfaces 
		 * 
		 */
		
		Car c= new Car("volvo","raj");
	System.out.println(c.toString());	//Car[name=volvo, owner=raj]
	}

}
