package automation.opencart.utilis;

public class Wait {
    public  static void Time(int mill){
        try {
            Thread.sleep(mill);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
