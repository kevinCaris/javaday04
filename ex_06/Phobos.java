package ex_05.planet.moon.phobos;

import ex_03.planet.Mars;

public class Phobos {
    private Mars mars;

    public Phobos(Mars mars) {
        if (mars != null) {
            this.mars = mars;
            System.out.println("Phobos placed in orbit.");
        } else {
            System.out.println("No planet given.");
        }
    }

    public Mars getMars() {
        return mars;
    }
    public static void main(String[] args) {
        Mars titi = new Mars();
        Mars toto = new Mars();
        Phobos p1 = new Phobos(titi);
        Phobos p2 = new Phobos(toto);
        System.out.println(p1.getMars());
        System.out.println(p2.getMars());
    }
}
