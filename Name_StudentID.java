import java.util.Scanner;

public class Name_StudentID {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요: ");
        String a = sc.next();
        System.out.print("학번을 입력하세요: ");
        String b = sc.next();
        System.out.print("학과를 입력하세요: ");
        String c = sc.next();
        System.out.print("대학교를 입력하세요: ");
        String d = sc.next();

        System.out.println("\n<출력>\n이름: " + a + "\n학번: " + b + "\n학과: " + c + "\n대학교: " + d);

        sc.close();
    }

}
