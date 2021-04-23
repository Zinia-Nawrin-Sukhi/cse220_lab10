public class Node{
  public Object element;
  public Node next;
  public Node prev;
  
  public Node(Object e, Node n){
    element =e ;
    next = n;
    
  }
  
  public Node(Object e, Node n, Node p){
    element =e ;
    next = n;
    prev =p;
    
  }
  
}