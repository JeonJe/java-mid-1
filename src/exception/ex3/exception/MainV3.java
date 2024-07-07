package exception.ex3.exception;




import java.util.Scanner;

public class MainV3 {
    public static void main(String[] args) {
//        NetworkServiceV1_2 networkService = new NetworkServiceV1_2();
//        NetworkServiceV2_2 networkService = new NetworkServiceV2_2();
//        NetworkServiceV2_3 networkService = new NetworkServiceV2_3();
//        NetworkServiceV3_1 networkService = new NetworkServiceV3_1();
        NetworkServiceV3_2 networkService = new NetworkServiceV3_2();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("전송할 문자 : ");
            String input = scanner.nextLine();
            if(input.equals("exit")) {
                break;
            };
            networkService.sendMessage(input);
            System.out.println();

        }
        System.out.println("프로그램 정상 종료 ");

    }
}