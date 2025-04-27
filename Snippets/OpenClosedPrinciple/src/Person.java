public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void walk(Animal animal) {
        System.out.println(name + " is walking the " + animal.getClass().getSimpleName());
        animal.move();
    }
}
