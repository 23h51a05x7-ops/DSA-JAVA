package oops.generics;

import java.net.Socket;
import java.util.Arrays;

public class custom_Gen_ArrayList<T> {
    private Object data[];
    private static int default_size=10;
    private int size=0;
    public custom_Gen_ArrayList(){
        data=new Object[default_size];
    }
    public void add(T num){
        if(isfull()){
            resize();
        }
        data[size++]=num;
    }
    private boolean isfull(){
        return size==data.length;
    }
    private void resize(){
        Object temp[]=new Object[data.length*2];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }
    public T remove(){
        T removed=(T)data[--size];
        return removed;
    }
    public T get(int i){
        return (T)data[i];
    }
    public int size(){
        return size;
    }
    public void set(int i,T value){
        data[i]=value;
    }
    public String toString(){
        return Arrays.toString(data);
    }
    public static void main(String[] args) {
        custom_Gen_ArrayList<Number>list=new custom_Gen_ArrayList<>();
        for(int i=0;i<14;i++){
            list.add(i);    
        }
        System.out.println(list);
        System.out.println(list.size());
    }
}
