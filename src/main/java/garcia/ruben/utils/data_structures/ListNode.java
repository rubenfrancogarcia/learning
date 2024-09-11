package garcia.ruben.utils.data_structures;

public class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public int getVal() {
        return val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode populate(int[] arr){
        if(arr.length == 0) return null;
        if(arr.length == 1) return new ListNode(arr[0], null);
        ListNode headNode = new ListNode(arr[0], null);
        int i = 1;
        ListNode curr = headNode;
        while( i < arr.length){
            ListNode nextNode = new ListNode(arr[i], null);
            curr.setNext(nextNode);
            curr = nextNode;
            i++;
        }

        return headNode;
    }
}
