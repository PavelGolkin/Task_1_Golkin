package task4;

import java.util.Arrays;

public class max_min {
    public static void main(String[] args) {
        double[] numb = new double[22];

        for (int i = 0; i < 22; i++){

            numb[i] = Math.random()*100;
        }

        System.out.println(Arrays.toString(numb));
        Arrays.sort(numb);
        double max = numb[numb.length-1];
        double min = numb[0];
        double eq = max - min;
        System.out.println("Максимальный:"+max);
        System.out.println("Минимальный:"+min);
        System.out.println("Разница:" + eq);
    }
}
