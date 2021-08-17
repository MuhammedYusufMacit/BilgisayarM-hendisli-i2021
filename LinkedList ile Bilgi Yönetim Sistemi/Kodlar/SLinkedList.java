public class SLinkedList
{
    SNode head = null;

    public void initialize(Ders data) {
        head = new SNode();
        head.prev = null;
        head.data = data;
        head.next = null;
    }

    public void add(Ders data)
    {
        SNode temp = new SNode();
        temp.prev = null;
        temp.data = data;
        temp.next = head;
        head.prev = temp;
        head = temp;
    }

    public void printList()
    {
        if (head == null)
        {
            System.out.println("Listede eleman bulunmaktadır....");
            return;
        }
        SNode temp = new SNode();
        temp = head;
        while(temp !=null)
        {
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }




}

