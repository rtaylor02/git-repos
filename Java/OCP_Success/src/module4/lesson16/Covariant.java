package module4.lesson16;

import java.time.LocalDate;

public class Covariant {
    public static void main(String... args) {
        String[] sa = new String[]{"Hello","","",""};
        addArray(sa);
    }

    public static void addArray(Object[] obj) {
        obj[obj.length - 1] = LocalDate.now();

    }
}
