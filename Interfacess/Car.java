package Interfacess;

public class Car implements Engin , Break ,Media {
    @Override
    public void breke() {
        System.out.println("I break like a normal car");
    }

    @Override
    public void start() {
        System.out.println("I start engin  like a normal car");

    }

    @Override
    public void stop() {
        System.out.println("I stop engin like a normal car");

    }

    @Override
    public void acc() {
        System.out.println("I acc like a normal car");

    }
}
