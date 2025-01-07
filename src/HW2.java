import java.util.Random;

public class HW2 {
  public static String permission(int age, int temperature) {
      if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
          return ("Можно идти гулять");
      }
      if (age < 20 && temperature > 0 && temperature < 28) {
          return ("Можно идти гулять");
      }
      if (age > 45 && temperature > -10 && temperature < 25) {
          return ("Можно идти гулять");
      } else return ("Оставайтесь дома");
  }
    public static int generateRandomAge(int min, int max) {
      Random random = new Random();
      return random.nextInt((max - min) + 1) + min;
    }
    public static void main(String[] args) {
      int min = 1;
      int max = 100;
      String p1 = permission(generateRandomAge(min,max),26);
        System.out.println("Результат 1:" + p1);
        String p2 = permission(generateRandomAge(min,max),21);
        System.out.println("Результат 2:" + p2);
        String p3 = permission(generateRandomAge(min,max),13);
        System.out.println("Результат 3:" + p3);
        String p4 = permission(generateRandomAge(min,max),-1);
        System.out.println("Результат 4:" + p4);
        String p5 = permission(generateRandomAge(min,max),-5);
        System.out.println("Результат 5:" + p5);
    }
}