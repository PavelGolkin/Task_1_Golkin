package task2;
import java.util.Arrays;
import java.util.Random;

//Название классов всегда строго с большой буквы = Mass
public class mass {
    public static void main(String[] args) {

        int[] numb = new int[22];
        //Проверка в цикле for, должна быть по длине массива, а не позначению
        //на случай если длина массива в будущем изменится
        for (int i = 0; i < 22; i++){
            //Вместо использование Math.random лучше использовать класс Random
            numb[i] = ((int)(Math.random()*100));
        }
        System.out.println(Arrays.toString(numb));

    }
}
//Пример использования класса Random
class Array {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();
        //array.length вернёт длину массива
        for (int i = 0; i <= array.length - 1; i++) {
            //метод nextInt вернёт случайное число типа int, а в параметрах мы указываем диапозон значений
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
    }
}