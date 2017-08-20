# Bubble Sort / Kabarcýk Sýralamasý

Kabarcýk sýralamasýnda arka arkaya gelen 2 veri karþýlaþtýrýlýp, büyük olan deðer küçük olan deðerle yer deðiþtirir.

```
Dizimiz => {5,7,2,9,6,1,3}

- 1.adým  => {5,2,7,6,1,3,9}

 - 2.adým  => {2,5,6,1,3,7,9}
 
  - 3.adým  => {2,5,1,3,6,7,9}
  
   - 4.adým  => {2,1,3,5,6,7,9}
   
    - 5.adým  => {1,2,3,5,6,7,9}
```

For döngümüz 1 kere çalýþtýðýnda(1.adým) dizinin en büyük elemaný sona geçmiþ oluyor. For döngümüz 2.kez çalýþtýðýnda ise artýk dizimizin son elemanýný karþýlaþtýrmasýna gerek yoktur çünkü en büyük eleman sona geçmiþ olacaktýr.

Daha iyi anlamak adýna þu animasyonu izleyebilirsiniz.

[![](http://www.farukgenc.com/Sorting-Animation/Bubble-Sort-Animation.gif)](http://www.farukgenc.com/Sorting-Animation/Bubble-Sort-Animation.gif)