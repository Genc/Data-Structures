# Merge Sort / Birleþtirmeli Sýralama

Parçala ve Fethet(Divide & Conquer) algoritmasýdýr. Sýralanacak olan veriler dizinin ortasýndan itibaren ikiye bölünerek, tek bir eleman kalana kadar ayrýþtýrýlýr.

```
Dizimiz => {38,27,43,3,9,82,10} 

- 1.adým  => {38,27,43,3} - {9,82,10}

 - 2.adým  => {38,27} - {43,3} - {9,82} - {10}
 
  - 3.adým  => {38} - {27} - {43} - {3} - {9} - {82} - {10}
  
   - 4.adým  =>  {27,38} - {3,43} - {9,82} - {10}
   
    - 5.adým  => {3,27,38,43} - {9,10,82}
    
     - 6.adým  => {3,9,10,27,38,43,82}
```

-> Yukarýda verilen örneði þimdi inceleyelim. Ýlk olarak yapýlan þey dizi boyutunu 2'ye bölerek(7/2=3.5 ~= 4) bölünecek yeri buluyoruz.Sonrasýnda ortaya çýkan 2 diziyide tekrar 2 ye bölerek bu örnek için 4 adet dizi oluþmuþ oldu. Bu adýmlar her bir eleman ayrý bir dizi oluþana kadar(bknz:**3.adým**) devam eder.

-> Sonrasýnda ***birleþtirme*** aþamasýna geçilir.4.adýmda görüleceði üzere ilk 2 elemaný karþýlaþtýrýr ve sýralar. Sonrasýnda diðer iki elemaný karþýlaþtýrýr ve kendi içinde sýralar. Bu þekilde sýralayýp parçaladýklarýný tek tek birleþtirecek. Her biri tek elemanken **2.adým** daki halini geri alacak ancak farký __sýralanmýþ__ olmasý olacak. Sonrasýnda **5.adým** 'da ise 1.adýmdaki halini alacak ancak yine farký **sýralanmýþ** olmasý olacak. __6.adým__'da ise tüm listeyi sýralamýþ bir þekilde oluþturmuþ olacak.

**--> Dipnot** : 4.adým'da baþlayan sýralama iþlemlerinde ilk iki dizinin ilk önce ilk elemanlarýna bakýyor sonrasýnda ona göre birleþtirme yapýyor büyüklük küçüklük ile yerleþtirme yapýyoruz bir nevi.


    Yukarýda verilen örneðimizin diyagramýnýda inceleyebilirsiniz

[![](http://www.farukgenc.com/Sorting-Animation/Merge-Sort-Algoritmasi-Diagram.png)](http://www.farukgenc.com/Sorting-Animation/Merge-Sort-Algoritmasi-Diagram.png)

##### Daha iyi anlamak adýna þu animasyonu izleyebilirsiniz.

[![](http://www.farukgenc.com/Sorting-Animation/Merge-Sort-Animasyon.gif)](http://www.farukgenc.com/Sorting-Animation/Merge-Sort-Animasyon.gif)