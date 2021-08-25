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

    void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    void move() {
        for (int i = 0; i < horses.size(); i++) {
            horses.get(i).move();
        }
    }

    void print() {
        for (int i = 0; i < horses.size(); i++) {
            horses.get(i).print();
        }

        for (int j = 0; j < 5; j++) {
            System.out.println();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome(new ArrayList<>());
        game.getHorses().add(new Horse("Rabbit", 3, 0));
        game.getHorses().add(new Horse("Lady", 3, 0));
        game.getHorses().add(new Horse("Spirit", 3, 0));
        game.run();
    }
}
