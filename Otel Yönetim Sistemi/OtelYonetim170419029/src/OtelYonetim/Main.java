package OtelYonetim;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Muhammed Yusuf Macit 170419029
 *
 */

public class Main
{
    public static void main(String[] args)
    {
        //ODALARI OLUSTURMA
        ArrayList<Oda> odalar = new ArrayList<>();
        int i;
        for (i=101;i<500;i++)
        {
            odalar.add(new Oda(i));
            //System.out.println(i);
            if(i%5==0) i=i+95;
        }

        Kullanici kullanici=Giris();
        Islem(odalar,kullanici);

        System.out.print("Programdan Cikiliyor...");
        dosyaYazici(kullanici.getAd()+" programdan cikti.");
    }



    //FONKSIYONLAR

    /**
     * Programa giris yapan kisinin verilerini alir.
     * @return Resepsiyonist veya misafir olmak uzere iki ayrı nesne sinifindan hangisi secilirse ona gore Kullanici nesnesi dondurur.
     */
    private static Kullanici Giris()
    {
        while (true)
        {
            System.out.print("OTEL YONETIM SISTEMINE HOSGELDINIZ.\nMisafir Girisi İcin 1;\nResepsiyonist Girisi İcin 2:");
            Scanner scn = new Scanner(System.in);
            int i=scn.nextInt();
            //System.out.print(i);
            if(i==1)
            {
                Misafir misafir=new Misafir();
                System.out.print("MISAFIR");
                System.out.print("\nMisafir Adi: ");
                misafir.setAd(scn.next());
                dosyaYazici(misafir.getAd()+" sisteme giris yapti.");
                return misafir;
            }
            else if(i==2)
            {
                Resepsiyonist resepsiyonist = new Resepsiyonist();
                System.out.print("RESEPSIYONIST");
                System.out.print("\nResepsionist Adi: ");
                resepsiyonist.setAd(scn.next());
                System.out.print("\nResepsiyonist Sifresi: ");
                resepsiyonist.setSifre(scn.next());
                dosyaYazici(resepsiyonist.getAd()+" sisteme giris yapti.");
                return resepsiyonist;
            }
        }
    }

    /**
     * Islem listesinden islem sectirir. Secilen isleme uygun alt fonksiyonu cagirir.
     * @param odalar
     * @param kullanici
     */
    private static void Islem(ArrayList<Oda> odalar,Kullanici kullanici)
    {
        System.out.println("Yapmak istediginiz islemi Seciniz:\nRezerve=1;\nIptal=2;\nCheckIn=3;\nCheckOut=4;\nCikis=5:");
        Scanner scn = new Scanner(System.in);
        int i=scn.nextInt();
        System.out.print("Sectiginiz islem: ");
        if(i==1)
        {
            System.out.println("Rezerve");
            Rezerve(odalar,kullanici);
            Islem(odalar,kullanici);
        }
        else if(i==2)
        {
            System.out.println("Iptal");
            Iptal( odalar,kullanici);
            Islem(odalar,kullanici);
        }
        else if(i==3)
        {
            if(kullanici.isReceptionistOrGuest())
            {
                System.out.println("CheckIn");
                CheckIn(odalar,kullanici);
            }
            else System.out.print("Bu islemi yapmaya yetkiniz yok");
            Islem(odalar, kullanici);
        }
        else if(i==4)
        {
            if(kullanici.isReceptionistOrGuest())
            {
                System.out.println("CheckOut");
                CheckOut(odalar,kullanici);
            }
            else System.out.print("Bu islemi yapmaya yetkiniz yok");
            Islem(odalar, kullanici);
        }
        else if(i==5)
        {
            System.out.println("Cikis");
        }
        else
        {
            System.out.println("Hatali secim yaptiniz...");
            Islem(odalar,kullanici);
        }

    }

    /**
     * Oda rezerve eden fonksiyon.
     * @param odalar
     * @param kullanici
     */
    private static void Rezerve(ArrayList<Oda> odalar, Kullanici kullanici)
    {
        Oda oda=odaSec(odalar);
        if(oda.getMisafir().equals("0"))
        {
            System.out.print("Ad soyad giriniz: ");
            Scanner scn = new Scanner(System.in);
            String ad=scn.next();
            oda.setMisafir(ad);
            dosyaYazici(kullanici.getAd()+", "+oda.getMisafir()+" adina "+oda.getOdaNo()+" numarali odayi rezerve etti.");
        }
        else System.out.print("Sectiginiz oda rezerve icin musait degil.");
    }

    /**
     * Oda rezervesini iptal eden fonksiyon. Dogrulama icin odadaki misafir adi ile esleme yapar.
     * @param odalar
     * @param kullanici
     */
    private static void Iptal(ArrayList<Oda> odalar,Kullanici kullanici)
    {
        Oda oda=odaSec(odalar);
        if(oda.getMisafir().equals("0"))
        {
            System.out.print("Sectiginiz oda rezerve iptali icin musait degil.");
        }
        else
        {
            System.out.print(oda.getOdaNo()+" numarali odanin rezerve islemi iptal edilecek.");
            oda.setMisafir("0");
            dosyaYazici(kullanici.getAd()+", "+oda.getMisafir()+" adina "+oda.getOdaNo()+" numarali odayi rezerve islemini iptal etti.");
        }
    }

    /**
     * CheckIn islemi yapar.
     * @param odalar
     * @param kullanici
     */
    private static void CheckIn(ArrayList<Oda> odalar, Kullanici kullanici)
    {
            Oda oda=odaSec(odalar);
            System.out.print("Ad soyad giriniz: ");
            Scanner scn = new Scanner(System.in);
            String ad = scn.next();
            System.out.print(oda.getMisafir().equals(ad));

            if (oda.getMisafir().equals(ad))
            {
                System.out.print(oda.getOdaNo() + " nolu odaniza gecebilirsiniz.");
            }
            else System.out.print("Rezerve edilmis oda sahibi ile sectiginiz oda sahibinin adlari uyusmuyor.");
            dosyaYazici(kullanici.getAd()+", "+oda.getMisafir()+" adina "+oda.getOdaNo()+" numarali odanin CheckIn islemini yapti. ");
    }

    /**
     * CheckOut islemi yapar.
     * @param odalar
     * @param kullanici
     */
    private static void CheckOut(ArrayList<Oda> odalar, Kullanici kullanici)
    {
            Oda oda=odaSec(odalar);
            System.out.print("Ad soyad giriniz: ");
            Scanner scn = new Scanner(System.in);
            String ad=scn.next();

            if (oda.getMisafir().equals(ad))
            {
                System.out.print(oda.getOdaNo() + " nolu oda bosaltismistir.");
                oda.setMisafir("0");
            }
            else System.out.print("Bosaltilacak oda ile sectiginiz oda sahibinin adlari uyusmuyor.");
            dosyaYazici(kullanici.getAd()+", "+oda.getMisafir()+" adina "+oda.getOdaNo()+" numarali odanin CheckOut islemini yapti. ");
    }

    /**
     * Oda secme islemini yapar. Kod tekrari olmamasi icin yazilmistir.
     * @param odalar
     * @return Secilen odayi dondurur
     */
    private static Oda odaSec(ArrayList<Oda> odalar)
    {
        for (int i=0;i<odalar.size();i++)
        {
            System.out.print(odalar.get(i).getOdaNo() + "\t");
        }
        System.out.print("\nHangi numarali odayi secmek istiyorsunuz: ");
        Scanner scn = new Scanner(System.in);
        return odalar.get(NoToId(scn.nextInt(),odalar));
    }

    /**
     * @param no
     * @param odalar
     * @return Oda numarasini, oda id'sine donusturup cikti verir.
     */
    private static int NoToId(int no, ArrayList<Oda> odalar)
    {
        for (int i=0;i<odalar.size();i++)
        {
            if (odalar.get(i).getOdaNo()==no) return i;
        }
        System.out.print("\nOda numarasina ait oda bulunamadi.");
        return 0;
    }

    /**
     * Dosyaya LOG yazma islemi yapar.
     * @param text
     */
    private static void dosyaYazici(String text)
    {
        File log = new File("log.txt");
        try
        {
            if (!log.exists())
            {
                log.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(log,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.append(text+"\n");
            bufferedWriter.close();
            //System.out.print("TEST");
        }
        catch (IOException e)
        {
            System.out.print("DOSYA HATASI!");
            e.printStackTrace();
        }

    }

}
