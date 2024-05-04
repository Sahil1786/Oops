package com.sahil.sahil2.access;

public class ObjectDemo {
    int num;
    float gpa;
    public ObjectDemo(int num ,float gpa ){
        this.num=num;
        this.gpa=gpa;
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num==((ObjectDemo)obj).num;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();


    }

    public static void main(String[] args) {
         ObjectDemo obj=new ObjectDemo(12,56.73f);
         ObjectDemo obj2 =new ObjectDemo(72,33.87f);
         if(obj==obj2){
             System.out.println("obj 1 win");
         }
        if(obj.equals(obj2)){
            System.out.println("obj 1 win");
        }
    }
}
