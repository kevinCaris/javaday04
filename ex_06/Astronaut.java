package ex_06;

public class Astronaut {
    private static int counter = 0;
    private final int id;
    private final String name;
    private int snacks;
    private ex_03.planet.Mars destination;

    public Astronaut(String name) {
        this.name = name;
        this.id = counter++;
        System.out.println(name + " ready for launch !");
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public ex_03.planet.Mars getDestination() {
        return destination;
    }

    public int getSnacks() {
        return snacks;
    }

    public void doActions() {
        System.out.println(name + ": Nothing to do.");
    }

    public void doActions(Object param) {
        if (param instanceof ex_03.planet.Mars) {
            System.out.println(name + ": started a mission !");
            destination = (ex_03.planet.Mars) param;
        } else if (param instanceof ex_03.chocolate.Mars) {
            System.out.println(name + " is eating mars number " + ((ex_03.chocolate.Mars) param).getId() + ".");
            snacks++;
        }
    }

    @SuppressWarnings("removal")
    @Override
    protected void finalize() throws Throwable {
        if (destination != null) {
            System.out.println(name + ": Mission aborted !");
        } else {
            System.out.println(name + ": I may have done nothing, but I have " + snacks + " Mars to eat at least !");
        }
        super.finalize();
    }
}
