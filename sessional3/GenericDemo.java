package sessional3;

class DataHolder<T> {
    private T value;

    public DataHolder(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

public class GenericDemo {
    public static void main(String[] args) {
        DataHolder<Integer> obj1 = new DataHolder<>(100);
        DataHolder<String> obj2 = new DataHolder<>("Java Generics");
        DataHolder<Double> obj3 = new DataHolder<>(99.99);

        System.out.println("Integer value: " + obj1.getValue());
        System.out.println("String value: " + obj2.getValue());
        System.out.println("Double value: " + obj3.getValue());
    }
}

