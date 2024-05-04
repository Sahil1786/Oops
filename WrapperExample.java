


public class WrapperExample {

    public static void main(String[] args) {

               final    A sahil =new A ("sahil hossain");

        int a =10;
        Integer num =45;

//        final  int bonus =2;
//        bonus=3;
    }


}

class A {
    final int Num =10;
    String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
