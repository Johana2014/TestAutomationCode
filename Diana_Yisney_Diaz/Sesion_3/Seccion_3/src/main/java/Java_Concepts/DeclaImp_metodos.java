package Java_Concepts;

public class DeclaImp_metodos {
	public static void main(String[] args)
	{
		//String is an objet  // String Literal
		//String s = "Rahul Shetty Academy";
		String s1 = "Rahul Shetty Academy";
		String s5 = "Hello";
		
		//new 
		String s2 = new String ("Welcome");
		String s3 = new String ("Welcome");
		
		String s = "Rahul Shetty Academy";
		String [] splittedString  = s.split("Shetty");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());
		
		for(int i = s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
			
	}

}
