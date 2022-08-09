public class Light {
    public static void main(String[] args) {
        int lightspeed;
        int days;
        int seconds;
        int distance;
        lightspeed = 15000; //miles per sec
        days  = 100;
        seconds = days*24*60*60;
        distance = seconds*lightspeed;
        System.out.println("In " +days+ " days light will travel about " +distance+ " miles");
    }
}
