public abstract class Fonksiyonlar
{
    public void Disable(Ders ders)
    {
        ders.setVisibility(false);
    }
    public void Enable(Ders ders)
    {
        ders.setVisibility(true);
    }
    public boolean Check(Ders ders){return ders.getVisibility();}

    public abstract void Add(Ders ders);
    public abstract boolean Remove(Ders ders);
    public abstract void Next(int index);
    public abstract void NextInSemester(int index);
    public abstract int Size();
    public abstract String getByCode(int code);
    public abstract void listSemesterCourses(int semester);
    public abstract void getByRange(int start_index, int last_index);

}
