package exception.ex0;

/*
복잡한 NewworkClient 사용 로직을 처리한다.
NewworkClient를 생성하고, 이때 접속할 외부 서버 주소도 함께 전달한다.
 */
public class NetworkServiceV1_2 {
    public void sendMessage(String data){
        NetworkClientV1 client = new NetworkClientV1("http://example.com");
        client.initError(data);

        String connectResult = client.connect();
        if(isError(connectResult)){
            System.out.println("[네트워크 오류 발생]: " + connectResult);
            return;
        }

        String sendResult = client.send(data);
        if(isError(sendResult)){
            System.out.println("[네트워크 오류 발생]:" + sendResult);
            return;
        }
        client.disconnect();
    }

    private static boolean isError(String resultCode){
        return !resultCode.equals("success");
    }
}
