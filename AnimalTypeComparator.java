package homework_4_task_2;

import java.util.Comparator;
public class AnimalTypeComparator implements Comparator <Animal> {
    @Override
    public int compare(Animal a1, Animal a2) {
        String AnimalType1 = a1.getAnimalType().getCode();
        String AnimalType2 = a2.getAnimalType().getCode();

        return AnimalType1.compareTo(AnimalType2);

    }
}

