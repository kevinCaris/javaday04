package ex_07;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Astronaut> astronauts;

    public Team(String name) {
        this.name = name;
        this.astronauts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Astronaut> getAstronauts() {
        return astronauts;
    }

    public void add(Astronaut astronaut) {
        if (astronaut != null) {
            astronauts.add(astronaut);
        } else {
            System.out.println(name + ": Sorry, you are not part of the team.");
        }
    }

    public void remove(Astronaut astronaut) {
        astronauts.remove(astronaut);
    }

    public int countMembers() {
        return astronauts.size();
    }
    public void doActions(Object param) {
        if (astronauts.isEmpty()) return;

        if (param == null) {
            System.out.println(name + ": Nothing to do.");
        }

        for (Astronaut astronaut : astronauts) {
            astronaut.doActions(param);
        }
    }
    public void showMembers() {
        if (astronauts.isEmpty()) return;

        StringBuilder result = new StringBuilder(name + ": ");
        for (int i = 0; i < astronauts.size(); i++) {
            Astronaut a = astronauts.get(i);
            result.append(a.getName())
                  .append(a.getDestination() != null ? " on mission" : " on standby");
            if (i < astronauts.size() - 1) {
                result.append(", ");
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Team spaceBro = new Team("SpaceBrothers");
        Astronaut mutta = new Astronaut("Mutta");
        Astronaut hibito = new Astronaut("Hibito");
        Astronaut serika = new Astronaut("Serika");
        spaceBro.add(mutta);
        spaceBro.add(hibito);
        spaceBro.add(serika);
        spaceBro.add(null); // not an Astronaut
        System.out.println(spaceBro.countMembers());
        Mars titi = new Mars();
        mutta.doActions(titi);
        spaceBro.showMembers();
        spaceBro.remove(hibito);
        System.out.println(spaceBro.countMembers());
        spaceBro.showMembers();
        
    }
}
