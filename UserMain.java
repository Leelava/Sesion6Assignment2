package Session6Assignment2;

import java.util.Scanner;

//Reads user details and age and creates User object. Calls validate_user method which throws the custom exception.
//This call is made inside the try-catch block.
public class UserMain {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);

		
		System.out.println("Keyin the user name");
		
		String  userName = s.next();
		
		System.out.println("Keyin the age");
		
		int age = s.nextInt();
		
		User u1 = new User(userName,age);
		try{
			
			u1.validate_User(age);// this throws Custom Exception in case of negative age
			
		    }catch(NegativeAgeEception e)
		{
			e.printStackTrace();
			System.out.println("Inside custom Exception");
		}

	}

}
