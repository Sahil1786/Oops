package abstractDemo;

public class Son extends Parent{
    public Son(int age ){
super(age);
}
    @Override
    void carrer() {
        System.out.println("i am going to be a docter ");
    }

    @Override
    void partner() {
        System.out.println("i love black panther");
    }
}
