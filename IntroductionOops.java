public class IntroductionOops {
    public static void main(String[] args) {



        Student [] students =new Student[5];
        Student sahil = new Student(12,"sahil sonia",98.7f) ;
      /// " sahil.rno=1;
     ///   sahil.Name="Sahil Hossain";
       /// sahil.marks=98.2f;

        System.out.println(sahil.rno);
        System.out.println(sahil.Name);
        System.out.println(sahil.marks);
//        sahil.changemane("SONIA");
//        sahil.gretting();

        Student random =new Student(sahil);
        System.out.println(random.Name);
        Student ranadom2 =new Student();
        System.out.println(ranadom2.Name);

    }


    // create class

}
class Student {
    int  rno ;
    String Name;
    float  marks;
    void changemane(String newName){
        this.Name=newName;
    }

    Student(Student other){
        this.Name=other.Name;
        this.rno=other.rno;
        this.marks=other.marks;
    }
void gretting(){
    System.out.println("hwllo ! my  name is " + this.Name);
}
//    Student(){
//        this.rno=13;
//        this.Name="sahil";
//        this.marks=98.5f;
//    }
Student (){
        this(12,"default name",100f);
}

    Student( int roll ,String nam, float result){
      rno=roll;
Name=nam;
        marks=result;
    }

}


