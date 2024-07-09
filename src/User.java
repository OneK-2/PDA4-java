public class User {
    private static Long idx = 0L;
    private Long pk;
    private String userId;
    private String password;
    private String name;
    private boolean isLogin;

    public User() {
        idx++;
        pk = idx;
        userId = "";
        name = "";
        password = "";
        isLogin = false;
    }

    public String getName() {
        return name;
    }

    public Long getPk() {
        return pk;
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public boolean isLogin() {
        return isLogin;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLogin(boolean login) {
        isLogin = login;
    }

    public void setName(String name) {
        this.name = name;
    }
}
