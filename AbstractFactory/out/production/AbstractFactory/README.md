# Abstract Factory Pattern
Factory desenimiz, birbirleriyle ilişkili nesnelerin oluşturulmasında görev alıyor demiştik.
Abstract Factory ise yine aralarında ilişkili fakat bir ürün ailesi olduğu durumlarda kullanılıyor.

Yaptığım örneği açıklayacam olursam: IArabaFabrikasi adında bir arayüzümüz var ve bu arayüzden türemiş iki adet 
sınıfımız (MerdecedesFabrikasi, FordFabrikasi) mevcut. Türemiş somut sınıflarımız (MerdecedesFabrikasi, FordFabrikasi) asıl işi yapan
yani markaya ait parçaları üretmekle yükümlü sınıflardır.

Ürün ailemizi oluşturan arayüzlerimiz de (IArabaKasasi, IArabaLastigi) ilgili markaların ürünlerini ihtiyaca göre


