package exception.ex0;

import java.util.Scanner;

public class MainV1 {
    public static void main(String[] args) {
        NetworkServiceV1_2 networkService = new NetworkServiceV1_2();

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.printf("전송할 문자: ");
            String input = scanner.nextLine();
            if(input.equals("exiht")){
                break;
            }

            networkService.sendMessage(input);
            System.out.println();
        }

        System.out.println("프로그램을 정상 종료합니다.");
    }
}
