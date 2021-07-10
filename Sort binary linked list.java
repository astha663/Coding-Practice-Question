public class Solution {
    public ListNode solve(ListNode head) {
        ListNode temp=head;
        int zeroes=0, ones=0;
        while(temp != null){
            if(temp.val == 0) zeroes++;
           else ones++;
            temp=temp.next;
            }
        temp=head;
        while(zeroes>0){
            temp.val=0;
            temp=temp.next;
            zeroes--;
        }
        while(ones>0){
            temp.val=1;
            temp=temp.next;
            ones--;
        }
        return head;
    }
}
