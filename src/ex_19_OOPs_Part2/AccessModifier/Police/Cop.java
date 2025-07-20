package ex_19_OOPs_Part2.AccessModifier.Police;

public class Cop {

    private int gun;
     String icard;

    public Cop(int gun){
        this.gun = gun;
    }
    public Cop(String icard){
        this.icard = icard;
    }
//    public  = everyone can access
//    private = only within a clas
//    protected everyone can allow with this keyword within a 'PACKAGE'(All classes of current pacakge)
    protected void can_i_shoot(){
        System.out.println("Yes, you can shoot");
    }

    private void defaultFunction(){

    }

}
