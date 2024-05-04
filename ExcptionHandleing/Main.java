package ExcptionHandleing;

public class Main {
    public static void main(String[] args) {
        int a=0;
        int b=0;

        try {
            int c = a / b;
            String  name="sahil";
            if (name.equals("sahil")){
                throw new Myexecption("name is sahil");
            }
        }catch (Myexecption e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("this will be always excatuted");
        }

    }

    static  int divide (int a,int b) throws ArithmeticException{
        if(b==0){
            throw  new ArithmeticException("plese do no devide by zero");

        }
        return a/b;
    }
}
