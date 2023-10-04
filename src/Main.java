public class Main {
    public static void main(String[] args) {
        try {
            Ternary.run();
            System.out.println("Zadanie 1 przechodzi testy.");
        } catch (AssertionError err) {
            System.out.println("Zadanie 1 nie przechodzi testów.");
        }
        try {
            LCM.run();
            System.out.println("Zadanie 2 przechodzi testy.");
        } catch (AssertionError err) {
            System.out.println("Zadanie 2 nie przechodzi testów");
        }
        try {
            IO.run();
            System.out.println("Zadanie 3 przechodzi testy.");
        } catch (AssertionError err) {
            System.out.println("Zadanie 3 nie przechodzi testów.");
        }
        IO.runWithoutSpying();
    }
}
