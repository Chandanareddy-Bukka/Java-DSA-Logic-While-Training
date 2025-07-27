class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data = data;
        this.next = null;
    }
}


class Traversal{
    ListNode head;
    void traversal(){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    void insert_at_begin(int data){
        ListNode newnode = new ListNode(data);
        if(head==null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    void insert_at_end(int data){
        ListNode newnode = new ListNode(data);
         if(head==null){
            head = newnode;
            return;
        }
        ListNode temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newnode;

    }

    void insert_at_pos(int data){
        ListNode newnode = new ListNode(data);
        ListNode temp = head;
        int cur_pos=1;
        int position = 3;
        if(position<1){
            System.out.println("Invalid posiiton");
            return;
        }
        if(position == 1){
            newnode.next = head;
            head = newnode;
            return;
        }
        while(temp!=null && cur_pos<position-1){
            temp = temp.next;
            cur_pos++;
        }
        
        if(temp==null){
            System.out.println("position out of range");
            return;
        }
        newnode.next = temp.next;
        temp.next = newnode;

    }

    void del_at_beg(int data){
        if(head==null){
            System.out.println("linked list is empty");
            return;
        }
        head = head.next;
    }

    void del_at_end(int data){
        ListNode temp = head,prev = null;
        if(head==null){
            System.out.println("linked list is empty");
            return;
        }
        if(head.next==null){
            head = null;
            temp = null;
            return;
        }
        while(temp.next!=null){
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        temp=null;
    }

    void del_at_pos(int data,int pos){
        if(pos<0 || head==null){
            System.out.println("linked list is empty");
            return;
        }
        if(pos==1){
            head = head.next;
            return;
        }
        ListNode temp = head,prev = null;
        int cur_pos = 1;
        while(temp!=null &&  cur_pos<pos){
            prev = temp;
            temp = temp.next;
            cur_pos++;
        }
        if(temp==null){
            System.out.println("out of range");
            return;
        }
        prev.next = temp.next;
        return;
    }

}


public class LinkedImplementation {
    public static void main(String[] args){
        Traversal t = new Traversal();
        t.insert_at_begin(525);
        t.insert_at_begin(585);
        t.insert_at_begin(222);
        t.insert_at_end(111);
        t.insert_at_end(112);
        t.insert_at_end(113);
        t.insert_at_pos(100);
        t.del_at_beg(222);
        t.del_at_end(113);
        t.del_at_pos(111,4);
        t.traversal();
    }
    
}
