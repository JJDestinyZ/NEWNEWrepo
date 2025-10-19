public class DrawBox {
    public void draw(int width, int height) {

        System.out.print("┌");
        for (int i = 0; i < width - 2; i++) {
            System.out.print("─");
        }
        System.out.println("┐");

        for (int i = 0; i < height - 2; i++) {
            System.out.print("│");
            for (int j = 0; j < width - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("│");
        }

        System.out.print("└");
        for (int i = 0; i < width - 2; i++) {
            System.out.print("─");
        }
        System.out.println("┘");
    }
}
