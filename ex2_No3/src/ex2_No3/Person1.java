package ex2_No3;

public class Person1 implements MyObserver{
    public void update(Source o) {
        System.out.println(
            "live result: " +
                ((Headquater)o).getSomeData()
        );
    }
}
