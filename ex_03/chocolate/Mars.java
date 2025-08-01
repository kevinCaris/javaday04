package ex_03.chocolate;

public class Mars {
    private int id;
    private static int counter = 0;

    public Mars() {
        this.id = counter++;
    }

    public int getId() {
        return id;
    }
    public static void main(String[] args) {
        Mars rocks = new Mars();
        Mars lite = new Mars();
        Mars snack = new Mars();
        System.out.println(rocks.getId());
        System.out.println(lite.getId());
        System.out.println(snack.getId());
    }
}
