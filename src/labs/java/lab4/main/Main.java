package lab4.main;

public class Main {

    public static void main(String[] args) {
        var runner = new Run();
        var university = runner.createTypicalUniversity();

        System.out.println("Університет: " + university.name);
        System.out.println("Голова університету: " + university.head.getFormatted());
    }
}