package testJava8;

public class Personne {
	 private String firstName;
	   private String lastName;
	   public Personne(String firstName, String lastName) {
	       this.firstName = firstName;
	       this.lastName = lastName;
	   }
	   public String getFirstName() { return firstName; }
	   public String getLastName() { return lastName; }
	   
	@Override
	public String toString() {
		return "Personne nom=" + firstName + ", prenom=" + lastName;
	}
	   
	  
}
