package poly.ex1;

public class PayService {
    public void processPay(String option, int amount){
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" +
                amount);
        Pay pay = PayStore.findPay(option);
        boolean result = pay.pay(amount);

        if(result){
            System.out.println("결재 성공");
        }else {
            System.out.println("결재 실패");
        }
    }
}
