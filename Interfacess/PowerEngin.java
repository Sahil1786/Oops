package Interfacess;

public class PowerEngin implements Engin{

    @Override
    public void start() {
        System.out.println("power engin start");
    }

    @Override
    public void stop() {
        System.out.println("power engin stop");
    }

    @Override
    public void acc() {
        System.out.println("power engin acclerate");

    }
}
