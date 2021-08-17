public class Test
{
    public static void main(String[] args)
    {
        LinkedList bl = new LinkedList();

        Ders ders0= new Ders("Bilg. Muh. Giris",1001);
        Ders ders1= new Ders("Alg. ve Prog. Giris",1003);
        Ders ders2= new Ders("Fizik",1071);
        Ders ders3= new Ders("Kimya",1020);
        Ders ders4= new Ders("Matematik",1085);
        Ders ders5= new Ders("Bilg. Programlama",2002);
        Ders ders6= new Ders("Bilg. Donanımı",2004);
        Ders ders7= new Ders("Is Sagligi ve Guvenligi",2081);
        Ders ders8= new Ders("Matematik II",2086);
        Ders ders9= new Ders("Bilg. Programlama II",3001);
        Ders ders10= new Ders("Nesne Yon. Prog.",3005);
        Ders ders11= new Ders("Diferansiyel Denklemler",3085);
        Ders ders12= new Ders("Lineer Cebir",1087);
        Ders ders13= new Ders("Türk Dili I",1121);
        Ders ders14= new Ders("Yabancı Dil I",1234);
        Ders ders15= new Ders("Fizik II",2072);
        Ders ders16= new Ders("Bilimsel Arastirma",2010);
        Ders ders17= new Ders("Türk Dili II",2122);
        Ders ders18= new Ders("Yabanci Dil II",2234);
        Ders ders19= new Ders("Insan Bilg. Etkilesimi",3003);
        Ders ders20= new Ders("Mantik Devreler",3007);
        Ders ders21= new Ders("Ayrik Matematik",3019);
        Ders ders22= new Ders("Veri Yapilari ve Algoritmalar",4002);
        Ders ders23= new Ders("Bilgisayar Aglarina Giris",4006);
        Ders ders24= new Ders("Mikroislemciler",4008);
        Ders ders25= new Ders("Elektronik Devrelere Giris",4010);
        Ders ders26= new Ders("Mühendisler icin Istatistik",4045);
        Ders ders27= new Ders("Sayisal Analiz",4086);
        Ders ders28= new Ders("Staj I",5000);
        Ders ders29= new Ders("Veritabanı Yönetim Sistemleri",5001);
        Ders ders30= new Ders("İsletim Sistemleri",5003);
        Ders ders31= new Ders("Sinyaller ve Sistemlere Giris",5005);
        Ders ders32= new Ders("Mikrodenetleyiciler",5007);
        Ders ders33= new Ders("Secmeli Ders I",5100);
        Ders ders34= new Ders("Secmeli Ders II",5101);
        Ders ders35= new Ders("Secmeli Ders III",5102);
        Ders ders36= new Ders("Bilgisayar Org. ve Mimarisi",6004);
        Ders ders37= new Ders("Web Programlama",6006);
        Ders ders38= new Ders("Yazilim Muhendisligi",6008);
        Ders ders39= new Ders("Sistem Programlama",6010);
        Ders ders40= new Ders("Secmeli Ders IV",6100);
        Ders ders41= new Ders("Secmeli Ders V",6101);
        Ders ders42= new Ders("Secmeli Ders VI",6102);

        bl.initialize(ders0);
        bl.Add(ders1);
        bl.Add(ders2);
        bl.Add(ders3);
        bl.Add(ders4);
        bl.Add(ders5);
        bl.Add(ders6);
        bl.Add(ders7);
        bl.Add(ders8);
        bl.printLinkedList();

        bl.Disable(ders3);
        bl.Disable(ders5);
        bl.showDisabled();

        bl.Disable(ders4);
        bl.Disable(ders7);
        bl.Enable(ders3);
        bl.showDisabled();
        bl.printLinkedList();

        bl.Remove(ders2);
        bl.Remove(ders0);
        bl.Remove(ders8);
        System.out.println("Listedeki eleman sayısı..."+bl.Size());

        bl.Add(ders11);
        bl.Add(ders12);
        bl.Add(ders13);
        bl.Add(ders14);
        bl.Add(ders15);
        bl.Add(ders16);
        bl.Add(ders17);
        bl.Add(ders18);
        bl.Add(ders19);
        bl.Add(ders20);
        bl.Add(ders21);
        bl.Add(ders22);
        bl.Add(ders23);
        bl.Add(ders24);
        bl.Add(ders25);
        bl.Add(ders26);
        bl.Add(ders27);
        bl.Add(ders28);
        bl.Add(ders29);
        bl.Add(ders30);
        System.out.println("Listedeki eleman sayısı..."+bl.Size());
        bl.printLinkedList();

        System.out.println(bl.getByCode(10));
        System.out.println(bl.getByCode(6));
        bl.listSemesterCourses(1);
        bl.listSemesterCourses(2);
        bl.getByRange(1,3);
        bl.getByRange(5,9);

        bl.Add(new Ders("Test",1));
        bl.Next(3);
        bl.NextInSemester(3);
        System.out.println("Listenin boyutu: "+bl.Size());

    }

}
