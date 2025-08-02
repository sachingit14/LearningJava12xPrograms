package TEST_1;

public class Q1_primitive_default_values {
    public static void main(String[] args) {

        // Write a Java program to declare variables of all primitive data types and print their default values.

        DefualtValue obj = new DefualtValue();

        System.out.println("boolean: " + obj.boolValue);
        System.out.println("byte: " + obj.byteValue);
        System.out.println("short: " + obj.shortValue);
        System.out.println("int: " + obj.intValue);
        System.out.println("long: " + obj.longValue);
        System.out.println("float: " + obj.floatValue);
        System.out.println("double: " + obj.doubleValue);
        System.out.println("char: '" + obj.charValue + "'");
    }

}


