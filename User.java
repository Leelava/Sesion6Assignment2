package Session6Assignment2;

public class User {
 String name;
 int Age;
 
 
public User(String name, int age) {
	super();
	this.name = name;
	Age = age;
}
 
 public void display(){
	 System.out.println("The user information are Name : " +this.name + " Age:"+this.Age);
 }
 public void validate_User(int age) throws NegativeAgeEception{
	 if (age < 0 )
		 throw new NegativeAgeEception(" Validation failed.you have entered the negative value for age." +this.Age);
	 else
		 this.display();
 }
 
 
}
