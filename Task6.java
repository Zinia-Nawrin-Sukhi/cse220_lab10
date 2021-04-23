public  class Task6
{

public static void main(String[] args) {
   
         
        int[] arr1 = {2,45,234,567,876,900,976,999};
        int index = recursiveBinarySearch(arr1,0,arr1.length,45);
        System.out.println("Found 45 at "+index+" index");
        index = recursiveBinarySearch(arr1,0,arr1.length,999);
        System.out.println("Found 999 at "+index+" index");
        index = recursiveBinarySearch(arr1,0,arr1.length,876);
        System.out.println("Found 876 at "+index+" index");
    }
}