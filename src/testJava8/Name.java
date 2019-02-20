package testJava8;

public class Name {
	   private String firstName;
	   private String lastName;
	   private int age;
	   
	   public Name(String firstName, String lastName) {
	       this.firstName = firstName;
	       this.lastName = lastName;
	   }
	   
	   public Name(String firstName, String lastName, int age) {
	       this.firstName = firstName;
	       this.lastName = lastName;
	       this.age = age;
	   }
	   
	   public String getFirstName() { 
		   return firstName; 
		   }
	   public String getLastName() { 
		   return lastName; 
		   }
	@Override
	public String toString() {
		return "Name nom" + firstName + ", prenom=" + lastName +" age = "+ this.age;
	}
	   
	}