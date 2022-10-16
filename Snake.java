package homework_4_task_2;

public class Snake extends Animal {
    public Snake(String name, int age, Type type) {
        super(name, age, type);
    }

    @Override
    public void tellMeWhoYouAre () {
        System.out.print("змея ");
    }
}
