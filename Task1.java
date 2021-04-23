 

class Task1 
{ 

 static int minIndex(int a[], int i, int j) 
 { 
  if (i == j) 
   return i; 
 
  
  int k = minIndex(a, i + 1, j); 
 
 
  return (a[i] < a[k])? i : k; 
 } 
 

 static void recurSelectionSort(int a[], int n, int index) 
 { 
  
 
  if (index == n) 
  return; 
 
  
  int k = minIndex(a, index, n-1); 
 
 
  if (k != index){ 

  int temp = a[k]; 
  a[k] = a[index]; 
  a[index] = temp; 
  } 
  
  recurSelectionSort(a, n, index + 1); 
 } 
 
 

 public static void main(String args[]) 
 { 
  int arr[] = {3, 1, 5, 2, 7, 0}; 
 
  
  recurSelectionSort(arr, arr.length, 0); 
 
 
  for (int i = 0; i< arr.length; i++) 
   System.out.print(arr[i] + " "); 
 } 
} 
