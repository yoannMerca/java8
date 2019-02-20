package testJava8;

public class NameParser {
	
    public <T> T parse(String name, Creator<T> creator) {
        String[] tokens = name.split(" ");
        String firstName = tokens[0];
        String lastName = tokens[1];
        return creator.create(firstName, lastName);
    }
    
    public <T> T parse(String name,String firstname, Creator<T> creator) {
        return creator.create(name, firstname);
    }
    
    public <T> T parse(String name,String firstname,int age, Creat<T> creator) {
        return creator.createWithAge(name, firstname, age);
    }
}

