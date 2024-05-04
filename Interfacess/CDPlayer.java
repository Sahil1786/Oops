package Interfacess;

public class CDPlayer implements Media {


    @Override
    public void start() {
        System.out.println("muice start");
    }

    @Override
    public void stop() {
        System.out.println("muise stop");
    }
}
