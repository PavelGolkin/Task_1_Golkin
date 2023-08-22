package task3;

import java.util.Arrays;

//Название классов всегда строго с большой буквы = Sort
public class sort {
    public static void main(String[] args) {
        int[] numb = new int[22];
        //Та же проблема с Math.random
        for (int i = 0; i < 22; i++){

            numb[i] = ((int)(Math.random()*100));
        }
        // Дублирование массива для пузырьковой сортировки
        int[] numb2 = numb;
        System.out.println(Arrays.toString(numb));
        // Сортировка встроенной функцией
        Arrays.sort(numb);
        System.out.println(Arrays.toString(numb));

        // Сортировка методом пузырька
        int a ;
        boolean sorted = false;
        while (!sorted){
            sorted = true;
            for (int i = 0; i  < numb2.length-1; i++){
                if (numb2[i] > numb2[i+1]){
                    sorted = false;
                    a=numb2[i];
                    numb2[i]=numb2[i+1];
                    numb2[i+1]=a;
                }
            }
        }
        System.out.println(Arrays.toString(numb2));
    }
}
