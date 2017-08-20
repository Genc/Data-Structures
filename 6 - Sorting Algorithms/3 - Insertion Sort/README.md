# Insertion Sort / Eklemeli Sýralama

Dizimizin 2.elamýndan baþlayarak bir önceki elemanlarla karþýlaþtýrma yapýlarak ilerler. Eðer karþýlaþtýrma yaptýðý eleman daha büyükse **saða** doðru kaydýrýlýr. Kendinide bir nevi araya eklemiþ olur.

```
Dizimiz => {33,44,21,45,25,14}

- 1.adým  => {33 | 44 - 21 - 45 - 25 - 14}

 - 2.adým  => {33 - 44 | - 21 - 45 - 25 - 14}
 
  - 3.adým  => {21 - 33 - 44 | 45 - 25 - 14}
  
   - 4.adým  => {21 - 33 - 44 - 45 | 25 - 14}
   
    - 5.adým  => {21 - 25 - 33 - 44 - 45 | 14}
    
     - 6.adým  => {14 - 21 - 25 - 33 - 44 - 45 |}
```

-> Bu algoritmada ***5.adýmdan -> 6.adýma*** geçilen kýsýma dikkatle göz atýlýrsa en sondaki eleman diðer verilerden küçük olduðu için en baþa getirelecek. Bu da tüm dizinin 1 birim saða kaydýrmamýza sebeb verecek. Insertion Sort'un olumsuz durumlarýndan birisi.

Daha iyi anlamak adýna þu animasyonu izleyebilirsiniz.

[![](http://www.farukgenc.com/Sorting-Animation/Insertion-Sort-Animation.gif)](http://www.farukgenc.com/Sorting-Animation/Insertion-Sort-Animation.gif)