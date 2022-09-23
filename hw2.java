import java.util.*;
public class hw2 {
    public static void main(String[] args){
        var hmap = new HashMap<>();
        hmap.put(1, "January");
        hmap.put(2, "February");
        hmap.put(3, "March");
        hmap.put(4, "April");
        hmap.put(5, "May");
        hmap.put(6, "June");
        hmap.put(7, "July");
        hmap.put(8, "August");
        hmap.put(9, "September");
        hmap.put(10, "October");
        hmap.put(11, "November");
        hmap.put(12, "December");

        System.out.print("請輸入 1~12 ? ");
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        while(month<1 || month>12){
            System.out.println("範圍錯誤 !");
            System.out.print("請輸入 1~12 ? ");
            month = input.nextInt();
        }
        System.out.println("第 "+month+" 月的英文單字為 "+hmap.get(month));

        input.close();
    }
}
