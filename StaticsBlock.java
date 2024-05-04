
/// demo tho show initilize of static variable

public class StaticsBlock {
  static int a=4;
  static  int b;
  static {
      System.out.println("I am in static Block"); //ONLY ONE TIME WILL RUN WHEN FIRST OBJ CALLED
      b=a*5;
  }

    public static void main(String[] args) {
        StaticsBlock obj =new StaticsBlock();
        System.out.println(StaticsBlock.a + " " + StaticsBlock.b);
        StaticsBlock. b +=3;
        StaticsBlock obj2=new StaticsBlock();
        System.out.println(StaticsBlock.a + " " + StaticsBlock.b);
    }

}
