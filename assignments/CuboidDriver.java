class Cuboid<T extends Number> { 
    private T length;
    private T breadth;
    private T height;
    public void setLength(T length) {
        this.length = length;
    }
    public void setBreadth(T breadth) {
        this.breadth = breadth;
    }
    public void setHeight(T height) {
        this.height = height;
    }
    public T getLength() {
        return length;
    }
    public T getBreadth() {
        return breadth;
    }
    public T getHeight() {
        return height;
    }
    @Override
    public String toString() {
        return "Length: " + length + ", Breadth: " + breadth + ", Height: " + height;
    }
    public double getVolume() {
        return length.doubleValue() * breadth.doubleValue() * height.doubleValue();
    }
}
public class CuboidDriver {
    public static void main(String[] args) {
        Cuboid<Double> c1 = new Cuboid<>();
        c1.setLength(1.3);
        c1.setBreadth(2.2);
        c1.setHeight(2.0);
        System.out.println("Double Cuboid:");
        System.out.println(c1); 
        System.out.println("Volume: " + c1.getVolume());
        System.out.println();
        Cuboid<Integer> c2 = new Cuboid<>();
        c2.setLength(1);
        c2.setBreadth(2);
        c2.setHeight(3);
        System.out.println("Integer Cuboid:");
        System.out.println(c2); // calls toString()
        System.out.println("Volume: " + c2.getVolume());
    }
}
