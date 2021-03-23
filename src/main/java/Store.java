import java.util.Random;
import java.util.concurrent.atomic.LongAdder;

public class Store {
  private final int maxNumberOfChecks = 10;
  private final int maxCost = 5000;
  LongAdder proceeds = new LongAdder();

  public void calculate() {
    Random random = new Random();
    int[] checks = new int[random.nextInt(maxNumberOfChecks)];
    for (int i = 0; i < checks.length; i++) {
      checks[i] = random.nextInt(maxCost);
      proceeds.add(checks[i]);
      System.out.println(Thread.currentThread().getName() + " " + checks[i]);
    }
  }

  public long getProceeds() {
    return proceeds.sum();
  }
}
