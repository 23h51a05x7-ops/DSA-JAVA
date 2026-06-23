package oops;

import src.Arrays.three_sum;

public class box_class_to_understand_inheritance {
    double l;
    double h;
    double w;
    box_class_to_understand_inheritance(){
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }
    box_class_to_understand_inheritance(double side){
        this.h=side;
        this.l=side;
        this.w=side;
    }
    box_class_to_understand_inheritance(double l,double h,double w){
        this.l=l;
        this.h=h;
        this.w=w;
    }
    box_class_to_understand_inheritance(box_class_to_understand_inheritance n){
        this.l=n.l;
        this.w=n.w;
        this.h=n.h;
    }
}
