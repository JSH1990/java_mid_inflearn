package generic.test.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objectMethod(i);

        Integer result = GenericMethod.<Integer>genericMethod(i);
        System.out.println(result);
        Integer integerValue = GenericMethod.<Integer>genericMethod(10);
        Double doubleValue = GenericMethod.<Double>genericMethod(20.0);
        System.out.println(doubleValue);

        Integer integerValue2 = GenericMethod.genericMethod(10);
        Double doubleValue2 = GenericMethod.genericMethod(20.0);

        System.out.println(doubleValue2);
    }
}
