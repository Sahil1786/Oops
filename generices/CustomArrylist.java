package generices;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrylist {
    private int [] data;
    private static   int DefaultSize=10;
    private int size=0;
    public CustomArrylist (){
        this.data= new int[DefaultSize]; // also working as a index value
    }

    public void add (int num){
        if(isfull()){

            resize();

        }
        data[size++]=num;



    }

    private void resize() {
        int []temp=new int[data.length*2];
        //copy the current items in new array
        for (int i =0;i< data.length;i++){
            temp [i]=data[i];

        }
        data =temp;
    }

    public boolean isfull(){
        return size ==data.length;
    }

    public  int remove (){
        int removed =(data [--size]);
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public  int size(){
        return size;

    }

    public void set(int index,int value){
        data[index]=value;
    }

    @Override
    public String toString() {
        return "CustomArrylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list =new ArrayList();
        CustomArrylist list =new CustomArrylist();
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
    }

}
