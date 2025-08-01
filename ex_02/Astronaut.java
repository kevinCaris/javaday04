public class Astronaut {
   private String name;
    private int snacks;
    private String destination;
    private int id;
    private static int counter = 0;

    public Astronaut(String name) {
        this.name = name;
        this.snacks = 0;
        this.destination = null;
        this.id = counter++;
        System.out.println(name + " ready for launch !");
    }

    public int getId() {
        return id;
    }

    public String getDestination() {
        return destination;
    }
    public static void main(String[] args) {
        Astronaut mutta = new Astronaut("Mutta");
        Astronaut hibito = new Astronaut("Hibito ");
        System.out.println(mutta.getId());
        System.out.println(hibito.getId());
    }
}