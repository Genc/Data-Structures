# Selection Sort / Seçmeli Sýralama

Dizimizdeki en küçük eleman bulunur ve baþa alýnýr bu tüm listenin gezilmesi ile saðlanýr. Ýlk indisten baþlayýp dizinin sonuna kadar gidip, karþýlaþtýrmalar yapýlýp daha küçük bir sayý bulunduysa yer deðiþtirilip bu sefer döngümüz bir sonraki indisten baþlayýp devam etmelidir.(optimize)

```
Dizimiz => {5,7,2,9,6,1,3}

- 1.adým  => {1,7,2,9,6,5,3}

 - 2.adým  => {1,2,7,9,6,5,3}
 
  - 3.adým  => {1,2,3,9,6,5,7}
  
   - 4.adým  => {1,2,3,5,6,9,7}
   
    - 5.adým  => {1,2,3,5,6,7,9}
```

Dizimiz ilk indisten baþlayýp tüm elemanlarla ilk indisteki elemanýmýzý karþýlaþtýrýyoruz.Sonrasýnda yer deðiþtirme(swap) iþlemi uygulanýr. Eðer listedeki hiç bir eleman küçük deðilse yer deðiþtirme iþlemi yapýlmaz.

Daha iyi anlamak adýna þu animasyonu izleyebilirsiniz.

[![](http://www.farukgenc.com/Sorting-Animation/Selection-Sort-Animation.gif)](http://www.farukgenc.com/Sorting-Animation/Selection-Sort-Animation.gif)