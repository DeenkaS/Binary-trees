import java.util.Random;

public class TreeTest {
    public static void main(String[] args) {
        int n = 10;
        int rndseed = 100;
        BinaryTree testTree = new BinaryTree();
        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            testTree.add(rnd.nextInt(rndseed), rnd.nextInt(rndseed));
        }
        testTree.root.print();

        System.out.println(testTree.lookup(50));

        
        
    }

}
