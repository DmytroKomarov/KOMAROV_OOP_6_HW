package pkg_task2;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        System.out.println("Animals (inline): " + zoo.animals.toString());
        System.out.println();
        System.out.println("Animals: ");
        for (String animal : zoo.animals) {
            System.out.println(animal);
        }
    }
}
