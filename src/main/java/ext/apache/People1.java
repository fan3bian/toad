package ext.apache;

class People1 {
    //8(_mark) + 4(_klass) = 12
   int age = 20; //4
   String name = "Xiaoming";//4
}
class Person1 extends People1 {
    boolean married = false;//1
    long birthday = 128902093242L;//8
    char tag = 'c';//2
    double sallary = 1200.00d;//8
}