package homework_4_task_2;

public class Cat extends Animal {
    public Cat(String name, int age, Type type) {
        super(name, age, type);
    }

    @Override
    public void tellMeWhoYouAre () {
        System.out.print("кошка ");
    }
}