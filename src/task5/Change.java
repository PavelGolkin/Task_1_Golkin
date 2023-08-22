package task5;

import java.util.Arrays;
//Тут всё супер, кроме Math.random,
public class Change {
    public static void main(String[] args) {
        int[] numb = new int[22];

        for (int i = 0; i < 22; i++){
            numb[i] = ((int)(Math.random()*100));
        }

        System.out.println(Arrays.toString(numb));
        //Из-за условия в цикле for l < numb.length - 1, у тебя не проверяется последнее значение
        //т.к  < не включает твоё последнее значение
        //следует переписать так l <= numb.length - 1,
        for (int l = 0; l <= numb.length - 1; l++){
            if(numb[l] % 2 == 0){
                numb[l] = - numb[l];
            }
        }

        System.out.println(Arrays.toString(numb));
    }
}
