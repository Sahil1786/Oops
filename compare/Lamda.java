package compare;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class Lamda {
    public static void main(String[] args) {
  ArrayList<Integer> arr= new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i+1);
        }
//        arr.forEach((item)->{
//            System.out.println(item *2);
//        });
        Consumer<Integer> fun =(item)->System.out.println(item *2);
        arr.forEach(fun);

        optarion sum =(a,b)-> a+b;
        optarion pro =(a,b)-> a*b;


        Lamda funny=new Lamda();
        System.out.println( funny.oprate(2,4,sum));

    }
  private int oprate(int a, int b , optarion op){
        return op.optarion(a,b);
  }
}

interface optarion{
    int optarion(int a , int b);
}
