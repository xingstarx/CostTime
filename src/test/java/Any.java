package test.java;

import main.java.Cost;

/**
 * Created by bazhang on 2017/3/1.
 */
public class Any {

    @Cost
    public void show(){
        System.out.println("show() is show");
    }

    public int getAge(){
        return 23;
    }

}
