public class Main {

    public static void main(String[] args) {
     int llamaHealth = 100;
     int llamaHunger = 100;
     boolean llamaNeedsFeeding = false;
     boolean llamaDead = false;

     if(llamaHunger < 40) {
         System.out.println("Your Llama is looking hungry");
         llamaNeedsFeeding = true;
     }

     if(llamaHunger == 0)
         llamaHealth -= 10;

     if (llamaHealth == 0) {
         System.out.println("You lost a llama");
     }
    }
}
