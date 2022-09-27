import java.util.Random;

public class TreeTest {
    public static void main(String[] args) {
        // int n = 10;
        // int rndseed = 100;
        // BinaryTree testTree = new BinaryTree();
        // Random rnd = new Random();

        // for (int i = 0; i < n; i++) {
        //     testTree.add(rnd.nextInt(rndseed), rnd.nextInt(rndseed));
        // }
        // testTree.root.print();

        // System.out.println(testTree.lookup(50));
        
        BinaryTree tree = new BinaryTree();
        tree.add(5, 105);
        tree.add(2, 102);
        tree.add(7, 107);
        tree.add(1, 101);
        tree.add(8, 108);
        tree.add(6, 106);
        tree.add(3, 103);
        for (int i : tree)
            System.out.println("next value " + i);

    }

}
