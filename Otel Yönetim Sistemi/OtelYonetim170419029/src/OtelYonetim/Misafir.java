package OtelYonetim;

public class Misafir extends Kullanici
{
    @Override
    public String getAd()
    {
        return super.getAd()+"(Misafir)";
    }

}
