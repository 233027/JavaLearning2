package com.esma.methodsandclasses;

public class Simpsons {//Erişebilirlik

    //public: halka açık
    //private: özel
    //protected: korunan , private ile aynı şey , sadece extends işlemi yaprsak kullanıyoruz
    private String name;// değikenleri private yaparsak sadece sınıfın içinde erişebiliriz
    private int age;
    private String job;

    public Simpsons(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    // getter ve setter kullanarak düzenleme yazdırma işlemlerini daha düzenli ve güvenli yapabiliriz
    public String getName() { // ismi yazdırmamıza yardımcı olucak
        return name;
    }

    public void setName(String name) { //isimi değitirmemize yardımı olucak
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
