public class UserService {
    UserDAO userDAO = new UserDAO();

    public void join(String id, String password, String name) { //회원가입
        if (userDAO.read(id) != null) {
            System.out.println("동일한 id가 존재합니다.");
        } else {
            User user = new User();
            user.setUserId(id);
            user.setPassword(password);
            user.setName(name);

            userDAO.save(user);
        }
    }

    public User login(String id, String password) {
        // 1. 회원인지 확인
        try {
            User user = userDAO.read(id);
            if (user.getPassword().equals(password)) { // 비밀번호 확인
                user.setLogin(true);

                userDAO.save(user);
                System.out.println(user.getUserId() + "님 로그인 되었습니다.");
                return user;
            } else {
                System.out.println("비밀번호가 잘못 입력되었습니다.");
                return null;
            }

        } catch (NullPointerException e) {
            System.out.println("없는 회원입니다.");
        }
        return null;
    }

    public User updateUser(String id, String newName) {
        try {
            User user = userDAO.read(id);
            user.setName(newName);

            userDAO.save(user);

            return user;
        } catch (NullPointerException e) {
            System.out.println("없는 회원입니다.");
        }
        return null;
    }

    public Boolean deleteUser(String userId) {
        User user = userDAO.read(userId);
        if (user != null) {
            if (userDAO.delete(userId)) {
                return true;
            }
        }
        return false;
    }

}
