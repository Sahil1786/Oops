package Interfacess;

public class NiceCar {
    private Engin engine;
    private  Media palyer = new CDPlayer();


    public NiceCar(Engin engine) {
        this.engine = engine;
    }

    public NiceCar() {
        engine = new PowerEngin();

    }


        public void start(){
            engine.start();

        }
        public void stop(){
            engine.stop();

        }
        public void startMuise(){
            palyer.start();

        }
        public void stopMuise(){
            palyer.stop();

        }
        public void  upgradeengin(){
            this.engine=new ElectricEngin();
        }
    }

