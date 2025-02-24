package poly.ex1;

public class PayMain1 {
    public static void main(String[] args) {
        PayService payService = new PayService();

        String payOption1 ="kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1);
    }
}
