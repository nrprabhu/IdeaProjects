/**
 * Created by prabnara on 9/4/16.
 */
public class HelloWorld {
public static void main(String[] args) {
    System.out.println("Hello, World!");

    int myFirstInt = 2147483647;
    int mySecondInt = -2147483648;
    short myFirstShort = 32767;
    short mySecondShort = -32768;
    //myFirstNumber = 327670000;
    for (int i = 2147480000; i>=0; i++) {
        System.out.println(i);
    }
    int x=2147483647;
    System.out.println(++x);

    System.out.println(myFirstInt);
    System.out.println(mySecondInt);
    System.out.println(myFirstShort);
    System.out.println(mySecondShort);

}
}
