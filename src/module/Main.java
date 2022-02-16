package module;

public class Main {

    public static void main(String[] args) {

        Clock clock = new Clock();

        int count = 0; // counter of how many steps the clock should tick

        while (count < 300) {
            System.out.println(clock);

            clock.advance();

            count++;

        }
    }

}
