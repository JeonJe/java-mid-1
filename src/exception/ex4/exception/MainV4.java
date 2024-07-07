package exception.ex4.exception;




import exception.ex3.exception.NetworkServiceV3_2;

import java.util.Scanner;

public class MainV4 {
    public static void main(String[] args) {
//        NetworkServiceV1_2 networkService = new NetworkServiceV1_2();
//        NetworkServiceV2_2 networkService = new NetworkServiceV2_2();
//        NetworkServiceV2_3 networkService = new NetworkServiceV2_3();
//        NetworkServiceV3_1 networkService = new NetworkServiceV3_1();
//        NetworkServiceV3_2 networkService = new NetworkServiceV3_2();
        NetworkServiceV4 networkService = new NetworkServiceV4();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("전송할 문자 : ");
            String input = scanner.nextLine();
            if(input.equals("exit")) {
                break;
            };
            try {
                networkService.sendMessage(input);
            } catch (Exception e){
                exceptionHandler(e);
            }
            System.out.println();

        }
        System.out.println("프로그램 정상 종료 ");

    }

    private static void exceptionHandler(Exception e) {
        System.out.println("사용자 메시지: 죄송합니다. 알 수 없는 문제가 발생했습니다.");
        System.out.println("디버그 메시지");
        e.printStackTrace(System.out);
    }
}