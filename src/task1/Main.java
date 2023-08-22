package task1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 0 ; i < 100 ; i++){
            a+=1;
        }
        System.out.println(a);

        int b = 0;
        while (b < 100){
            b++;
        }
        System.out.println(b);

        int c = 0;
        do {
            c++;
        }
        while (c < 100);
        System.out.println(c);
    }


}
