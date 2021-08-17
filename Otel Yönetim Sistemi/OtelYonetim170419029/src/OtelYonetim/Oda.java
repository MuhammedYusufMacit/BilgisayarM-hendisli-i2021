package OtelYonetim;

public class Oda
{
    private int odaNo;
    private String misafir;

    public String getMisafir() {
        return this.misafir;
    }

    public void setMisafir(String misafir) {
        this.misafir = misafir;
    }

    Oda(int odaNo)
    {
        this.odaNo=odaNo;
        this.misafir="0";
    }

    public int getOdaNo() {
        return odaNo;
    }

    public void setOdaNo(int odaNo) {
        this.odaNo = odaNo;
    }


}
