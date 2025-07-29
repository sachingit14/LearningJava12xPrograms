package ex_24_Exceptions;

public class Bank {
    private String currency;
    private Integer amount;

    public Bank(Integer amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(Bank BankName){
        if (BankName.currency.equalsIgnoreCase("INR")){
            return BankName.amount +this.amount;
        } else {
            try {
                throw new CustomException("Currency Mismatch");
            } catch (CustomException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
 class CustomException extends Exception {
    CustomException (String msg){
        super(msg);
    }
 }
