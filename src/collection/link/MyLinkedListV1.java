package collection.link;

public class MyLinkedListV1 {
    private Node first;
    private int size = 0;

    public void add(Object e){
        Node newNode = new Node(e);
        if(first == null){
            first = newNode;
        }else {
            getLastNode();
        }
    }

    public Node getLastNode(){
        Node x = first;
        while (x.next != null){
            x = x.next;
        }
        return x;
    }
}
