public class Task1_SelectionSortArray{
  public static void main(String[] args){
    int [] a={100, 50, 20, 200,150, 120, 90,110,80,70,70, -30, 180,0,175};
    
    int min;
    int minIndex;
    for(int i=0; i<a.length-1; i++){ //how many times loop will run
      min=a[i];
      minIndex=i;
      for(int j=i; j<a.length;j++){ //how many index(s) will be compared
        if(a[j]<min){
          min=a[j];
          minIndex=j;
        }
      }
      int temp=a[i];
      a[i]=min;
      a[minIndex]=temp;
      
    }
   
    for(int i=0; i<a.length;i++){
      System.out.print(a[i]+"  ");
    }
    
  }
}