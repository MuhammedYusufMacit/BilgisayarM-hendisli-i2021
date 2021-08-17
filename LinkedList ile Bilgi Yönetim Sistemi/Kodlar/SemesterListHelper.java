public class SemesterListHelper
{
    SLinkedList semester1 = new SLinkedList();
    SLinkedList semester2 = new SLinkedList();
    SLinkedList semester3 = new SLinkedList();
    SLinkedList semester4 = new SLinkedList();
    SLinkedList semester5 = new SLinkedList();
    SLinkedList semester6 = new SLinkedList();
    SLinkedList semester7 = new SLinkedList();
    SLinkedList semester8 = new SLinkedList();

    public SemesterListHelper(LinkedList bl)
    {
        Node head = null;
        Node temp = head;
        while (temp != null)
        {
            if (temp.data.getSomestrNo()==1)
            {
                this.semester1.add(temp.data);
            }
            if (temp.data.getSomestrNo()==2)
            {
                this.semester2.add(temp.data);
            }
            if (temp.data.getSomestrNo()==3)
            {
                this.semester3.add(temp.data);
            }
            if (temp.data.getSomestrNo()==4)
            {
                this.semester4.add(temp.data);
            }
            if (temp.data.getSomestrNo()==5)
            {
                this.semester5.add(temp.data);
            }
            if (temp.data.getSomestrNo()==6)
            {
                this.semester6.add(temp.data);
            }
            if (temp.data.getSomestrNo()==7)
            {
                this.semester7.add(temp.data);
            }
            if (temp.data.getSomestrNo()==8)
            {
                this.semester8.add(temp.data);
            }

            temp = temp.next;
        }
    }

}
