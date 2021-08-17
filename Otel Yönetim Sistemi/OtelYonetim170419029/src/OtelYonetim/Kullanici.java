package OtelYonetim;

public class Kullanici
{
    private String ad;


    private boolean receptionistOrGuest=false;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public boolean isReceptionistOrGuest() {
        return receptionistOrGuest;
    }

    public void setReceptionistOrGuest(boolean receptionistOrGuest) {
        this.receptionistOrGuest = receptionistOrGuest;
    }

}
