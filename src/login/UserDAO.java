package login;

import java.util.HashMap;
import java.util.Map;

public class UserDAO { // => Repository
    private Map<Long, User> DB = new HashMap<Long, User>();

    public void save(User user) {
        DB.put(user.getPk(), user);
    }

    public User read(String userId) {
        for (User u : DB.values()) {
            if (u.getUserId().equals(userId)) {
                return u;
            }
        }
        return null;
    }

    public boolean delete(String userId) {
        for (User u : DB.values()) {
            if (u.getUserId().equals(userId)) {
                DB.remove(u.getPk());
                return true;
            }
        }
        return false;
    }
}
