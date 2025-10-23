public class Gauge {
    private int value;

    // constructor
    public Gauge() {
        value = 0;
    }

    // increase method
    public void increase() {
        if (value < 5) {
            value++;
        }
    }

    // decrease method
    public void decrease() {
        if (value > 0) {
            value--;
        }
    }
    // returns variables value
    public int value(){
        return value;
    }

    // boolean check
    public boolean full(){
        if(value == 5){
            return true;
        } else {
            return false;
        }
    }

}
