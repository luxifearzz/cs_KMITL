class Clock2 {
    int hour;
    String labels;
    int minute;
    int second;

    Clock2(int h, String l, int m, int s) {
        this.hour = h;
        this.labels = l;
        this.minute = m;
        this.second = s;
    }

    void setTime(int h, String l, int m, int s) {
        this.hour = h;
        this.labels = l;
        this.minute = m;
        this.second = s;
    }

    public String toString() {
        return String.format("%2d%s : %2d : %2d", hour, labels, minute, second);
    }

    void tick() {
        if (second == 59) {
            second = 0;
            if (minute == 59) {
                minute = 0;
                if (hour == 11) {
                    hour += 1;
                    labels = labels.equals("AM") ? "PM" : "AM";
                } else if (hour == 12) hour = 0;
                else hour += 1;
            } else minute += 1;
        } else second += 1;
    }
}