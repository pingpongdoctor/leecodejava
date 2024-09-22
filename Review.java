public class Review {
  //review mergSort
  //logn
  //stable
  private void mergeS(int[] list, int l, int r){
    if(l<r){
      int m =(l+r)/2;
      mergeS(list,l,m);
      mergeS(list,m+1,r);
      merge(list,l,m,r);
    }
  }
  private void merge(int[] list,int l,int m,int r){
    int[] list1 = new int[m-l+1];
    int[] list2 = new int[r-m];

    for(int i=0; i<list1.length;i++){
      list1[i]=list[i+l];
    }
    for(int i=0; i<list2.length;i++){
      list2[i]=list[i+m+1];
    }

    int i = 0;
    int k = 0;
    int j = 0;

    while(k<list1.length&&j<list2.length){
      if(list1[k]<list2[j]){
        list[l+i]=list1[k];
        k++;
      }else{
        list[l+i]=list2[j];
        j++;
      }
      i++;
    }

    while(k<list1.length){
      list[l+i]=list1[k];
      k++;
      i++;
    }

    while(j<list2.length){
      list[l+i]=list2[j];
      j++;
      i++;
    }
  }
  public int[] mergeSort(int[] list){
    mergeS(list,0,list.length-1);
    return list;
  }

  //review insertion sort
  //n2
  //stable
  public int[] insertionSort(int[] list){
    for(int i = 1; i<list.length; i++){
      int j = i - 1;
      while(j>=0&&list[j]>list[j+1]){
        int tmp = list[j-1];
        list[j-1]=list[j];
        list[j]=tmp;
        j--;
      }
    }
    return list;
  }

  //review quick sort
  
}