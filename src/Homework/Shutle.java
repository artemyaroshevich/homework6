package Homework;

import java.util.Random;

public class Shutle implements IStart{

    @Override
    public boolean systemCheck() {
        Random random = new Random();

        return random.nextInt(10) > 3;
    }

    @Override
    public void engineStart() {
        System.out.println("Engines Shutle launched. All systems are normal");
    }

    @Override
    public void start() {
        System.out.println("Star Shutle");

    }
}
