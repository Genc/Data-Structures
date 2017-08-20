package quicksort;

import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] dizi) {
        recursiveQuickSort(dizi, 0, dizi.length - 1);
    }

    // bas = dizinin ilk indisi 
    // son = dizinin son indisi
    public static void recursiveQuickSort(int[] dizi, int bas, int son) {
        int idx = partition(dizi, bas, son);
        // Parçalara ayrılmış dizinin sol kısmı ile hızlıca arama
        if (bas < idx - 1) {
            recursiveQuickSort(dizi, bas, idx - 1);
        }
        // Parçalara ayrılmış dizinin sağ kısmı ile hızlıca arama
        if (son > idx) {
            recursiveQuickSort(dizi, idx, son);
        }
    }

    public static int partition(int[] dizi, int left, int right) {
        int pivot = dizi[left]; // ilk eleman pivot olarak atanıyor.
        while (left <= right) {
            // pivottan büyük bir sayı aranıyor, aşağıdan yukarıya
            while (dizi[left] < pivot) {
                left++;
            }
            // pivottan küçük bir sayı aranıyor, yukarıdan aşağıya
            while (dizi[right] > pivot) {
                right--;
            }
            // yer değiştirme işlemi uygulanıyor.(swap)
            if (left <= right) {
                int tmp = dizi[left];
                dizi[left] = dizi[right];
                dizi[right] = tmp;
                // sol indexi bir adım sağa , sağ indexi bir adım sola getiriyoruz yani 
                // solu arttırıp sağı azaltıyoruz.
                left++;
                right--;
            }
        }
        return left;
    }

    public static void main(String args[]) {
        int[] dizi = {23, 31, 1, 21, 36, 72};
        System.out.println("Sıralanmamış dizi : " + Arrays.toString(dizi));
        quickSort(dizi); // sort the integer array using quick sort algorithm
        System.out.println("Sıralanmış dizi : " + Arrays.toString(dizi));
    }
}
