package Solution;

public class reverseNode {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }

        void print() {
            System.out.print(this.val);
            if(this.next != null)
            {
                System.out.print("-->");
                this.next.print();
            }
        }
        static void printTo(Node node){
            System.out.print(node.val);
            if (node.next!=null){
                System.out.print("-->");
                Node.printTo(node.next);
            }
        }
        void add(int val) {
            Node newNode = new Node(val);
            if(this.next == null)
                this.next = newNode;
            else
                this.next.add(val);
        }
        boolean remove(int val){
            if (this.next==null){
                System.out.println();
                System.out.println("未找到删除节点");
                return false;
            }
            if (this.next.val==val){
                this.next = this.next.next;
            }else this.next.remove(val);

            return true;
        }
    }
    public static Node reverseNode(Node head){
        // 如果链表为空或只有一个节点，无需反转，直接返回原链表表头
        if(head == null || head.next == null)
            return head;

        Node reHead = null;
        Node cur = head;
        while(cur!=null){
            Node reCur = cur;      // 用reCur保存住对要处理节点的引用
            cur = cur.next;        // cur更新到下一个节点
            reCur.next = reHead;   // 更新要处理节点的next引用
            reHead = reCur;        // reHead指向要处理节点的前一个节点
        }
        return reHead;
    }


    public static void main(String[] args) {
        Node node = new Node(1);
        for (int i = 2; i < 6 ; i++) {
           node.add(i);
        }
        node.print();
        System.out.println();
        System.out.println("倒转后");
        Node reverseNode = reverseNode(node);

        reverseNode.print();
        System.out.println();
        Node.printTo(reverseNode);
        if (reverseNode.remove(3)) {
            System.out.println();
            System.out.println("删除后");
            reverseNode.print();
        }
    }
}
