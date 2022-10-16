package homework_4_task_2;
import java.util.Comparator;
public class AnimalNameComparator implements Comparator <Animal> {
@Override
public int compare(Animal a1, Animal a2) {
        String AnimalName1 = a1.getName().toUpperCase();
        String AnimalName2 = a2.getName().toUpperCase();

        return AnimalName1.compareTo(AnimalName2);

        }
        }
