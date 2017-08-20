package mergesort;

public class MergeSort {

    private int[] list;
    // siralancak listeyi alan inşa fonksiyonu

    public MergeSort(int[] listToSort) {
        list = listToSort;
    }
    // listeyi döndüren kapsülleme fonksiyonu 

    public int[] getList() {
        return list;
    }
    // dışarıdan çağırılan sıralama fonksiyonu

    public void sort() {
        list = sort(list);
    }

    // Özyineli olarak çalışan ve her parça için kullanılan sıralama fonksiyonu
    private int[] sort(int[] whole) {
        if (whole.length == 1) {
            return whole;
        } else {
            // diziyi ikiye bölüyoruz ve solu oluşturuyoruz
            int[] left = new int[whole.length / 2];
            System.arraycopy(whole, 0, left, 0, left.length);

            //dizinin sağını oluşturuyoruz ancak tek sayı ihtimali var
            int[] right = new int[whole.length - left.length];
            System.arraycopy(whole, left.length, right, 0, right.length);

            // her iki tarafı ayrı ayrı sıralıyoruz
            left = sort(left);
            right = sort(right);

            // Sıralanmış dizileri birleştiriyoruz
            merge(left, right, whole);

            return whole;
        }
    }

    // birleştirme fonksiyonu
    private void merge(int[] left, int[] right, int[] result) {
        int x = 0;
        int y = 0;
        int k = 0;

        // iki dizide de eleman varken
        while (x < left.length
                && y < right.length) {
            if (left[x] < right[y]) {
                result[k] = left[x];
                x++;
            } else {
                result[k] = right[y];
                y++;
            }
            k++;
        }

        int[] rest;
        int restIndex;
        if (x >= left.length) {

            rest = right;
            restIndex = y;
        } else {

            rest = left;
            restIndex = x;
        }

        for (int i = restIndex; i < rest.length; i++) {
            result[k] = rest[i];
            k++;
        }
    }

    public static void main(String[] args) {

        int[] arrayToSort = {15, 19, 4, 3, 18, 6, 2, 12, 7, 9, 11, 16, 22, 3, -1, -222, 5};

        System.out.println("Unsorted:");
        for (int i = 0; i < arrayToSort.length; i++) {
            System.out.println(arrayToSort[i] + " ");
        }

        MergeSort sortObj = new MergeSort(arrayToSort);
        sortObj.sort();

        System.out.println("Sorted:");
        int[] sirali = sortObj.getList();

        for (int i = 0; i < sirali.length; i++) {
            System.out.println(sirali[i] + " ");
        }

    }
}
