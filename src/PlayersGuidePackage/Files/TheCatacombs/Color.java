package PlayersGuidePackage.Files.TheCatacombs;

public class Color {
    private final int red;
    private final int green;
    private final int blue;

    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public Color(int rgb) {
        this.red = (rgb >> 16) & 0xFF;
        this.green = (rgb >> 8) & 0xFF;
        this.blue = rgb & 0xFF;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public static final Color BLACK = new Color(0, 0, 0);
    public static final Color WHITE = new Color(255, 255, 255);
    public static final Color RED = new Color(255, 0, 0);
    public static final Color GREEN = new Color(0, 255, 0);
    public static final Color BLUE = new Color(0, 0, 255);
    public static final Color YELLOW = new Color(255, 255, 0);
    public static final Color MAGENTA = new Color(255, 0, 255);
    public static final Color CYAN = new Color(0, 255, 255);

    public static void main(String[] args) {
        Color myColor = new Color(100, 150, 200);
        Color predefinedColor = Color.RED;
        System.out.println("myColor - Red: " + myColor.getRed() + ", Green: " + myColor.getGreen() + ", Blue: " + myColor.getBlue());
        System.out.println("predefinedColor - Red: " + predefinedColor.getRed() + ", Green: " + predefinedColor.getGreen() + ", Blue: " + predefinedColor.getBlue());

        System.out.println("\nThe eight commonly used colors are: ");
        System.out.println("BLACK - Red: " + Color.BLACK.getRed() + ", Green: " + Color.BLACK.getGreen() + ", Blue: " + Color.BLACK.getBlue());
        System.out.println("WHITE - Red: " + Color.WHITE.getRed() + ", Green: " + Color.WHITE.getGreen() + ", Blue: " + Color.WHITE.getBlue());
        System.out.println("RED - Red: " + Color.RED.getRed() + ", Green: " + Color.RED.getGreen() + ", Blue: " + Color.RED.getBlue());
        System.out.println("GREEN - Red: " + Color.GREEN.getRed() + ", Green: " + Color.GREEN.getGreen() + ", Blue: " + Color.GREEN.getBlue());
        System.out.println("BLUE - Red: " + Color.BLUE.getRed() + ", Green: " + Color.BLUE.getGreen() + ", Blue: " + Color.BLUE.getBlue());
        System.out.println("YELLOW - Red: " + Color.YELLOW.getRed() + ", Green: " + Color.YELLOW.getGreen() + ", Blue: " + Color.YELLOW.getBlue());
        System.out.println("MAGENTA - Red: " + Color.MAGENTA.getRed() + ", Green: " + Color.MAGENTA.getGreen() + ", Blue: " + Color.MAGENTA.getBlue());
        System.out.println("CYAN - Red: " + Color.CYAN.getRed() + ", Green: " + Color.CYAN.getGreen() + ", Blue: " + Color.CYAN.getBlue());


    }
}
