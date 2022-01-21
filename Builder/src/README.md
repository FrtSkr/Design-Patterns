# Builder Pattern
Builder, bir nesnenin birden fazla farklı üretimi söz konusu olduğunda
devreye giren tasarım desenidir. Üretilecek nesneyi istemciden saklama konusunda da 
gayet başarılıdır.
Ayrıca kompleks yapıdaki bir nesneyi adım adım oluşturmak istendiğinde 
de kullanılabilir.


![BUILDER_UML](https://github.com/FrtSkr/Design-Patterns/blob/main/Builder/UML/Builder_UML.png)

---

Abstract factory ve builder arasındaki fark: Builder deseni tek bir ürünü
oluşturmaya yöneliktir, abstract factory ise belli bir ürün ailesini 
oluşturmaya yöneliktir.

Yaptığım örnekte farklı markaların telefon üretimini ele aldım.
```
// UML'de Product sınıfına denktir

public class Phone {

    public Phone() {
    }

    private String brand;
    private String model;
    private String OS;
    private int memory;
    private int RAM;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }
}
```

```
// UML'de Builder sınıfına denktir

public abstract class BuilderPhone {
    protected Phone phone;

    public  Phone getPhone(){
        return this.phone;
    }

    public abstract void setBrand();

    public abstract void setModel();

    public abstract void setOS();

    public abstract void setMemory();

    public abstract void setRAM();
}

```

BuilderPhone sınıfındaki soyut metodlara dikkat edecek olursak, Phone sınıfında
tanımlı değişkenlerin set metodları olduğu görülür.

```
// BuilderPhone sınıfından türemiş sınıf
// UML'de Concrete sınıfına denktir

public class Samsung extends BuilderPhone{
    public Samsung() {
        this.phone = new Phone();
    }

    @Override
    public void setBrand() {
        this.phone.setBrand("Samsung");
    }

    @Override
    public void setModel() {
        this.phone.setModel("Galaxy S10");
    }

    @Override
    public void setOS() {
        this.phone.setOS("Android 9.0 (Pie)");
    }

    @Override
    public void setMemory() {
        this.phone.setMemory(256);
    }

    @Override
    public void setRAM() {
        this.phone.setRAM(16);
    }
}
```

```
// BuilderPhone sınıfından türemiş sınıf
// UML'de Concrete sınıfına denktir

public class IPhone extends BuilderPhone {
    public IPhone() {
        this.phone = new Phone();
    }

    @Override
    public void setBrand() {
        this.phone.setBrand("IPhone");
    }

    @Override
    public void setModel() {
        this.phone.setModel("11 Pro Max");
    }

    @Override
    public void setOS() {
        this.phone.setOS("IOS 13");
    }

    @Override
    public void setMemory() {
        this.phone.setMemory(256);
    }

    @Override
    public void setRAM() {
        this.phone.setRAM(16);
    }
}
```

```
// İstemciden ürünü gizleyen ve ürünün oluşturulmasından sorumlu sınıfımız
// UML'de Director sınıfına denktir
// Constractor metodunda aldığı parametre ile Builder sınıfı ile olmazsa olmaz bir içerme ilişkisi sağlanmıştır

public class DirectorPhone {

    private BuilderPhone builderPhone;

    public DirectorPhone(BuilderPhone builderPhone) {
        this.builderPhone = builderPhone;
    }

    public void setBuilderPhone(BuilderPhone builderPhone) {
        this.builderPhone = builderPhone;
    }

    public void producePhone(){
        this.builderPhone.setBrand();
        this.builderPhone.setModel();
        this.builderPhone.setOS();
        this.builderPhone.setMemory();
        this.builderPhone.setRAM();

        showFeatures();
        System.out.println();
    }

    private void showFeatures(){
        System.out.println("Marka: "+ this.builderPhone.getPhone().getBrand());
        System.out.println("Model: "+ this.builderPhone.getPhone().getModel());
        System.out.println("İşletim Sistemi: "+ this.builderPhone.getPhone().getOS());
        System.out.println("Bellek: "+ this.builderPhone.getPhone().getMemory()+"GB");
        System.out.println("RAM: "+ this.builderPhone.getPhone().getRAM()+"GB");
    }
}
```
```
// İstemci hangi marka telefon üreteceğini bilir fakat bunun nasıl üretileceği ile ilgilenmez
public class Main {

    public static void main(String[] args) {
        DirectorPhone directorPhone = new DirectorPhone(new Samsung());
        directorPhone.producePhone();

        directorPhone.setBuilderPhone(new IPhone());
        directorPhone.producePhone();
    }
}
```

Görüldüğü gibi iki markada (Samsung, IPhone) telefon üretiyor fakat üretilen
telefon markaya göre farklılık gösteriyor.