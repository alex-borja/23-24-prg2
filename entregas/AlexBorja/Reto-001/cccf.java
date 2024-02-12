import java.util.Scanner;

class Cccf {
   static int totalPersonsInDay = 0;
   static int totalItemsSold = 0;

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      final int TOTAL_MINUTES = 720;
      final double NEW_COSTUMER_PROB = 0.6;
      final int MIN_ITEMS = 5;
      final int MAX_ITEMS = 15;

      int line = 0;
      int noClients = 0;
      int currentTime = 0;
      boolean is_open = true;
      int[] cashiers = { 0, 0, 0, 0, 0, 0};

      while(is_open) {
         currentTime++;
         is_open = currentTime < TOTAL_MINUTES;
         boolean incomingPerson = Math.random() < NEW_COSTUMER_PROB;
         line = incomingPerson ? line + 1 : line;
         totalPersonsInDay = incomingPerson ? totalPersonsInDay + 1 : totalPersonsInDay ;
         int length = line > 15 ? (cashiers.length - 1) : (cashiers.length - 2);

         printStatus(currentTime, incomingPerson, line);
      }
   }

   static void printStatus(int currentTime, boolean incomingPerson, int line) {
      String personas = incomingPerson ? "Llega 1 persona" : "No llega nadie";
      System.out.println("\nMINUTO " + currentTime + " - "  + personas + " - " + "En cola: " + line + "\n");
   }

}
