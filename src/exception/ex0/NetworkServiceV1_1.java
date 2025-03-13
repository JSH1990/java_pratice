package exception.ex0;

/*
복잡한 NewworkClient 사용 로직을 처리한다.
NewworkClient를 생성하고, 이때 접속할 외부 서버 주소도 함께 전달한다.
 */
public class NetworkServiceV1_1 {
    public void sendMessage(String data){
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
