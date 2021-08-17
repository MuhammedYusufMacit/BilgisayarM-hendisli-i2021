package OtelYonetim;

public class Resepsiyonist extends Kullanici
{
    @Override
    public String getAd()
    {
        return super.getAd()+"(Resepsiyonist)";
    }

    Resepsiyonist()
    {
        this.setReceptionistOrGuest(true);
    }
    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    private String sifre;

}
