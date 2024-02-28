package com.esma.methodsandclasses;

public class Musicians {

    //attribute
    String name;
    String instrument;
    int age;

    //sağ tık->Generate->Constructor


    //Constructor Nedir?: bir instance oluşturulduğunda çağrılıcak metot
    //Kullanıcı bana ne ismi ne enstumanı ne yaşı verirse al
    // bunşarı o sınıfın ismine enstrumanına yaşına eşitle
    public Musicians(String name, String instrument, int age) {
        this.name = name;
        this.instrument = instrument;
        this.age = age;
        System.out.println("constructor called");
    }
}
