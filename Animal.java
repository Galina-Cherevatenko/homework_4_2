package homework_4_task_2;

public abstract class Animal {
    private String name;
    private int age;
    Type animalType;
    public Animal(String name, int age, Type type) {
        animalType = type;
        this.name = name;
        this.age = age;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Type getAnimalType() {
        return animalType;
    }

    public void tellMeWhoYouAre(){
        System.out.print("Я не знаю, кто я");
    }

}
