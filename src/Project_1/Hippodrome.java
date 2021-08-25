package Project_1;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    static Hippodrome game;

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public static void main(String[] args) {
        List<Horse> horses = new ArrayList<>();
        horses.add(new Horse("Rabbit", 3 , 0));
        horses.add(new Horse("Lady", 3 , 0));
        horses.add(new Horse("Spirit", 3 , 0));
        game = new Hippodrome(horses);
    }
}
