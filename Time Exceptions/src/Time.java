public class Time {
    private int hour;
    private int minute;
    private int seconds;

    Time(){
        this.hour=hour;
        this.minute=minute;
        this.seconds=seconds;
    }

    public void setHour(int hour) {
        if(hour>23||hour<0){
            throw new IllegalArgumentException("Hour must be smaller than 23 and greater than 0");
        }
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int minute) {
        if(minute>59||minute<0){
            throw new IllegalArgumentException("Minute must be smaller than 59 and greater than 0");
        }
        this.minute = minute;
    }

    public int getMinute() {
        return minute;
    }

    public void setSeconds(int seconds) {
        if(seconds>59||seconds<0){
            throw new IllegalArgumentException("Seconds must be smaller than 59 and greater than 0");
        }
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    public void showTime(Time time){
        System.out.println("Time : " +getHour()+":"+getMinute()+":"+getSeconds());
    }
}
