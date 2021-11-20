# Factory Pattern
Factory deseni, aralarında bir takım ilişki bulunan nesnelerin oluşturulmasında görev alan
bir arayüzdür. İstemci, ne yaratacağını bilir ama bunun nasıl yaratılacağıyla ilgilenmez.
İstemciyi nesne yaratma zahmetinden kurtaran bir kahramandır.

---

```
interface IConverter {
    void convert(IConverter converter);
}
```
IConverter, bir code dönüştürücü arayüzüdür. Bu arayüzü implemente eden sınıflarımız (C, PHP, Python)
converter metodunu override ederek dönüştürme işlemlerini gerçekletiriyorlar.

---

```
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
ConverterFactory sınıfımız, IConverter arayüzünü implemente eden sınıfların yaratılmasından sorumlu
fabrikamızdır. Böylelikle istemcinin nesne yaratma sorumluluğu soyutlanmış oldu.
