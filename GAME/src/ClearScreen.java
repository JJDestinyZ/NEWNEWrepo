public class ClearScreen {
    public void clear(int seconds) {
        try {
            Thread.sleep(seconds * 1000);

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } catch (Exception e) {
            System.out.println("Failed to clear screen: " + e.getMessage());
        }
    }
}

