package homework_4_task_2;

public class Dog extends Animal {
    public Dog(String name, int age, Type type) {
        super(name, age, type);
    }

    @Override
    public void tellMeWhoYouAre () {
        System.out.print("собака ");
    }
}
