package HW6S1;

public class Main
{
    public static void main(String[] args)
    {
        int[] A = new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int[] B = new int[]{20,18,16,14,12,10,8,6,4,2};
        int[] C = new int[]{5, 2, 13, 9, 1, 7, 6, 8, 1, 15, 4, 11};
        String[] D = new String[]{"S", "B", "I", "M", "H", "Q", "C", "L", "R", "E", "P", "K"};
        int[] H = HarftenSayiya(D);

        QuickSort quickSort = new QuickSort();
        MergeSort mergeSort = new MergeSort();
        HeapSort heapSort = new HeapSort();

        /*
        //QUICKSORT
        System.out.println("QuickSort: A");
        quickSort.quickSort(A,0,9);
        System.out.println("QuickSort: B");
        quickSort.quickSort(B,0,9);
        System.out.println("QuickSort: C");
        quickSort.quickSort(C,0,11);
        System.out.println("QuickSort: D");
        quickSort.quickSort(H,0,11);
         */


        //MERGESORT
        System.out.println("MergeSort: A");
        mergeSort.sort(A,0,9);
        System.out.println("MergeSort: B");
        mergeSort.sort(B,0,9);
        System.out.println("MergeSort: C");
        mergeSort.sort(C,0,11);
        System.out.println("MergeSort: D");
        mergeSort.sort(H,0,11);



        /*
        //HEAPSORT
        System.out.println("HeapSort: A");
        heapSort.sort(A);
        System.out.println("HeapSort: B");
        heapSort.sort(B);
        System.out.println("HeapSort: C");
        heapSort.sort(C);
        System.out.println("HeapSort: D");
        heapSort.sort(H);
         */




        D=SayidanHarfe(H);

        //KONTROL
        int i=0;
        while (i<10)
        {
            //System.out.print(A[i]);
            //System.out.print(B[i]);
            //System.out.print(C[i]);
            //System.out.print(D[i]);
            i++;
        }


    }
    public static int[] HarftenSayiya(String[] str)
    {
        int[] temp=new int[12];
        for (int i=0;i<12;i++)
        {
            temp[i] = (int) str[i].charAt(0);
        }
        return temp;
    }

    public static String[] SayidanHarfe(int[] ints)
    {
        String[] temp=new String[12];
        for (int i=0;i<12;i++)
        {
            temp[i] = String.valueOf((char) ints[i]);
        }
        return temp;
    }

}
