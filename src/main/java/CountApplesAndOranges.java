import java.util.List;

public class CountApplesAndOranges {
  public static void main(String[] args) {

  }

  public static void countApplesAndOranges(int s, int t, int a, int b,
                                           List<Integer> apples,
                                           List<Integer> oranges) {
    // Write your code here
    int accessibleApples = 0;
    int accessibleOranges = 0;
    for (Integer apple : apples) {
      if (apple + a >= s && apple + a <= t) {
        accessibleApples = accessibleApples + 1;
      }
    }

    for (Integer orange : oranges) {
      if (orange + b >= s && orange + b <= t) {
        accessibleOranges = accessibleOranges + 1;
      }
    }

    System.out.println(accessibleApples);
    System.out.println(accessibleOranges);
  }
}
