package com.sahil.sahil2;

public class Singleton {
   int num =0;
    private  Singleton(){

    }
    private static Singleton instance;
    public static Singleton getInstance(){
        // chakeke wheather 1 obj created or not
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }

}
