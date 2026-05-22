package org.example;

public class Merge_Sort {

    public static void conqure(int arr[],int Si,int mid,int Ei){

        int merged[] = new int [Ei-Si+1];
        int idx1 = Si;
        int idx2 = mid+1;
        int X = 0;

        while (idx1 <= mid && idx2 <= Ei){
            if(arr[idx1] <= arr[idx2]){
                merged[X++] = arr[idx1++];
            }else {
                merged[X++] = arr[idx2++];
            }
        }
        while (idx1 <= mid){
            merged[X++] = arr[idx1++];
        }

        while (idx2 <= Ei){
            merged[X++] = arr[idx2++];
        }

        for (int i = 0, j = Si; i<merged.length;i++,j++){
            arr[j] = merged[i];
        }
    }
    public static void divide(int arr[],int Si, int Ei){
         if(Si >= Ei){
             return;
         }
        int mid = Si + (Ei - Si)/2;
        divide(arr,Si,mid);
        divide(arr,mid+1,Ei);
        conqure(arr,Si,mid,Ei);
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;
        divide(arr , 0,n-1);

        for(int i = 0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
