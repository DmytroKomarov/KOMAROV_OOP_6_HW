package pkg_task3;
import pkg_task2.Zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        System.out.println(zoo.animals.size() + " animals before remove: " + zoo.animals.toString());

        zoo.animals.remove(7-1);
        zoo.animals.remove(5-1);
        zoo.animals.remove(3-1);

        System.out.println(zoo.animals.size() + " animals after remove: " + zoo.animals.toString());

    }
}
