# Singleton Pattern

<p>Singleton, tek nesne yaratılması gereken durumlarda kullanılan desendir.
Yaratılan örneğe public erişim noktası sağlanmalıdır.</p>

---

**<p>Peki bunu nasıl yapabiliiz?</p>**
    
    1. Öncelikle singleton oluşturulacak sınıfın constructor metodunu dışarıdan erişime kapatmalıyız.
    2. Referans değişkenini static belirlemeliyiz.
    3. Yaratılan örneğe erişim için metod tanımlamalıyız.
    
```
 private static View view; // 2. kriterimiz

    private View() { // 1. kriterimiz
    }

    public static View getObj(){ // 3. kriterimiz

        if(view == null){

            view = new View();

        }

        return view;

    }
```
 
 ---

<p>Şimdi gelelim yapmış olduğum örneğe.</p>
<p>Bu örnekte bir mail kutumuz var ve bu mail kutumuzun 3 farklı dizaynı olacak.
Her dizayn için farklı nesneler üretmektense singleton yapısını kullanıp tek nesne üzerinden
bu görünümlere ulaşmak amaçlanmıştır.</p>


![resim](https://github.com/FrtSkr/Design-Patterns/blob/main/Singleton/MailBox/SS/ss.png)


<p>Tabi UI hazırlamadığım için somut görüntümüz yok ama üzülmeyin UI aratmayacak bir console çıktısı ürettim :))</p>

![resim](https://github.com/FrtSkr/Design-Patterns/blob/main/Singleton/MailBox/SS/ss1.png)




