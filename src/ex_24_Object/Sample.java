package ex_24_Object;

public class Sample extends Object{

    @Override
    public String toString() {
        System.out.println("this to string is coming from object class");
        return null;
    }

    @Override
    public int hashCode() {
        System.out.println("this hashcode is coming from object class");
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("this equals is coming from object class");
        return true;
    }
}
