package Part4_incapsulation;

public class Clock {
    String time;
     public void setTime(String t) {
         time = t;
     }
     public String getTime() {
         return time;
     }

     static class ClockTestDrive {
         public static void main(String[] args) {
             Clock c = new Clock();
             c.setTime("12:45");
             String tod = c.getTime();
             System.out.println("время: " + tod);
         }
     }
}
