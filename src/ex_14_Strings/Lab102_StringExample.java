package ex_14_Strings;

public interface Lab102_StringExample {
    public static void main(String[] args) {
        String s = "Sachin".substring(2);
        System.out.println(s);

        String s1 = "Sachin".substring(1,3);
        System.out.println(s1);

        char [] arr = "sachin".toCharArray();
        System.out.println(arr);// ['s', 'a', 'c', 'h', 'i', 'n']

        String st = "  Sachin  ".trim();
        System.out.println(st);

        boolean bl = "  ".isBlank();
        System.out.println(bl);

        String rp = "->Hey Sachin\n".repeat(2);
        System.out.println(rp);

        boolean eq = "Sachin".equalsIgnoreCase("sachin");
        System.out.println(eq);

        String s15 = String.format("%s = %d", "age", 25);
//                %s	Strings	        "Sachin"
//                %d	Integers	    25
//                %f	Floating-point	12.34
//                %b	Boolean	        true/false
        System.out.println(s15);

        long count = "a\nb\nc\nd\n".lines().count();
        System.out.println(count);
    }
    }

