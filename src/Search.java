import com.sun.source.tree.ReturnTree;

public class Search {

    public int linearSearch(int[] arr, int x){
        int pos = 0;
        for(int i=0;i<arr.length;i++){
            if (arr[i] == x){
                pos = i;
                break;
            }
        }
        return pos;
    }

    public int binarySearch(int[] arr, int x){
        //SORT
        int pos = arr.length/2;
        int start = 0;
        int fin = arr.length-1;
        while (arr[pos]!=x ){
            if (arr[pos]>x)
                fin =  pos;
            else
                start = pos;
            pos = start + ((fin - start)/2);
        }
        return pos;
    }

    public int DFS(int[] arr, int x){
        int pos =0;
        return pos;
    }

    public int BFS(int[] arr, int x){
        int pos =0;
        return pos;
    }

}
