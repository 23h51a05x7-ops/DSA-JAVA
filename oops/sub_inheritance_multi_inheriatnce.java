package oops;

public class sub_inheritance_multi_inheriatnce extends inheritance {
    double cost;
    sub_inheritance_multi_inheriatnce(){
        super();
        this.cost=-1;
    }   
    sub_inheritance_multi_inheriatnce(sub_inheritance_multi_inheriatnce dub){
        super(dub);
        this.cost=dub.cost; 
    }
    sub_inheritance_multi_inheriatnce(int l,int h,int w,int wght,int cost){
        super(l,h,w,wght);
        this.cost=cost;
    }
}
