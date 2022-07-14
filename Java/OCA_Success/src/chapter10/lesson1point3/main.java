package chapter10.lesson1point3;

public class main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Here There Where");
        System.out.println(sb);
        System.out.println(sb.substring(6));
        System.out.println(sb.substring(0,2));
        System.out.println(sb.charAt(6));
        System.out.println(sb.indexOf("re"));
        System.out.println(sb.indexOf("re",4));
        System.out.println(sb.lastIndexOf("re"));
        System.out.println("sb.length() = " + sb.length());

        sb.ensureCapacity(sb.length());
        while(sb.capacity() < 16384) {
            System.out.println("Capacity now: " + sb.capacity());
            sb.ensureCapacity(sb.capacity() + 1);
        }

        sb.trimToSize();
        System.out.println("Capacity now (after trimming): " + sb.capacity());
        System.out.println("=================");

        StringBuilder sb1 = new StringBuilder("0123456789");
        char[] dest = new char[6];
        for(int i = 0; i < dest.length; i++) {
            dest[i] = '+';
        }
        System.out.println(dest);
        sb1.getChars(3, 7, dest, 1);
        System.out.println("dest = " + new String(dest));
    }
}
