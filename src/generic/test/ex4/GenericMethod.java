package generic.test.ex4;

public class GenericMethod {

    public static Object objectMethod(Object obj){
        return obj;
    }

    public static <T> T genericMethod(T t){
        return t;
    }
}
