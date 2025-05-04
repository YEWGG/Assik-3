Assignment 3
Project Description
This project includes the implementation of custom data structures in Java without using built-in collection classes (except for `Iterator`). The project consists of:

* A hash table `MyHashTable<K, V>` using separate chaining to handle collisions
* A binary search tree `BST<K, V>` with non-recursive methods and in-order traversal
* Full-scale testing using random data

Project Structure

1. MyHashTable\<K, V>

Description:

* A hash table using an array of chains (linked lists)
* Internal class `HashNode<K, V>` stores key-value pairs and links to next nodes
* Custom hash function: `Math.abs(key.hashCode()) % M`
* Implemented methods: `put`, `get`, `remove`, `contains`, `getKey`

Testing:

* Custom key class `MyTestingClass` includes a manual `hashCode()` implementation (no use of `Objects.hash()`)
* Inserted 10,000 randomly generated elements
* Analyzed the distribution of entries across chains
* Ensured a uniform hash distribution

2. BST\<K, V> (Binary Search Tree)

Description:

* All operations are implemented without recursion
* Implemented methods: `put`, `get`, `delete`, `size`, `isEmpty`
* Internal class `Node` stores key-value pairs and links to child nodes

Iterator:

* In-order traversal implemented using a stack (no recursion)
* Implements `Iterable<Entry<K, V>>` to allow iteration over both keys and values
* Example usage:

  for (var elem : tree) {
  System.out.println("key is " + elem.getKey() + " and value is " + elem.getValue());
  }

Usage Example

BST<Integer, String> tree = new BST<>();
        tree.put(5, "five");
        tree.put(3, "three");
        tree.put(10, "ten");
        tree.put(1, "one");

        for (var elem : tree) {
            System.out.println("key is " + elem.getKey() + " and value is " + elem.getValue());
        }
