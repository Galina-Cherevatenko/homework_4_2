package homework_4_task_2;
import java.util.Comparator;
public class AnimalAgeComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal a1, Animal a2) {
       if (a1.getAge() == a2.getAge()) {
           return 0;
       }
        if (a1.getAge() < a2.getAge()) {
            return -1;
        }
        return 1;

    }
}
