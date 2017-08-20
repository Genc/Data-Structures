package ınsertionsort;

public class InsertionSort {

    void insertionSort(int[] dizi) {
        int i, j, temp;

        for (i = 1; i < dizi.length; i++) {
            temp = dizi[i];
            j = i - 1;
            //doğru yer bulunucaya kadar elemanlar sağa bir kaydırılıyor
            while (j >= 0 && dizi[j] > temp) {
                dizi[j + 1] = dizi[j];
                j--;
            }
            // doğru yere de işlenen eleman koyuluyor.
            dizi[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        InsertionSort a = new InsertionSort();
        int dizi[] = {2, 3, 1, 6, 4, 22, 3, -3, 5, -3123, 22};
        a.insertionSort(dizi);
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");

        }
    }

}
