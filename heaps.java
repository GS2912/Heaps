// heaps visualized as complete BT, but implemented as array/arrayList...
// min/ max heaps...
//index filling starts from zero
// node->i, left child->2i+1, right child->2i+2
// node->i , parent-> (x-1)/2


// NOTE: this implementation is for min heap....for max heap, just modify the conditions a bit...
import java.util.ArrayList;

public class heaps {
    static class Heap{
        ArrayList<Integer> arr= new ArrayList<>();

        public void add(int data){                        // 0(logn)
            arr.add(data);// add the data

            int ch= arr.size()-1;
            int par= (ch-1)/2;

            while( arr.get(ch)<arr.get(par)){
                int temp = arr.get(ch);
                arr.set(ch,arr.get(par));
                arr.set(par,temp);

                ch=par;
                par=(ch-1)/2; // update
            }
        }

        public int peek(){                                 // O(1)
            return arr.get(0);
        }

        public int remove(){               // 0(logn)
            int data= arr.get(0);

            // step-1 swap first and last
            int temp= arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            //remove last 
            arr.remove(arr.size()-1);

            // heapify
            heapify(0);

            return data;
        }

        public void heapify(int i){                       // helper
            int minIdx = i;
            int left = 2*i+1;
            int right= 2*i+2;

            if(left<arr.size()-1 && arr.get(left)<arr.get(minIdx)){
                minIdx=left;
            }

            if(right<arr.size()-1 && arr.get(right)<arr.get(minIdx)){
                minIdx=right;
            }

            if(minIdx!=i){
                int temp = arr.get(i);
                arr.set(i , arr.get(minIdx));
                arr.set(minIdx, temp);
                heapify(minIdx);
            }

        }
    }
    
    public static void main(String args[]){

    }
    
}
