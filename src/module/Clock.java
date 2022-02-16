package module;

/** The code below will print time
 * it always starts with 00:00:00
 *
 * */

public class Clock {
    private ClockHand seconds;
    private ClockHand minutes;
    private ClockHand hours;

    public Clock() {
        this.seconds = new ClockHand(60);
        this.minutes = new ClockHand(60);
        this.hours = new ClockHand(24);
    }

    public void advance() {
        this.seconds.advance();

        if (this.seconds.getValue() == 0) {
            this.minutes.advance();

            if (this.minutes.getValue() == 0) {
                this.hours.advance();
            }
        }
    }

    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
}

