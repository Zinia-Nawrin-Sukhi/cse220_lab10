public class Task5_InsertionSortList{
  public static void main(String[] args){
    
    Object [] a={100, 50, 20, 200,150, 120, 90,110,80,70,70, -30, 180,0,175};
    DoublyList d= new DoublyList (a);
    
    Node hd=d.head;
    for(Node n=hd.next;n!=null;n=n.next){
      for(Node i=n;i.prev!=null;i=i.prev){
        Node j=i.prev;
        if((int)i.element<(int)j.element){
          Object temp=i.element;
          i.element=j.element;
          j.element=temp;
        }
      }
    }
    
  }
}