import java.util.Arrays;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2021-02-01
 * Time: 19:27
 */
public class TestDemo {
    //直接插入排序
    public static void insertSort(int[] array){
        for(int i = 1; i < array.length; i++){
            int j = i-1;
            int tmp = array[i];
            for(; j >= 0; j--){
                if(array[j] > tmp){
                    array[j+1] = array[j];
                }else{
                   break;
                }
            }
            array[j+1] = tmp;
        }
    }


    //希尔排序
    public static void sellSort(int[] array){
        int[] arr = {5,3,1};
        for(int i = 0; i < arr.length; i++){
            sell(array,arr[i]);
        }
    }

    public static void sell(int[] array, int gap){
        for(int i = gap; i < array.length; i++){
            int tmp = array[i];
            int j = i-gap;
            for(; j >= 0; j -= gap){
                if(array[j] > tmp ){
                    array[j+gap] = array[j];
                }else{
                    break;
                }
            }
            array[j+gap] = tmp;
        }

    }


    //直接选择排序
    public static void selectSort(int[] array){
        for(int i = 0; i < array.length-1; i++){
            for(int j = i+1; j < array.length;j++){
                if(array[j] < array[i]){
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    //冒泡排序
    public static void bubbleSort(int[] array){
        for(int i = 0; i < array.length-1; i++){
            boolean flag = true;
            for(int j = 0; j < array.length-i-1; j++){
                if(array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
    }


    //快排（可优化）
    public static void quickSort(int[] array){
        quick(array,0,array.length-1);
    }
    public static void quick(int[] array, int low, int high){
        if(low < high){  // if(low > high)return;
            int piv = pivot(array,low,high);
            quick(array,low,piv-1);
            quick(array,piv+1,high);
        }
    }
    public static int pivot(int[] array, int start, int end){
        int tmp = array[start];
        while(start < end){
            while(start < end && array[end] >= tmp) {
                end--;
            }
            if(start >= end){
                array[start] = tmp;
                break;

            }else{
                array[start] = array[end];
            }

            while(start < end && array[start] <= tmp){
                start++;
            }
            if(start >= end){
                array[start] = tmp;
                break;
            }else{
                array[end] = array[start];
            }

        }
        array[start] = tmp;
        return start;

    }



    //快排--》非递归
    public static void quickSortNor(int[] array){
        Stack<Integer> stack = new Stack<>();
        int low = 0;
        int high = array.length-1;
        int piv = pivot(array,low,high);
        if(piv > low + 1) {
            stack.push(low);
            stack.push(piv-1);
        }
        if(piv < high-1) {
            stack.push(piv+1);
            stack.push(high);
        }
        while (!stack.empty()) {
            high = stack.pop();
            low = stack.pop();
            piv = pivot(array, low, high);//
            if (piv > low + 1) {
                stack.push(low);
                stack.push(piv - 1);
            }
            if (piv < high - 1) {
                stack.push(piv + 1);
                stack.push(high);
            }

        }

    }

    //归并排序
    public static void mergeSort(int[] array,int low,int high){
        if(low >= high){
            return;
        }
        int mid = (low+high)/2;// =(low+high)>>>1;  无符号右移；
        mergeSort(array,low,mid);
        mergeSort(array,mid+1,high);
        merge(array,low,mid,high);


    }
    public static void merge(int[] array,int low,int mid,int high){
        int s1 = low;
        int s2 = mid+1;
        int[] ret = new int[high-low+1];
        int i = 0;
        while(s1 <= mid && s2 <= high){
            if(array[s1] < array[s2]){
                ret[i++] = array[s1++];
            }else{
                ret[i++] = array[s2++];
            }
        }
        while(s1 <= mid){
            ret[i++] = array[s1++];
        }
        while(s2 <= high){
            ret[i++] = array[s2++];
        }
        for(int j = 0; j < ret.length; j++){
            array[j+low] = ret[j];
        }
    }

    //堆排

    public static void heapSort(int[] array){
        creatHeap(array);
        for(int i = 0; i < array.length-1; i++){
            int tmp = array[0];
            array[0] = array[array.length-1-i];
            array[array.length-1-i] = tmp;
            adjustDown(array,array.length-1-i,0);
        }

    }

//    public void swap(int[] array, int i, int j){
//
//    }

    public static void creatHeap(int[] array){
        for(int i = (array.length-1-1)/2; i >=0; i--){
            adjustDown(array,array.length,i);
        }
    }

    public static void adjustDown(int[] array,int len, int parent){
        int child = 2*parent+1;
        while(child < len){
            if(child+1 < len && array[child+1] > array[child]){
                child++;
            }
            if(array[child] > array[parent]){
                int tmp = array[child];
                array[child] = array[parent];
                array[parent] = tmp;
                parent = child;
                child = 2*parent+1;
            }else{
                break;
            }
        }
    }




    public static void main(String[] args) {
        int[] array = {10,3,1,7,21,4,65,29};
       // insertSort(array);
        //System.out.print(Arrays.toString(array));
        //System.out.println();
       // sellSort(array);
       // System.out.print(Arrays.toString(array));
      //  selectSort(array);
       // System.out.print(Arrays.toString(array));
        //bubbleSort(array);
       // System.out.print(Arrays.toString(array));

        quickSortNor(array);
        System.out.println(Arrays.toString(array));
//
//        heapSort(array);
//        System.out.println(Arrays.toString(array));
    }
}
