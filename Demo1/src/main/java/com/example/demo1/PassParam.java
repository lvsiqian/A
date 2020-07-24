package com.example.demo1;

public class PassParam {
    int x;
    public static  void main(String [] args){
//        int x=5;
//        change(x);
//        System.out.println(x);
        PassParam obj=new PassParam();
        obj.x=5;
        change(obj);
        System.out.println(obj.x);
    }
//    private static void change(int x){
//        x=3;
//    }
    public  static void change(PassParam obj){
        obj.x=3;
    }

}
class Chinese{
     static  String country="中国";
    String name;
    int age;
    void SingOurCountry(){
        System.out.println(country);
    }

}
class TestChinese{

    public static  void main(String []args)
    {
        System.out.println(Chinese.country);
        Chinese ch1=new Chinese();
        ch1.SingOurCountry();
        System.out.println(ch1.country);
    }
}
