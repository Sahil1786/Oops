package compare;

public class Main {
    public static void main(String[] args) {
        Stdent sahil=new Stdent(23,66.78f);
        Stdent rahul=new Stdent(29,90.078f);
        if (sahil.compareTo(rahul)<0){
            System.out.println(sahil.compareTo(rahul));
            System.out.println("rahul has more marks");
        }

    }
}
