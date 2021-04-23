public class Task3_BubbleSortList{
  public static void main(String[] args){
    
    Object [] a={100, 50, 20, 200,150, 120, 90,110,80,70,70, -30, 180,0,175};
    LinkedList l= new LinkedList(a);
    
    for(Node n=l.head; n.next!=null; n=n.next){
      
      for(Node m=l.head; m.next!=null; m=m.next){
      if((int)m.element>(int)m.next.element){
        Object temp=m.element;
        m.element=m.next.element;
        m.next.element=temp;
      }
    }
      
    }
    
    for(Node n=l.head; n!=null; n=n.next){
      System.out.print(n.element+"  ");
    }
  }
}