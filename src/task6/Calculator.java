package task6;

public class Calculator {
    /*
    Впринципе по тз верно
     */

    //sum
    int summ(int a , int b){
        int ans;
        ans = a+b;
        //int ans = a + b; более котроткая запись чтобы не городить лапшу
        System.out.println(ans);
        return ans;
    }
    int minus(int a , int b){
        int ans;
        ans = a-b;
        System.out.println(ans);
        return ans;
    }
    int mn(int a , int b){
        int ans;
        ans = a * b;
        System.out.println(ans);
        return ans;
    }
}
