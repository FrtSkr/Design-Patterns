# Abstract Factory Pattern
[Factory desenimiz](https://github.com/FrtSkr/Design-Patterns/blob/main/Factory/src/README.md), birbirleriyle ilişkili nesnelerin oluşturulmasında görev alıyor demiştik.
Abstract Factory ise yine aralarında ilişkili fakat bir ürün ailesi olduğu durumlarda kullanılıyor.

---

Örneğimizi kısaca açıklayacak olursam; Bir araba fabrikamaız var ve ilgili markaların isteğine göre parçalarını üretip
birleştiriyor.


![UML](UML/AbstractFactoryUML.png)


Client'te (Main) hangi markanın parçaları üretileceği belirlenir 
(IArabaFabrikası referansıyla üretilen nesnemiz) ve FabrikaOtomasyon sınıfının 
constructor metoduna yollanarak ilgili parçalar üretilir. Ardından Otomasyon sınıfının parcalariBirlestir metodu
çağrılarak üretilen parçalar birleştirilir.

---



