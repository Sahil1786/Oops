package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        List<Integer> list2=new LinkedList<>();
        List <Integer>vector =new LinkedList<>();
        for (int i = 0; i <10 ; i++) {
            vector.add(i);
        }
        System.out.println(vector);
    }
}
