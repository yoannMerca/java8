package testJava8;

@FunctionalInterface
public interface Creator<T> {
    T create(String firstName, String lastName);
}
