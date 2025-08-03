
package ex_06;

public class Mars {
    private int size;

    public Mars() {}

    public Mars(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static void main(String[] args) {
        Mars smallMars = new Mars(100);
        Mars largeMars = new Mars(200);
        System.out.println("Large Mars size: " + largeMars.getSize());
    }
}
