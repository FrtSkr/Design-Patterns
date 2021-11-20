# Factory Pattern
Factory deseni, aralarında bir takım ilişki bulunan nesnelerin oluşturulmasında görev alan
bir arayüzdür. İstemci, ne yaratacağını bilir ama bunun nasıl yaratılacağıyla ilgilenmez.
İstemciyi nesne yaratma zahmetinden kurtaran bir kahramandır.
<p>
Bunu günlük hayatımızdan bir örnek ile açıklayacak olursam; Diyelim ki bir laptop 
almak istiyoruz. Herhangi bir markanın laptop ürettiğini biliriz ama bu markanın fabrikasının
laptobu hangi yöntemlerle ürettiğiyle ilgilenmeyiz.
</p>

---

```
interface IConverter {
    void convert(IConverter converter);
}
```
IConverter, bir code dönüştürücü arayüzüdür. Bu arayüzü implemente eden sınıflarımız (C, PHP, Python)
converter metodunu override ederek dönüştürme işlemlerini gerçekletiriyor.

---

```
// ConverterFactory sınıfı

public IConverter createConverter(String language){
        if(language.equalsIgnoreCase("C")){
            return new C();
        }else if(language.equalsIgnoreCase("PHP")){
            return new PHP();
        }else if(language.equalsIgnoreCase("Python")){
            return new Python();
        }
    }
```
ConverterFactory sınıfı, IConverter arayüzünü implemente eden sınıfların yaratılmasından sorumlu
fabrikamızdır. Böylelikle istemcinin nesne yaratma sorumluluğu soyutlanmış oldu.

```
// Main sınıfı = İstemci

 ConverterFactory cf = new ConverterFactory();

        IConverter converterPHP = cf.createConverter("PHP");
        IConverter converterC = cf.createConverter("C");
        IConverter converterPython = cf.createConverter("Python");


        converterPHP.convert(converterC);
        converterC.convert(converterPHP);
        converterPython.convert(converterC);

```

---

#### Peki neden nesne oluşturma sorumluluğunu istemciden soyutladık?
<p>Herhangi bir değişiklikte istemcinin etiklenmesini istemeyiz. 
Oluşturduğumuz sınıflarda (C, PHP, Python) gerçekleşecek olan bir 
değişiklik istemciyi etkilemeyecektir. Daha esnek ve test edilebilir
bir yapı oluşturacaktır.</p>