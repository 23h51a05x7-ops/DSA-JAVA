package oops;
public class inheritance extends box_class_to_understand_inheritance {
    double wght;
    inheritance(){
        this.wght=-1;
    }
    inheritance(double l,double h,double w,double wght){
        // this.l=l;
        // this.h=h;           (in this we can use super class to make it easy)
        // this.w=w;
        super(l,h,w);
        this.wght=wght;
    }
}