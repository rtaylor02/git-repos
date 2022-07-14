package module4.lesson16;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>(List.of(1,2,3,4));
        //li.remove(1);
        li.remove(Integer.valueOf(1));
        System.out.println(li);
    }
}
