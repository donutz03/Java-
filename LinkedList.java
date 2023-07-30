import java.util.LinkedList;

class Main {
  public static void main(String[] args) {
    
LinkedList<Type> linkedList = new LinkedList<>();

// create Integer type linked list
LinkedList<Integer> linkedListt = new LinkedList<>();

// create Integer type linked list
LinkedList<String> linkedListtt = new LinkedList<>();

  LinkedList<String> animals = new LinkedList<>();

    //Add elements to LinkedList
    animals.add("Dog");
    animals.add("Cat");
    animals.add("Cow");
    System.out.println("LinkedList: " + animals);

    animals.add(1, "Horse"); // 1 is the index and is an optional parameter


    String str = animals.get(1); // elem de pe poz 1

    // metoda set schimba elementul de pe pozitie cu alt element
    animals.set(2, "Rat");
    sout(animals) ;

    String strr = animals.remove(2); \

    //contains(elem)
    //indexOf(elem)
    //lastIndexOf(elem)
    //clear() -> removes all elements of a linkedList
    //iterator




  LinkedList is an implementation of QUeue and Deque

  LinkedList methods: 
    addFirst() -> adds element to the beginning of the list
    addLast() -> adds element to the end of the list
    removeFirst() -> remove from beginning of the list
    removeLast() -> remove from the end of the list
    getFirst() -> get item at the beginning of list
    getLast() -> get item at the end of list

















// doubly linked list
 /*   *prev
      data
      *next
      */
    
  }
}

public class DLL {
class Node {
  public int data;
  public Node prevNode;
  public Node nextNode;
  public Node(int data) {
    this.data = data;
  }
}

  Node headNode, tailNode = null;
  public void addDLLNode(int data) {
    Node newDLLNode(int data) = new Node(data);
    if(headNode == null) {
      headNode = tailNode = newDLLNode;
      headNode.prevNode = null;
      tailNode.nextNode = null;
    }

    else {
      tailNode.nextNode = newDLLNode;
      newDLLNode.prevNode = tailNode;
      tailNode = newDLLLNode;
      tailNode.nextNode = null;
    }
  }

public void displayNode() {
  Node currentNode = headNode;
  if (headNode == null) {
    System.out.println(
"Doubly linked list is empty";
)
  }
}
  
}
