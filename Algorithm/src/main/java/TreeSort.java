public class TreeSort {
    int data;
    TreeSort left;
    TreeSort right;


    public TreeSort(int data) {
        this.data = data;
        left = null;
        right = null;
    }
    public void insert(TreeSort treeSort , int data){
        if (treeSort.data<data){
            if (treeSort.right==null){
                treeSort.right = new TreeSort(data);
            }else{
                insert(treeSort.right,data);
            }
        }else{
            if (treeSort.left==null){
                treeSort.left = new TreeSort(data);
            }else {
                insert(treeSort.left,data);
            }
        }
    }
    public void in(TreeSort treeSort){
        if (treeSort!=null){
            in(treeSort.left);
            System.out.print(treeSort.data+" ");
            in(treeSort.right);
        }
    }

    public static void main(String[] args) {
        int data[]={5,4,6,1,2,8,9,0};
        TreeSort treeSort = new TreeSort(data[0]);
        for (int i=1;i<data.length;i++){
            treeSort.insert(treeSort,data[i]);
        }
        treeSort.in(treeSort);
    }
}
