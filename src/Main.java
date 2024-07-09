import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /**
         * 아래 코드를 실행했을 때, "00님 가입을 환영합니다."
         *
         */
        Scanner sc = new Scanner(System.in);
        int input = 0;
        boolean flag = false;
        User curUser = new User();
        UserService userService = new UserService();

        while (!flag) {
            System.out.println("1: 회원가입 / 2:로그인 / 3: 회원정보 수정 / 4: 탈퇴 / 0: 종료");
            System.out.print("입력: ");
            input = sc.nextInt();
            switch (input) {
                case 0:
                    flag = true;
                    System.out.println("종료");
                    break;
                case 1:
                    System.out.println("가입하실 아이디와 비밀번호, 이름을 (띄어쓰기로 구분하여) 입력하세요.");
                    System.out.print("입력: ");
                    String id = sc.next();
                    String password = sc.next();
                    String username = sc.next();
                    userService.join(id, password, username);
                    break;
                case 2:
                    System.out.println("로그인할 아이디와 비밀번호를 (띄어쓰기로 구분하여 )입력하세요");
                    System.out.print("입력 : ");
                    curUser = userService.login(sc.next(), sc.next());
                    break;
                case 3:
                    if (curUser != null && curUser.isLogin()) {
                        System.out.print("수정할 이름을 입력: ");
                        String newName = sc.next();
                        curUser = userService.updateUser(curUser.getUserId(), newName);
                        System.out.println("=== 수정완료 ===");
                        System.out.println("수정된 이름: " + curUser.getName());
                    } else {
                        System.out.println("로그인 상태가 아닙니다.");
                    }
                    break;
                case 4:
                    System.out.println("삭제할 아이디와 비밀번호를 (띄어쓰기로 구분하여 )입력하세요");
                    System.out.print("입력 : ");
                    String userId = sc.next();
                    String pw = sc.next();
                    if (userService.login(userId, pw) != null) {
                        if (userService.deleteUser(userId)) {
                            System.out.println("삭제가 되었습니다.");
                        } else {
                            System.out.println("서버 오류");
                        }
                    } else {
                        System.out.println("아이디와 비밀번호가 틀렸습니다.");
                    }
                    break;
                default:
                    System.out.println("올바른 수를 입력해주세요.");
            }
        }

    }

}