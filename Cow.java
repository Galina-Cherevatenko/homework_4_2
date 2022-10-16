package homework_4_task_2;

public class Cow extends Animal {


    public Cow(String name, int age, Type type) {
        super(name, age, type);
    }

    @Override
        public void tellMeWhoYouAre () {
            System.out.print("корова ");
        }
    }

