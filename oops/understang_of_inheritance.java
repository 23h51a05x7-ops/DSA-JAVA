package oops;

import java.nio.channels.Pipe.SourceChannel;

public class understang_of_inheritance {
    public static void main(String[] args) {

        //  here the inheritance is the extended class of the box_class_understand_inheritance 
        // such that inheriatnce class will have all propertirs of the parent class
        inheritance box3=new inheritance();
        System.out.println(box3.wght+" "+box3.h+" "+box3.l+" "+box3.w);

        inheritance box4=new inheritance(1,2,3,4);

        // we can access the all properties of the parent except the private variables or methods
        System.out.println(box4.h+" "+box4.l+" "+box4.w+" "+box4.wght);
        box_class_to_understand_inheritance box5=new inheritance(10,20,30,40);

    //    System.out.println(box5.wght);    a parent class may have refer to the child object but not accessable(wght)
    //     but it may access its all objects like l,h,w
    //    inheritance box6=new box_class_to_understand_inheritance(1,2,3); this will not work
    //     creating a box6 is referancing the inheritance class but the object of the box_class_to_understand_inheritance (will not work)
    Hierarchical_inheriyance obj=new Hierarchical_inheriyance(10);
    System.out.println(obj.area);
    System.out.println(obj.l);
    }
}
