public class main {
    public static void main(String[] args) {
        Count count = new Count();
        try {
            while (count.getMyThread().isAlive()) {
                System.out.println("Main thread will be alive till in");
                Thread.sleep(1500);
            }
        }
        catch (InterruptedException e) {
            System.out.println("Main thread inter");
        }
        System.out.println("Main thread run is over");
    }
}
