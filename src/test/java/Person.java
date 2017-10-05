public class Person {
    private final String name;
    private  final int age;
    public  Person(String name, int age){
        this.name=name;
        this.age =age;

    }
    @Override
    public  int hashCode(){
        return  name.hashCode()*age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
