package poly.ex1;

public class NaverPay implements Pay{
    @Override
    public boolean pay(int amount) {
        System.out.println("네이버 페이와 연결");
        System.out.println(amount + "원 결제를 시도합니다.");
        return true;
    }
}
