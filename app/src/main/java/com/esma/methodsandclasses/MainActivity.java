package com.esma.methodsandclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //Aynı değişekni farklı metotlar içinde kullanmak istiyorsan daha hiç bir şey
    //yapmadan bu değikeni onCreate metodundan önce tanımlamam lazım

    String usename;

    @Override//üzerine yazmak
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("on creat called");
        testMethod(); //oluşturduğumuz metodu onCreat in altına yazdık ilk açıldığında method çalışacak
        System.out.println(math(3,5));
        System.out.println(newMethod("Esma"));

        usename="";

        makeMusicians();

        makeSimpsons();
    }

    public void makeSimpsons(){
        Simpsons homer = new Simpsons("Homer",50,"Nuclear");
        System.out.println(homer.getAge());
        homer.setAge(51);
        System.out.println(homer.getAge());
    }
    public void makeMusicians(){

        //instance
        //Açtiğimiz musicians sınıfını burada boş bir obje olarak oluşturduk önce
        //sonra içine metota ayarladığımz sıraya göre değikenleri giriyoruz
        Musicians james = new Musicians("James","gitar",50);
        System.out.println(james.instrument);
    }


    //metot oluşturmada neler var:
    //erişilebilirliğini belirmek (public(herkes göre bilir),private(özel),protected(korunmuş))
    //metodunun ne döndüreceğini belirlemek [void(boşluk dödürecek),int, string gibi değerler de verebiliriz geriye bir int değer döndürecekse]
    //metoda isim koyma
    public void testMethod(){
        usename="Lars";
        int x=4+4;
        x=9;
        System.out.println("value of x: "+ x);
    }

    public int math(int a, int b){
        usename="Kirk";
        //x=10; bu hata verir çünkü başka metotun içinde tanımladığımız
        //değikeni başka metotta kullanamayız o değişken o metoda özeldir.
        //ama yeniden bir x değikeni tanımlayabiliriz.
        int x=11;
        System.out.println("value of x in math: " + x);
        return a+b; //bizden değer döndürmemizi ister
    }

    public String newMethod(String string){
        usename="Rob";
        return string + " new method";
    }

    //protected:korunmuş
    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("on resume called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("on stop called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("on pause called");
    }
}