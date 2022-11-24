package authentication;

public class Door {
    private int width;
    private int height;
    private boolean open;

    public void openDoor() {
        this.open = true;
        System.out.println("Opening door");
    }

    public void closeDoor() {
        this.open = false;
        System.out.println("Closing door");
    }

    public void printOpen() {
        System.out.println("The door is open: " + this.open + ".");
    }

    public int calculateSurface() {
        int surface = width * height;
        return surface;
    }

    public Door(int width, int height, boolean open){
        this.width = width;
        this.height = height;
        this.open = open;
    }
}
