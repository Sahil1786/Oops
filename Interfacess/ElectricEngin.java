package Interfacess;

public class ElectricEngin implements Engin{

    @Override
    public void start() {
        System.out.println("electric engin start");
    }

    @Override
    public void stop() {
        System.out.println("electric engin stop");
    }

    @Override
    public void acc() {
        System.out.println("electric engin acclerate");
    }
}
