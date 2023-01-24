class Clock {
    int hour = 3;
    int minute = 0;
    int second = 0;

    Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    void tick() {
        // plus 1 second
        if (second == 59) {
            if (minute == 59) {
                if (hour == 23) hour = 0;
                else hour += 1;
                minute = 0;
            } else minute += 1;
            second = 0;
        } else second += 1;
    }

    public String toString() {
        return String.format("%2d : %2d : %2d", hour, minute, second);
    }
}