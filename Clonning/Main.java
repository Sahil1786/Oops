package Clonning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human sahil=new Human(45,"sahil hossain");
//    Human twin=new Human(sahil);

        Human  twin =( Human)sahil.clone();
        System.out.println(twin.name + " " + twin.age);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0]=100;
        System.out.println(Arrays.toString(sahil.arr));
    }
}
