package HW5_170419029;

public class Test
{
    public static void main(String[] args)
    {
        Hash hash = new Hash();

        hash.ekle(textToKey("Deneme"),1111,"Deneme");
        print(hash.bul(textToKey("Deneme"),"Deneme"));
        hash.sil(textToKey("Deneme"),1111,"Deneme");
        print(hash.bul(textToKey("Deneme"),"Deneme"));

        hash.ekle(textToKey("Muhammed"),170419029, "Muhammed");     //Anahtar M
        hash.ekle(textToKey("Yusuf"),123456789,"Yusuf");
        hash.ekle(textToKey("Macit"),0,"Macit");                    //Anahtar Muhammed ile aynı.
                                                                                 // Bu çakışmayı kontrol etmemiz gerektiği için 2 boyutlu dizi kullandım,
        print(hash.bul(textToKey("Muhammed"),"Muhammed"));
        print(hash.bul(textToKey("Macit"),"Macit"));

        hash.ekle(textToKey("Deneme2"),2222,"Deneme2");             //Test için rehber
        hash.ekle(textToKey("Deneme3"),3333,"Deneme3");
        hash.ekle(textToKey("Deneme4"),4444,"Deneme4");
        hash.ekle(textToKey("Deneme5"),5555,"Deneme5");
        hash.ekle(textToKey("Deneme6"),6666,"Deneme6");
        hash.ekle(textToKey("Deneme7"),7777,"Deneme7");
        hash.ekle(textToKey("Deneme8"),8888,"Deneme8");

        System.out.println("/Deneme Rehberi/ ");
        print(hash.bul(textToKey("Deneme2"),"Deneme2"));                //Test Rehberini bastirma
        print(hash.bul(textToKey("Deneme3"),"Deneme3"));
        print(hash.bul(textToKey("Deneme4"),"Deneme4"));
        print(hash.bul(textToKey("Deneme5"),"Deneme5"));
        print(hash.bul(textToKey("Deneme6"),"Deneme6"));
        print(hash.bul(textToKey("Deneme7"),"Deneme7"));
        print(hash.bul(textToKey("Deneme8"),"Deneme8"));

        hash.sil(textToKey("Deneme2"),2222,"Deneme2");
        hash.sil(textToKey("Deneme4"),2222,"Deneme4");  //Hatalı telefon numarası olduğundan işlem yapılmayacak
        hash.sil(textToKey("Deneme6"),6666,"Deneme6");

        System.out.println("Silme işlemi Testi");
        print(hash.bul(textToKey("Deneme2"),"Deneme2"));
        print(hash.bul(textToKey("Deneme4"),"Deneme4"));
        print(hash.bul(textToKey("Deneme6"),"Deneme6"));


    }

    public static int textToKey(String str)
    {
        return (int) str.charAt(0);
    }


    public static void print(HashDugum hd)
    {
        if (hd.telNo==-1 && hd.anahtar ==-1)
        {
            System.out.println("Boyle bir kayit yok !");
        }
        else
            System. out.println("Ad: "+ hd.ad+" TelNo: "+hd.telNo);
    }
}
