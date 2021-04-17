package HW5_170419029;

public class Hash
{
    HashDugum[][] a =new HashDugum[20][20]; //Anahtar değerlerinin çakışmasını önlemek için 2 boyutlu dizi kullandım

    public Hash()
    {
        for (int i=0;i<20;i++)
        {
            for (int j=0;j<20;j++)
            {
                a[i][j] = new HashDugum(-1,-1,"NULL"); //Hashtable'ı önceden oluşturup tüm değerleri işlem kolaylığı için önceden atadım.
            }
        }
    }

    public void ekle(int anahtar, int telNo, String ad)
    {
        for (int k=0;k<20;k++)
        {
            if ( a[anahtar%20][k].anahtar==-1)
            {
                a[anahtar%20][k].anahtar=anahtar;
                a[anahtar%20][k].telNo=telNo;
                a[anahtar%20][k].ad=ad;
                return;
            }

        }

    }

    public HashDugum bul(int anahtar, String ad)     //Arama işleminde çakışan anahtarları kontrol etmek için Ad değişkeni gerekir.
    {
        for (int k=0;k<20;k++)
        {
            if ( a[anahtar%20][k].anahtar==anahtar && a[anahtar%20][k].ad==ad)
            {
                return a[anahtar%20][k];
            }
        }
        return new HashDugum(-1,-1,"NULL");
    }

    public void sil(int anahtar, int telNo, String ad)  //Silme işleminde kontrol için telefon numarası gerekir.
    {
        HashDugum silinecek=bul(anahtar,ad);
        if (silinecek.anahtar==anahtar && silinecek.telNo==telNo)
        {
            silinecek.telNo=-1;
            silinecek.anahtar=-1;
        }
    }
}
