public class Main {
  public static void main(String[] args) throws InterruptedException {
    final Store store = new Store();
    Thread thread1 = new Thread(null, store::calculate, "Магазин1");
    Thread thread2 = new Thread(null, store::calculate, "Магазин2");
    Thread thread3 = new Thread(null, store::calculate, "Магазин3");

    thread1.start();
    thread2.start();
    thread3.start();

    thread3.join();
    thread2.join();
    thread3.join();

    System.out.println("Выручка = " + store.getProceeds());
  }
}
