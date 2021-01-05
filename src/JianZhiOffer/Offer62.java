package JianZhiOffer;

import java.util.ArrayList;
import java.util.List;

public class Offer62 {
    public int lastRemaining(int n, int m) {
         List<Integer> list =new ArrayList<>();
         for(int i = 0;i<n;i++){
             list.add(i);
         }
         int index=0;

         while(n>1){
             index=(index+m-1)%n;
             list.remove(index);
             n--;
         }
         return list.get(0);
    }

    public static void main(String[] args) {
        Offer62 Y = new Offer62();
        System.out.println(Y.lastRemaining(5,3));
    }
}
