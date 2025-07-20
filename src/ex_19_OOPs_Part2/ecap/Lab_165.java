package ex_19_OOPs_Part2.ecap;

import javax.xml.namespace.QName;

public class Lab_165 {
    public static void main(String[] args) {

        ICICIBank amit = new ICICIBank("amit", 100,"icici bank");
        System.out.println((amit.getBal()));

        boolean isCashier = true;
        amit.setBal(2000, isCashier );
        System.out.println("Your Current balance is -> "+(amit.getBal()));
        System.out.println((amit.getBank_name()));

    }
}
class ICICIBank {
    //## Encapsulation  //hide
    //- Encapsulation is a fundamental concept in object-oriented programming (OOP).
    //- Bundling of data and methods that operate on that data within a single unit.
    //- Data members should be private in nature.
    //- Methods with getter and setter only, you can access the data members / attributes.

    private String name;
    private long bal;
    public String bank_name = "ICICI Bank";

    public ICICIBank(String name, long bal, String bank_name) {
        this.name = name;
        this.bal = bal;
        this.bank_name = bank_name;
    }

    // getter
    public String getName() {
        return name;
    }

    public long getBal() {
        return bal;
    }

    public String getBank_name() {
        return bank_name;
    }
    //setter

    public void setName(String name) {
        this.name = name;
    }

    public void setBal(long bal, boolean isCashier) {
        if (isCashier) {
            this.bal = bal;
        } else {
            System.out.println("Yor are not a cahier, you cannot set a cash");
        }
    }

}