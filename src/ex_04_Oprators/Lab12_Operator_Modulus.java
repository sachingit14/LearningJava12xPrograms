package ex_04_Oprators;

public class Lab12_Operator_Modulus {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        System.out.println(a%b); // -> // Mod -> Remainder.
        //        10 | 20 |  2 - quotient
//                  |   20 |
//                  -------
//                      0 - Remainder
//                  ----

          System.out.println(13%7);
//        // 7 | 13 | 1 - Q
//        //       7
//        // R ------ 6
//
//       11%2 -> 1 , 13%2 -> 1
//                10%2 -> 0
//                12%2 -> 0
//           Number % 2 -> R-> 1 -> odd , 0 -> even

    }
}
