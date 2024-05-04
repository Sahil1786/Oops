package Inharitance;

import com.sahil.sahil2.access.A;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box(4 ,8,8);
//        System.out.println(box.l + " "  + box.w + " " +box.h );
//        BoxWeight box3=new BoxWeight();
//        BoxWeight box4=new BoxWeight(2,3,4,8);
//
//        System.out.println( box3.h + " " + box3.weight);


//        BoxPrice box=new BoxPrice(5,8,200);
        Box box1 =new Box(4,6,9);
        Box box2=new Box(box1);
        box1.greeting();
        A a =new A(10,"sahil");
        System.out.println(box1 instanceof  Box);

    }
}
