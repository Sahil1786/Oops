package compare;

public class Stdent implements Comparable<Stdent>{
    int rollno;
    float marks;

    public Stdent(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }


    @Override
    public int compareTo(Stdent o) {
        int diff=(int)(this.marks-o.marks);
        return diff;
    }
}
