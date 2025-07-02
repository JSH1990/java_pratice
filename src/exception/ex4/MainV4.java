package exception.ex4;

import java.util.Scanner;

public class MainV4 {

    public static void main(String[] args) {
        NetworkServiceV4 networkService = new NetworkServiceV4();

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.printf("전송 할 문자: ");
            String input = scanner.nextLine();
            if(input.equals("exit")){
                break;
            }

            try {
                networkService.sendMessage(input);
            }catch (Exception e){
                exceptionHandler(e);
            }
        }
    }

    private static void exceptionHandler(Exception e) {
        System.out.println("죄송합니다. 알수 없는 문제가 생겼습니다.");
        e.printStackTrace(System.out);
    }
}
