package com.example.demo1;

public class MyClass {
    public  static  void main (String[] args){
       int x=2;
       if(x<3)
       {
           System.out.println("x<3");
       }else{
           System.out.println("x>=3");
       }
        x=3;
        switch (x){
            case 1:
                System.out.println("switch1");
                break;
            case 2:
                System.out.println("switch2");
                break;

            case 3:
                System.out.println("switch3");
                break;
        }
        int [] z=new int [100];
        //排序
        z=new int []{1,2,3,4};
        java.util.Arrays.sort(z);
        for (int i = 0; i <z.length ; i++) {
            System.out.println("x[" +i+"]="+z[i]);
        }
    }






}
