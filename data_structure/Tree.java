package data_structure;

import java.util.ArrayList;
import java.util.List;

public class Tree {
  Node root;

  public class Node {
    int value;
    List<Node> children;
  }

  public boolean verticalExist(int value) {
    if (root != null) {
      Node node = verticalFind(root, value);
      if (node != null) {
        return true;
      }
    }
    return false;
  }

  private Node verticalFind(Node node, int value) {
    if (node.value == value) {
      return node;
    } else {
      for (Node child : node.children) {
        Node reuslt = verticalFind(child, value);
        if (reuslt != null) {
          return reuslt;
        }
      }
    }
    return null;
  }

  public boolean horizontalExists(int value) {
    if (root != null) {
      Node node = horizontalFind(value);
      if (node != null) {
        return true;
      }
    }
    return false;
  }

  private Node horizontalFind(int value) {
    List<Node> line = new ArrayList<>();
    line.add(root);
    while (line.size() > 0){
      List<Node> nextLine = new ArrayList<>();
      for (Node node : line) {
        if (node.value == value){
          return node;
        }
        nextLine.addAll(node.children);
      }
      line = nextLine;
    }
    return null;
  }

}