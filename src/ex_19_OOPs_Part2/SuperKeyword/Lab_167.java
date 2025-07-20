package ex_19_OOPs_Part2.SuperKeyword;

public class Lab_167 {

}

class father{

    father(){
        System.out.println("DC father");
    }

    int gold = 10;

    void home(){
        System.out.println("hello f");
    }
}

class son extends father{
    son(){
        super();
    }
    void bike(){}

    void newhome (){
        super.home();
        System.out.println(super.gold);
        this.bike();
    }
}
