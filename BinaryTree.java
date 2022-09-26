public class BinaryTree {
    public class Node {
        public Integer key;
        public Integer value;
        public Node left, right;

        public Node(Integer key, Integer value) {
            this.key = key;
            this.value = value;
            this.left = this.right = null;
        }

        public void print() {
            if (left != null)
                left.print();
            System.out.println(" key: " + key + "\tvalue: " + value);
            if (right != null)
                right.print();
        }
    }

    Node root;

    public BinaryTree() {
        root = null;
    }

    void add(Integer key, Integer value) {
        Node next = this.root;

        if (this.root == null) {
            this.root = new Node(key, value);
            return;
        } else {
            while (true) {
                if (next.key < key) {
                    if (next.left == null) {
                        next.left = new Node(key, value);
                        return;
                    }
                    next = next.left;
                }
                if (next.key > key) {
                    if (next.right == null) {
                        next.right = new Node(key, value);
                        return;
                    }
                    next = next.right;
                }
                if (next.key == key) {
                    next.value = value;
                    return;
                }
            }
        }
    }

    Integer lookup(Integer key) {
        Node next = this.root;

        if (this.root == null) {
            return null;
        } else {
            while (true) {
                if (next.key < key) {
                    if (next.left == null) {
                        return null;
                    }
                    next = next.left;
                }
                if (next.key > key) {
                    if (next.right == null) {
                        return null;
                    }
                    next = next.right;
                }
                if (next.key == key) {
                    return next.value;
                }
            }
        }
    }
}
