# Quick Sort / Hýzlý Sýralama

-> Dizinin ilk indisi pivot olarak seçilir.(Rastgele de seçilebilir.) Sonrasýnda 2.eleman **sol**, dizimizin en sonundaki eleman ise **sað** deðiþkeniyle tutulur. Sonra pivot deðerimiz sol-sað deðiþkenleri ile karþýlaþtýrýlýr. Eðer soldaki tutulan eleman pivot deðerimizden **küçük** ise ve sað deðiþkeninde tutulan sayý pivottan **büyük** ise deðiþtirme iþlemi uygulanýr. Ve Ardýndan **sol** 1 adým saða, **sað** bir adým sol'a kaydýrýlarak tekrar karþýlaþtýrmaya devam edilir. Eðer ki þart saðlanmaz ise(sað tutulan eleman iþi bozdu mesela) sað'ý bir adým sola kaydýrarak devam ediyoruz.

-> Olayýn sonunda elimizde ilk baþta seçtiðimiz(pivot) deðerimizden küçükler solda büyükler saðda sýralanmýþ bir yapý oluþuyor. Bizde pivot deðerimizi bu 2 listenin arasýna(ortasýna) koyuyoruz. Ayný iþlemler oluþan sol dizi ve sað dizi için tekrarlanýyor.


-> Aþaðýdaki diyagramda pivot **ortadaki** eleman seçilmiþ ve i **sað** deðiþkeni j ise **sol** deðiþkenini temsil ediyor :) 
[![](http://www.farukgenc.com/Sorting-Animation/quick-sort.png)](http://www.farukgenc.com/Sorting-Animation/quick-sort.png)


##### Daha iyi anlamak adýna þu animasyonu izleyebilirsiniz.

[![](http://www.farukgenc.com/Sorting-Animation/Quicksort-Animasyon.gif)](http://www.farukgenc.com/Sorting-Animation/Quicksort-Animasyon.gif)