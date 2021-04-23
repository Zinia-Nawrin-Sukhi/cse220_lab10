public class Task4_SelectionSortList{
  public static void main(String[] args){
    
    Object [] a={100, 50, 20, 200,150, 120, 90,110,80,70,70, -30, 180,0,175};
    LinkedList l= new LinkedList(a);
    
    Object min;
    Node minNode;
    
    if (l.head == null || l.head.next == null){
    //DO NOTHING if its an empty or one element list cause its alreay sorted
    }else{
        
    for(Node n=l.head; n.next!=null; n=n.next){
      min=n.element;
      minNode=n;
      
      for(Node m=n; m!=null; m=m.next){
        if((int)m.element<(int)min){
          min=m.element;
          minNode=m;
        }
      }
      
      Object temp= n.element;
      n.element=min;
      minNode.element=temp;
      
    }
    
    for(Node n=l.head; n!=null; n=n.next){
      System.out.print(n.element+"  ");
    }
    }

  }
}