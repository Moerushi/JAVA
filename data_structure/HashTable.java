package data_structure;

public class HashTable<K, V> {

  public int size = 0;
  private int capacity = 16;
  private Node<K, V>[] nodes = new Node[capacity];

  private class Node<K, V> { // node - узел
    private final K key;
    private V value;
    private final int hash;
    private Node<K, V> next;

    public Node(K key, V value) {
      this.key = key;
      this.value = value;
      this.hash = key.hashCode() ^ value.hashCode();
    }

    public int getHash() {
      return hash;
    }

  }

  public void input(K key, V value) {
    Node<K, V> node = new Node<>(key, value);
    int index = node.getHash() % capacity;
    if (nodes[index] == null) {
      nodes[index] = node;
      size++;
      return;
    }
    for (Node<K, V> i = nodes[index]; i != null; i = node.next) {
      if (i.key == key) {
        i.value = value;
      }
      if (i.next == null) {
        i.next = node;
        size++;
        return;
      }

    }
  }

  public V getV(K key) {
    for (Node<K, V> n : nodes) {
      if (n != null) {
        for (Node<K, V> i = n; i != null; i = i.next) {
          if (i.key == key) {
            return i.value;
          }
        }

      }
    }
    return null;
  }

}
