import java.util.*;
public class hw1 {
    public static void main(String[] args) {
        TreeSet<Integer> tset = new TreeSet<>();
        //取出"不重複"的10個亂數加入tset
        int count = 1;
        while(tset.size()<10){
            int i = (int)(Math.random()*100)+1;
            if(!tset.contains(i)){
                System.out.println("第 "+count+" 個號碼 : "+i);
                tset.add(i);
                count ++;
            }
            else{
                continue;
            }
        }
        
        //物件內元素個數
        System.out.println("物件內元素個數為 : "+tset.size());
        //物件內元素的內容
        System.out.println("物件內元素的內容為 : "+tset);
        //第一個元素內容
        System.out.println("第一個元素內容為 : "+tset.first());
        //最後一個元素內容
        System.out.println("最後一個元素內容 : "+tset.last());
        //內容介於30~70者
        TreeSet<Integer> tset2 = new TreeSet<>(); 
        for(int n : tset){
            if(n>30 && n<70){
                tset2.add(n);
            }
        }
        System.out.println("內容介於30~70者 : "+tset2);
    }
}
