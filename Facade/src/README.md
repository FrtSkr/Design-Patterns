# Facade Pattern
Kompleks ve küçük parçalardan oluşan alt sistemi, kullanımı kolay ve daha basit bir arayüz
haline getiren desendir.
Böylelikle istemci tarafında alt sistemin direkt kullanımı soyutlanmış olur.
Yani alt sistemde yapılacak bir değişiklik istemciyi etkilemeyecektir. 
Proje birden fazla modül içeriyorsa veya çok katmanlı mimariye sahipse facade deseni 
kullanılabilir. Ayrıca alt sistem istemciden gizlenmek istenirse de kullanılabilir.

Facade sınıfı ile alt sistem birbirine sıkı sıkıya bağlı olmamalıdır. Yani facade kaldırıldığında
alt sistem istemci tarafında çalışıyor olmalıdır.

![UML](https://github.com/FrtSkr/Design-Patterns/blob/main/Facade/UML/FACADE_UML.png)

---

Örnek olarak, çoklu veritabanı kullanan sistemde ilgili veritabanına yapılacak 
sorguyu istemci tarafında facade ile gerçekleştirdim.

```
// Alt sistem

public class SQL implements IDatabaseConnection, IDatabaseQuery{
    @Override
    public void openConnection() {
        System.out.println("SQL: Bağlantı Açıldı.");
    }

    @Override
    public void closeConnection() {
        System.out.println("SQL: Bağlantı Kapatıldı.");
    }

    @Override
    public void query(String s) {
        System.out.println("SQL Sorgu: "+ s);
    }
}


```


```
// Alt sistem

public class Oracle implements IDatabaseQuery, IDatabaseConnection {
    @Override
    public void openConnection() {
        System.out.println("Oracle: Bağlantı Açıldı.");
    }

    @Override
    public void closeConnection() {
        System.out.println("Oracle: Bağlantı Kapatıldı.");
    }

    @Override
    public void query(String s) {
        System.out.println("Oracle Sorgu: "+ s);
    }
}


```

```
// İstemci için alt sistemin kullanımını kolaylaştıran
// facade sınıfı

public class Facade {
    private SQL sql;
    private Oracle oracle;

    public Facade() {
        this.sql = new SQL();
        this.oracle = new Oracle();
    }

    public void SQLQuery(String s){
        sql.openConnection();
        sql.query(s);
        sql.closeConnection();
    }

    public void OracleQuery(String s){
        oracle.openConnection();
        oracle.query(s);
        oracle.closeConnection();
    }
}
```

```
// İstemci

public class Main {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.SQLQuery("SQL QUERY ...");
        facade.OracleQuery("ORACLE QUERY");

    }
}
```
Eğer facade kullanmasaydık istemci tarafında SQL ve Oracle sınıflarından referans
oluşturacaktık. Sonra ilgili veritabanına bağlanarak sorgu isteği gönderecek daha sonra da
bağlantıyı kapatacaktık (huh yazarken yoruldum istemciyi bunu yaparken düşünemiyorun :) iyi ki varsın facade <3). 

Son olarak, eğer facade arayüzü kullanırken oluşturulması gereken nesne sayısı 
ve kurulması gereken ilişki sayısı mevcut sistemle aynı seviyede ise facade tasarımında bir yanlışlık var demektir.
 