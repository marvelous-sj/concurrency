package xyz.marsj.test;

/**
 * @author sj
 * @create 2018/10/15
 */
public class reservedBetween {
    public ListNode reservedList(ListNode head,int l,int r){
        ListNode dummyNode =new ListNode(-1);
        dummyNode.next=head;
        ListNode firNode=dummyNode;
        for(int i=1;i<l;i++){
            firNode=firNode.next;
        }
        ListNode preNode=null;
        ListNode curNode=firNode.next;
        ListNode lasNode=curNode;
        for(int i=l;i<=r;i++){
            ListNode nextNode = curNode.next;
            curNode.next=preNode;
            preNode=curNode;
            curNode=nextNode;
        }
        firNode.next=preNode;
        lasNode.next=curNode;

        return dummyNode.next;
    }
    public static void main(String[] args) {
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);
        ListNode node5=new ListNode(5);
        ListNode node6=new ListNode(6);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;

       reservedBetween rb=new reservedBetween();
        ListNode listNode = rb.reservedList(node1, 2, 4);
        while(listNode!=null){
            System.out.println(listNode.value);
            listNode=listNode.next;
        }


    }
}
