import java.util.Scanner;

/**
 * Created by 晓辉 on 2016/8/8.
 */
public class Num {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int count[]=new int[10001];
        for (int i = 0; i <n ; i++) {
           ++count[sc.nextInt()];
        }
        int maxCount=-1;
        int result=0;
        for (int i = 0; i <10000 ; i++) {
            if (count[i]>maxCount){
                maxCount=count[i];
                result=i;
            }
        }
        System.out.println(result);
    }
}
