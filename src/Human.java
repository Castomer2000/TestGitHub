public class Human {
    String name;
    int age;
    String work;

    public Human(String work) {
        this.name = "Vladimir";
        this.age = 40;
        this.work = work;
    }

    public Human(String name, int age, String work) {
        this.name = name;
        this.age = age;
        this.work = work;
    }

    void human(){
        System.out.println(name + "; " + age + "; " + work + ".");
    }
}
