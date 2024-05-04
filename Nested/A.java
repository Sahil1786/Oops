package Nested;

import javax.swing.plaf.PanelUI;

public class A {
    // NESTED INTERFACE
    public interface NestedInterFace {
        boolean issOdd(int num);
    }
}
    class B implements A.NestedInterFace{
        @Override
        public boolean issOdd(int num) {
            return (num & 1)==1;
        }
    }

