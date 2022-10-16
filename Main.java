package homework_4_task_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String typeAnimalStr, nameAnimal;
        int ageAnimal;
        List<Animal> list = new ArrayList<Animal>();
        Type typeAnimal;
        do
        {
            System.out.println("Введите тип животного (COW, CAT, DOG, SNAKE):");
            typeAnimalStr = in.nextLine();
            if (!typeAnimalStr.equals("Достаточно"))
            {
                typeAnimal = Type.valueOf(typeAnimalStr);
                System.out.println("Введите имя животного");
                nameAnimal = in.nextLine();
                System.out.println("Введите возраст животного");
                ageAnimal = Integer.parseInt(in.nextLine());

                switch (typeAnimal) {
                    case COW: Animal cow = new Cow(nameAnimal,  ageAnimal, typeAnimal);;
                        list.add(cow);
                        break;
                    case CAT: Animal cat = new Cat(nameAnimal, ageAnimal, typeAnimal);
                        list.add(cat);
                        break;
                    case DOG: Animal dog = new Dog(nameAnimal, ageAnimal, typeAnimal);
                        list.add(dog);
                        break;
                    case SNAKE: Animal snake = new Snake(nameAnimal, ageAnimal, typeAnimal);
                        list.add(snake);
                        break;
                }
            }
        }
        while (!typeAnimalStr.equals("Достаточно"));
        System.out.println("Сортировка по типу");
        Collections.sort (list, new AnimalTypeComparator());
        for (Animal animal:list) {
            animal.tellMeWhoYouAre();
            System.out.println(animal.getName() + " " + animal.getAge());
        }
        System.out.println("Сортировка по возрасту");
        Collections.sort (list, new AnimalAgeComparator());
        for (Animal animal:list) {
            animal.tellMeWhoYouAre();
            System.out.println(animal.getName() + " " + animal.getAge());
        }
        System.out.println("Сортировка по имени");
        Collections.sort (list, new AnimalNameComparator());
        for (Animal animal:list) {
            animal.tellMeWhoYouAre();
            System.out.println(animal.getName() + " " + animal.getAge());
        }

        }

    }




