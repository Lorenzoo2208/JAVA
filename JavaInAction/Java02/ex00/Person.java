package JavaInAction.Java02.ex00;

public class Person {
    private String name;

    public static void main(String[] args) {
        Person p = new Person("Solid Snake");
        System.out.println(p.getName());
    }
    
    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
