package HW6S2;

import java.util.Random;
import java.util.Scanner;

public class Test
{
    //Dizileri tanımlayalım.

    //Siralama algoritmalarini tanimlayalim.
    static QuickSort quickSort = new QuickSort();
    static MergeSort mergeSort = new MergeSort();
    static HeapSort heapSort = new HeapSort();
    static BubbleSort bubbleSort = new BubbleSort();
    static InsertionSort insertionSort = new InsertionSort();
    static SelectionSort selectionSort = new SelectionSort();
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args)
    {

        //Not: Algoritma 20 tane dizi için geçen süreyi hesaplar bu sayıyı 20'ye bölersek
        //ortalama süreyi buluruz.

        //QuickSort
        System.out.print("(QuickSort) 10k elemanli dizi icin gecen sure: ");
        Sirala(10000,"QuickSort");
        System.out.print("(QuickSort) 40k elemanli dizi icin gecen sure: ");
        Sirala(40000,"QuickSort");
        System.out.print("(QuickSort) 100k elemanli dizi icin gecen sure: ");
        Sirala(100000,"QuickSort");
        System.out.print("(QuickSort) 150k elemanli dizi icin gecen sure: ");
        Sirala(150000,"QuickSort");
        System.out.print("(QuickSort) 180k elemanli dizi icin gecen sure: ");
        Sirala(180000,"QuickSort");

        //MergeSort
        System.out.print("(MergeSort) 10k elemanli dizi icin gecen sure: ");
        Sirala(10000,"MergeSort");
        System.out.print("(MergeSort) 40k elemanli dizi icin gecen sure: ");
        Sirala(40000,"MergeSort");
        System.out.print("(MergeSort) 100k elemanli dizi icin gecen sure: ");
        Sirala(100000,"MergeSort");
        System.out.print("(MergeSort) 150k elemanli dizi icin gecen sure: ");
        Sirala(150000,"MergeSort");
        System.out.print("(MergeSort) 180k elemanli dizi icin gecen sure: ");
        Sirala(180000,"MergeSort");

        //HeapSort
        System.out.print("(HeapSort) 10k elemanli dizi icin gecen sure: ");
        Sirala(10000,"HeapSort");
        System.out.print("(HeapSort) 40k elemanli dizi icin gecen sure: ");
        Sirala(40000,"HeapSort");
        System.out.print("(HeapSort) 100k elemanli dizi icin gecen sure: ");
        Sirala(100000,"HeapSort");
        System.out.print("(HeapSort) 150k elemanli dizi icin gecen sure: ");
        Sirala(150000,"HeapSort");
        System.out.print("(HeapSort) 180k elemanli dizi icin gecen sure: ");
        Sirala(180000,"HeapSort");

        //BubbleSort
        System.out.print("(BubbleSort) 10k elemanli dizi icin gecen sure: ");
        Sirala(10000,"BubbleSort");
        System.out.print("(BubbleSort) 40k elemanli dizi icin gecen sure: ");
        Sirala(40000,"BubbleSort");
        System.out.print("(BubbleSort) 100k elemanli dizi icin gecen sure: ");
        Sirala(100000,"BubbleSort");
        System.out.print("(BubbleSort) 150k elemanli dizi icin gecen sure: ");
        Sirala(150000,"BubbleSort");
        System.out.print("(BubbleSort) 180k elemanli dizi icin gecen sure: ");
        Sirala(180000,"BubbleSort");

        //InsertionSort
        System.out.print("(InsertionSort) 10k elemanli dizi icin gecen sure: ");
        Sirala(10000,"InsertionSort");
        System.out.print("(InsertionSort) 40k elemanli dizi icin gecen sure: ");
        Sirala(40000,"InsertionSort");
        System.out.print("(InsertionSort) 100k elemanli dizi icin gecen sure: ");
        Sirala(100000,"InsertionSort");
        System.out.print("(InsertionSort) 150k elemanli dizi icin gecen sure: ");
        Sirala(150000,"InsertionSort");
        System.out.print("(InsertionSort) 180k elemanli dizi icin gecen sure: ");
        Sirala(180000,"InsertionSort");

        //SelectionSort
        System.out.print("(SelectionSort) 10k elemanli dizi icin gecen sure: ");
        Sirala(10000,"SelectionSort");
        System.out.print("(SelectionSort) 40k elemanli dizi icin gecen sure: ");
        Sirala(40000,"SelectionSort");
        System.out.print("(SelectionSort) 100k elemanli dizi icin gecen sure: ");
        Sirala(100000,"SelectionSort");
        System.out.print("(SelectionSort) 150k elemanli dizi icin gecen sure: ");
        Sirala(150000,"SelectionSort");
        System.out.print("(SelectionSort) 180k elemanli dizi icin gecen sure: ");
        Sirala(180000,"SelectionSort");


        //printArray(siralidizi[5]);




    }
    public static int[][] Sirala(int elemanSayisi,String algoritma)
    {
        int[][] dizi = new int[20][elemanSayisi];
        dizidoldur(dizi);

        long startTime = System.currentTimeMillis();
        for (int i=0;i<20;i++) {

            switch (algoritma)
            {
                case "QuickSort":
                    quickSort.quickSort(dizi[i],0,dizi[i].length-1);
                    break;
                case "MergeSort":
                    mergeSort.sort(dizi[i],0,dizi[i].length-1);
                    break;
                case "HeapSort":
                    heapSort.sort(dizi[i]);
                    break;
                case "BubbleSort":
                    bubbleSort.bubbleSort(dizi[i]);
                    break;
                case "InsertionSort":
                    insertionSort.sort(dizi[i]);
                    break;
                case "SelectionSort":
                    selectionSort.sort(dizi[i]);
                    break;
                default:
                    System.out.println("Hatali secim yaptiniz...");
                    break;
            }
        }
        long endTime = System.currentTimeMillis();
        long estimatedTime = endTime - startTime;
        double seconds = (double)estimatedTime/1000;
        System.out.println("Aradan gecen sure"+seconds+" saniye");
        return dizi;
    }

    //dizidoldur fonksiyonu dizideki elemanlara rastgele eleman atar.
    public static void dizidoldur(int[][] dizi)
    {
        Random random = new Random();
        for (int i=0;i<20;i++)
        {
            for (int j=0;j<dizi[i].length;j++)
            {
                dizi[i][j]= random.nextInt(500000);
            }
        }
    }
    static void printArray(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
    static int diziSecme()
    {
        System.out.println("Bir dizi seciniz: ");
        System.out.println("dizi10k");
        System.out.println("dizi40k");
        System.out.println("dizi100k");
        System.out.println("dizi150k");
        System.out.println("dizi180k");
        String dizikodu = scn.next();

        int elemanSayisi=0;
        switch (dizikodu)
        {
            case "dizi10k":
                elemanSayisi = 10000;
                break;

            case "dizi40k":
                elemanSayisi = 40000;
                break;

            case "dizi100k":
                elemanSayisi = 100000;;
                break;

            case "dizi150k":
                elemanSayisi = 150000;
                break;

            case "dizi180k":
                elemanSayisi = 180000;
                break;
            default:
        }
        return elemanSayisi;
    }
    static String algoritmaSecme()
    {
        System.out.println("Arama algoritmasini seciniz: ");
        System.out.println("QuickSort");
        System.out.println("MergeSort");
        System.out.println("HeapSort");
        System.out.println("BubbleSort");
        System.out.println("InsertionSort");
        System.out.println("SelectionSort");


        String algoritma = scn.next();
        return algoritma;
    }
}
