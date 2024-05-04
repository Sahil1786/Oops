package generices;

import java.util.Arrays;
import java.util.Objects;

public class CustomgenArrylist <T> {
    private Object[] data;
    private static   int DefaultSize=10;
    private int size=0;
    public CustomgenArrylist(){
        this.data= new Object[DefaultSize]; // also working as a index value
    }

    public void add (T num){
        if(isfull()){

            resize();

        }
        data[size++]=num;



    }

    private void resize() {
        Object []temp=new Object[data.length*2];
        //copy the current items in new array
        for (int i =0;i< data.length;i++){
            temp [i]=data[i];

        }
        data =temp;
    }

    public boolean isfull(){
        return size ==data.length;
    }

    public  T remove (){
        T removed =(T)(data [--size]);
        return removed;
    }

    public T get(int index){
        return (T) data[index];
    }

    public  int size(){
        return size;

    }

    public void set(int index,T value){
        data[index]=value;
    }

    @Override
    public String toString() {
        return "CustomgenArrylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list =new ArrayList();
//        CustomgenArrylist list =new CustomgenArrylist();
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        System.out.println(list);
        CustomgenArrylist<Integer> LIST3 =new CustomgenArrylist<>();
        for (int i = 0; i < 14; i++) {
            LIST3.add(2*i);

        }
        System.out.println(LIST3);
    }

}
