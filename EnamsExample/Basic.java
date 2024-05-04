package EnamsExample;

public class Basic {
    enum  Week{
        Mon,thu,wen,thus,fri,satur,sun;
        // these are enum constsants
        //publics ,statics ,finlnal---
        // since its final you can't child enums
        //type weeek


        Week() {
            System.out.println("construtor  called  for " +  this.toString());
            // THIS NOT PUBLICS OR PROTECTED
            //WE DONT CRETE NEW OBJECTS
            // THIS NOT  ENUM CONCEPTS

            //INTERNELY  : PUBLICS STATICS FIAL WEEK MONDAY=NEW WEEK();
        }
    }

    public static void main(String[] args) {
        Week week;
        week =Week.Mon;
        for (Week day:Week.values()
             ) {
            System.out.print(day);

        }
    }
}
