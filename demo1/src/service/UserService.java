package service;

import dao.UserDao;

/**
 * @author yuesj
 * @date 2020/6/7
 */
public class UserService {

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("service add...............");
        userDao.update();
    }
}
