package Prototype;


import java.util.Scanner;

public class PrototypeFunction {
    public static void PrototypeFn() throws CloneNotSupportedException {
        FansCache.loadCache();

        System.out.println("请选择要接见的观众的种类：[1]Dog [2]Cat [3]Bear");
        int counter = 0;
        int edgCounter = 0;
        int igCounter = 0;
        int rngCounter = 0;
        String str = "";
        boolean flag = true;
        while (flag) {
            Scanner sc = new Scanner(System.in);
            str = sc.nextLine();
            Fans clonedFans = FansCache.getFans("1");
            System.out.println("Here is a " + clonedFans.getClub());
            counter++;
            switch (str) {
                case "1": {
                    edgCounter++;
                }
                break;
                case "2": {
                    igCounter++;
                }
                break;
                case "3": {
                    rngCounter++;
                }
                break;
                case "view": {
                    System.out.println("The number of Fans:" + counter);
                    System.out.println("The number of edgFans:" + edgCounter);
                    System.out.println("The number of igFans:" + igCounter);
                    System.out.println("The number of rngFans:" + rngCounter);
                }
                break;
                case "Q": {
                    flag = false;
                }
                break;
                default: {
                    System.out.println("Invalid input,please try again!");
                }
                break;
            }
        }
    }
}
