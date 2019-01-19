package com.traffic;

public class Initail {
    public static void main(String[] args) {
        Transportation obj1 = new Transportation();
        Transportation obj2 = new Bus();
        Transportation obj3 = new Airport();

        obj1.transportPerson();
        obj2.transportPerson();
        obj3.transportPerson();
    }
}
