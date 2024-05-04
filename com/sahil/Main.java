package com.sahil;

public class Main {
    public static void main(String[] args) {
        Human sahil= new Human(12,"sahil hossain",12000,false);
        Human rik = new Human(11,"rick ",10000,true);
        System.out.println(sahil.population);
    }

    static void fun(){
        Main obj=new Main(); //   referece
        obj.greeting();
    }
    void greeting (){
        System.out.println("helleo world ");
    }
}
