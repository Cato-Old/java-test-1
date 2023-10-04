/*
Zadanie 3
Napisz program, który przyjmie 5 cyfr w osobnych linijkach i następnie zwróci
na konsoli te cyfry w jednej linijce, oddzielone spacją, w odwrotnej kolejności.

PRZYKŁADOWE WEJŚCIE:

1
2
3
4
5

PRZYKŁADOWE WYJŚCIE:

5 4 3 2 1

 */
import java.io.*;

public class IO {
    private static final InputStream systemInputStream = System.in;
    private static final PrintStream systemOutputStream = System.out;

    public static void run(){
        var buffer = new byte[]{
                (byte) '1', 13, 10, (byte) '2', 13, 10,
                (byte) '3', 13, 10, (byte) '4', 13, 10,
                (byte) '5', 13, 10,
        };
        var inputStream = new ByteArrayInputStream(buffer);
        var outputStream = new ByteArrayOutputStream();
        var printStream = new PrintStream(outputStream);
        System.setIn(inputStream);
        System.setOut(printStream);
        reverseInput();
        System.setIn(systemInputStream);
        System.setOut(systemOutputStream);
        assert "5 4 3 2 1".equals(outputStream.toString());
    }

    public static void runWithoutSpying() {
        reverseInput();
    }

    private static void reverseInput() {
        // tutaj proszę umieścić swój kod
    }
}
