public class Ders
{
    private String dersAdi;
    private int dersKodu;
    private int somestrNo;
    private boolean visibility;

    public String getDersAdi() {
        return dersAdi;
    }

    public void setDersAdi(String dersAdi) {
        this.dersAdi = dersAdi;
    }

    public int getDersKodu() {
        return dersKodu;
    }

    public void setDersKodu(int dersKodu) {
        this.dersKodu = dersKodu;
    }

    public int getSomestrNo() {
        return somestrNo;
    }

    public void setSomestrNo(int somestrNo) {
        this.somestrNo = somestrNo;
    }
    public boolean getVisibility() {
        return visibility;
    }

    public void setVisibility(boolean visibilty) {
        this.visibility = visibilty;
    }

    public Ders(String dersAdi, int dersKodu)
    {
        this.dersAdi=dersAdi;
        this.dersKodu=dersKodu;
        this.somestrNo=dersKodu/1000;
        this.visibility=true;
    }
}
