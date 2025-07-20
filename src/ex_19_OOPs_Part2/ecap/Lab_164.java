package ex_19_OOPs_Part2.ecap;

public class Lab_164 {

    public static void main(String[] args) {
        VWOLoing vwoLogin = new VWOLoing("admin","Pass@1230");
        System.out.println(vwoLogin.Password);
        vwoLogin.Password = "123";
        System.out.println(vwoLogin.Password);

        Goodvwologin vwoLogin1 = new Goodvwologin("admin","Pass@123");
      //  System.out.println(vwoLogin1.password); // error --> private
        System.out.println(vwoLogin1.getUsername());
        System.out.println(vwoLogin1.getPassword());
        vwoLogin1.setUsername("Newadmin");
        System.out.println(vwoLogin1.getUsername());
    //    vwoLogin1.setPassword("new@123",false);
        vwoLogin1.setPassword("new@123",true);
        System.out.println(vwoLogin1.getPassword());
    }
}
    class VWOLoing {
        String username;
        String Password;

        public VWOLoing(String password, String username) {
            Password = password;
            this.username = username;
        }
    }

    class Goodvwologin {
        private String username;
        private String password;

        public Goodvwologin(String username, String password) {
            this.username = username;
            this.password = password;
        }
        // if we want to allow get and set username in other class then user getter and setter method
        // Right click > generate > getter and setter

        // getter
        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

        //setter
        public void setUsername(String username) {
            this.username = username;
        }

        public void setPassword(String password, boolean isadmin) {
            if (isadmin) {
                this.password = password;
            } else {
                System.out.println("not admin ,you can not changed pass");
            }
        }
    }
