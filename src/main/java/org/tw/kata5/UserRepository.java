package org.tw.kata5;

import java.util.List;
import java.util.Optional;

/**
 * 练习5：为下列代码制作替身
 */
public class UserRepository {

    private List<User> db;

    public boolean isExistUser(String email) {
        Optional<User> existUser = db.stream().filter(
                user -> email.equals(user.getEmail())
        ).findFirst();

        return existUser.isPresent();
    }

}
