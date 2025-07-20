package ex_19_OOPs_Part2.SuperKeyword;

public class Lab_166 {

    class BaseClass{
        private String browser;

        public BaseClass(String browser) {
            this.browser = browser;
        }

        public String getBrowser() {
            return browser;
        }

        public void setBrowser(String browser, boolean isAdmin) {
          if (isAdmin){
            this.browser = browser;
        } else {
              System.out.println("Only admin can change the browser");
          }
    }

        void OpenBrowser(){
        System.out.println("Browser is opening ");
    }

        void OpenBrowser (String BrowserName){
        System.out.println("Open Browser!! -> " + BrowserName);
    }
    
        void CloseBrowser(){
        System.out.println("Close Browser!!");
    }

        void bhk3 (){}

        }
    class TestCase1 extends BaseClass{

        public void TC(){}

        public TestCase1(String browser){
            super(browser);
            super.OpenBrowser();
            super.OpenBrowser("Chrome");
            super.CloseBrowser();
            super.bhk3();

            this.TC();
        }
    }
}
