package abstractDemo;

public class Daughter extends Parent{

    public Daughter(int age ){
     super(age);
    }
    @Override
    void carrer() {
        System.out.println("I am  going to be a  coder " );
    }

    @Override
    void partner() {
        System.out.println("I love  iron man" );

    }
}
