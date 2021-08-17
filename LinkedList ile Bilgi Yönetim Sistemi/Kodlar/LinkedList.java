public class LinkedList extends Fonksiyonlar
{
    Node head = null;

    public void initialize(Ders ders)
    {
        head = new Node();
        head.data = ders;
        head.next = null;
    }

    public void printLinkedList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data.getDersAdi()+temp.data.getDersKodu() + " => ");
            temp = temp.next;
        }
        System.out.println("Liste Sonu.");
    }

    public void showDisabled()
    {
        Node temp = head;
        System.out.println("Devre disi birakilan dersler");
        while (temp != null)
        {
            if (!temp.data.getVisibility())
            {
                System.out.println(" => " + temp.data.getDersAdi());
            }
            temp = temp.next;
        }

    }

    @Override
    public void Add(Ders ders)
    {
        Node newNode = new Node();
        newNode.data = ders;
        newNode.next = null;
        Node temp = head;
        while (temp.next != null)
        {
                temp = temp.next;
        }
        temp.next = newNode;
    }

    @Override
    public boolean Remove(Ders ders)
    {
        boolean durum = false;
        Node current = head;
        Node tmp = null;
        if (current.data == ders) {
            tmp = current.next;
            head = tmp;
        } else {
            while (current.next != null)
            {
                if (current.next.data == ders)
                {
                    tmp = current.next;
                    current.next = tmp.next;
                    durum = true;
                    break;
                }
                current = current.next;
            }
        }
        return durum;
    }

    @Override
    public void Next(int index)
    {
        Node temp = head;
        for (int i=0;i<index;i++)
        {
            temp = temp.next;
        }
        System.out.println("Sonraki ders: "+temp.data.getDersAdi());
    }

    @Override
    public void NextInSemester(int index)
    {
        Node temp = head;
        for (int i=0;i<index;i++)
        {
            temp = temp.next;
        }
        int tempsem = temp.data.getSomestrNo();
        while (temp != null)
        {
            temp = temp.next;
            if (tempsem==temp.data.getSomestrNo())
            {
                System.out.println("Ayni somestrdaki bir sonraki ders: "+temp.data.getDersAdi());
                return;
            }
        }
        System.out.println("Bulunamadi.");
    }

    @Override
    public int Size()
    {
        Node temp = head;
        int count = 0;
        while (temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }

    @Override
    public String getByCode(int code)
    {
        Node temp = head;
        while (temp != null)
        {
            if (temp.data.getDersKodu()==code)
            {
                if (Check(temp.data))
                {
                    return temp.data.getDersAdi();
                }
            }
            temp = temp.next;
        }
        return "Koda ait ders bulunamadi.";
    }

    @Override
    public void listSemesterCourses(int semester)
    {
        Node temp = head;
        while (temp != null)
        {
            if (temp.data.getSomestrNo()==semester)
            {
                if (Check(temp.data))
                {
                    System.out.print(temp.data.getDersAdi() + " => ");
                }
            }
            temp = temp.next;
        }
        System.out.println("Liste Sonu.");
    }

    @Override
    public void getByRange(int start_index, int last_index)
    {
        Node temp = head;
        for (int i=0;i<start_index;i++)
        {
            temp = temp.next;
        }
        for (int i=start_index-1;i<last_index;i++)
        {
            if (Check(temp.data))
            {
                System.out.print(temp.data.getDersAdi()+temp.data.getDersKodu() + " => ");
            }
            temp = temp.next;
        }
        System.out.println("Liste Sonu.");
    }

}

















