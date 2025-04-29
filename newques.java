public class newques {
    public static class Treenode{
        int data;
        Treenode left;
        Treenode right;
        Treenode(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }
    public static int fdepth(Treenode root){
        if(root==null){
            return 0;
        }
        int left=fdepth(root.left);
        int right=fdepth(root.right);
        return Math.max(left, right)+1;
    }
    public static void main(String[] args){
        Treenode root = new Treenode(1);
        Treenode first = new Treenode(2);
        Treenode second = new Treenode(3);
        root.left=first;
        root.right=second;
        second.left=new Treenode(15);
        second.right=new Treenode(7);
        int depth=fdepth(root);
        System.out.println(depth);
    }
}
