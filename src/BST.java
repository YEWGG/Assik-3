import java.util.LinkedList;

public class BST<K extends Comparable<K>, V> {
    private Node root;

    private class Node {
        private K key;
        private V val;
        private Node left, right;

        public Node(K key, V val) {
            this.key = key;
            this.val = val;
        }
    }

    public void put(K key, V val) {
        root = put(root, key, val);
    }

    public V get(K key) {
        Node x = get(root, key);
        if (x == null) return null;
        return x.val;
    }

    public void delete(K key) {
        root = delete(root, key);
    }
    public Iterable<K> iterator() {
        LinkedList<K> keys = new LinkedList<>();
        inorder(root, keys);
        return keys;
    }
    private void inorder(Node node, LinkedList<K> keys) {
        if (node == null) return;
        inorder(node.left, keys);
        keys.add(node.key);
        inorder(node.right, keys);
    }
}
