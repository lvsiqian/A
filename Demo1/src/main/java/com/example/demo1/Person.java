package com.example.demo1;

public class Person {
    int  age=60;
    void about(){
        System.out.println("my gae is"+age);
    }
    public  static  void main(String []args){
        Person p1=new Person();
        Person p2=new Person();
        p1.about();
        p2.about();
        String str1=new String("abc");
        String str2=new String("abc");
        String str3=str1;
        if(str1.equals(str2)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

}
