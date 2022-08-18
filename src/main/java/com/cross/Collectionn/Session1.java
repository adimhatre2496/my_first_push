package com.cross.Collectionn;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.List;

@Log4j2

class Container<T extends Number>{

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    T value;

    public void show()
    {
        System.out.println(value.getClass().getName());
    }


    public void demoo(ArrayList<Integer> integers) {
    }
}
public class Session1 {
   /* public static void main(String[] args)
    {

         int value = 5;

        List<Integer> values=new ArrayList<>();
        values.add(45);
        values.add(value);

        System.out.println(values);

    }*/

    public static void main(String[] args) {

        Container<Number> obj=new Container<>();
        obj.value=89;
        obj.show();

        obj.demoo(new ArrayList<Integer>());
    }

}
