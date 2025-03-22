import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) {
        Test t = new Test(10, "Hello");
        Class<?> c = t.getClass();


        Field[] fields = c.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f.getName());
        }
        try{
            fields[0].setAccessible(true);
            fields[0].set(t, 20);
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
        t.show();

        try{
            Method m = c.getMethod("show");
            m.invoke(t);
        }
        catch (NoSuchMethodException e) {
            System.out.println(e.getMessage());
        } catch (InvocationTargetException e) {
            System.out.println(e.getMessage());
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }

    }

}