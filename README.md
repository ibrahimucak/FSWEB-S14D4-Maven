Proje Özeti: Java Abstraction
Bu proje, Java Abstraction kavramını kullanarak bir oyun ve satış ürünü simülasyonu oluşturmayı hedefliyor. Temel olarak iki ana kısımdan oluşuyor: Product For Sale ve Monster For Simple RPG Game.

1. Product For Sale
Bu kısımda, çeşitli ürünlerin özelliklerini tanımlamak için abstract sınıflar ve miras alma (inheritance) kullanıyoruz.

Adımlar:
ProductForSale abstract sınıfı:

type, price, ve description adında üç tane private değişken tanımlanır.
Bu değişkenlere karşılık gelen getter metodları yazılır.
Tek bir constructor metodu oluşturulup bu değişkenlerin değeri set edilir.
getSalesPrice(int quantity) metodu, ürünün fiyatı ile verilen miktarı çarparak satış fiyatını döner.
showDetails abstract metodu, alt sınıflarda her ürünün detaylarını ekrana bastırmak için kullanılır.
Chocolate, Coke, Bread sınıfları:

Her bir sınıf, ProductForSale sınıfından türetilir.
Her bir sınıf, ProductForSale'ın constructor metodunu kullanarak ortak özelliklere sahip olur, ayrıca kendine özgü ek özellikler ekler.
showDetails metodu, her ürünün özelliklerini ekrana anlaşılabilir bir şekilde yazdırır.
Store sınıfı:

listProducts metodu, parametre olarak aldığı ürünleri döngüyle gezerek her bir ürünün showDetails metodunu çağırır.
Main metodunda, bir dizi oluşturulur ve içerisine Chocolate, Coke, Bread ürünlerinden birer adet eklenir. Bu dizi listProducts metoduna parametre olarak geçirilir.
2. Monster For Simple RPG Game
Bu kısımda, abstract sınıflar, interface'ler ve miras alma kullanılarak bir RPG (rol yapma) oyununda kullanılacak yaratıklar tanımlanır.

Adımlar:
Monster abstract sınıfı:

name, hitPoints, ve damage adında üç instance variable tanımlanır.
Bir constructor metoduyla bu değişkenler set edilir.
Her bir değişken için getter metodları yazılır.
Troll sınıfı:

Monster sınıfından türetilir.
Bleedable ve Poisonable interface'leri implement edilir.
Bleedable interface'inde bleed metodu, yaratığın saldırı esnasında kanama durumunu hesaplar. Kanama oranı, damage değerinin %25'idir.
Poisonable interface'inde poison metodu, yaratığın saldırısının zehirleme durumunu hesaplar. Zehirleme oranı, damage değerinin %30'u kadardır.
attack metodu, saldırı anında yaratığın toplam hasarını hesaplar: getDamage() + bleed() + poison().
Özetle:
Abstraction ve Inheritance kullanılarak ürünler ve yaratıklar için soyut sınıflar oluşturuldu.
Ürünler için ortak özellikler ve metodlar ProductForSale sınıfında toplandı ve türetilen sınıflarda bu özelliklere ek olarak spesifik özellikler eklendi.
Yaratıklar için ise Monster sınıfı soyut bir temel oluşturdu ve Troll gibi spesifik sınıflar bu temelden türedi.
Interfaces (Bleedable, Poisonable) kullanılarak, yaratıkların ek davranışları modellenmiştir.
Bu yapılar sayesinde kod tekrarından kaçınılmış, esnek ve genişletilebilir bir tasarım oluşturulmuştur.
