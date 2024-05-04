package Inharitance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight () {
        this.weight = -1;
    }
    BoxWeight(BoxWeight other){
        super(other);
        weight=other.weight;
    }
    BoxWeight(double side ,double weight){
        super(side);
        this.weight=weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // call the parents class construor
        // use to initilise  values present in parents class
        this.weight = weight;
    }

}
