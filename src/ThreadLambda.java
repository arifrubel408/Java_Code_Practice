
public class ThreadLambda {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(1000000000000L);
            } catch (Exception e) {
                e.printStackTrace();
            }

        });
        thread.setName("Arif Rubel");
        thread.start();
        System.out.println(thread);
    }
}
