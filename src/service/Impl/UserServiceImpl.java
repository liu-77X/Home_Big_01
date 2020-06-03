package service.Impl;

import dao.Impl.UserDaoImpl;
import dao.UserDao;
import entity.Artical;
import entity.Guangbo;
import entity.User;
import service.UserService;

import java.util.List;

/**
 * @outhet shkstart
 * @2020/5/9-23:11
 */
public class UserServiceImpl implements UserService {
    @Override
    public List<User> selectUsers() {
        // TODO 从数据库获取内容进行数据组织
        UserDao userDao = new UserDaoImpl();
        List<User> users = userDao.selectUsers();
        return users;
    }

    @Override
    public List<Artical> selectAllArtical(int userid) {
        UserDao userDao = new UserDaoImpl();
        List<Artical> articals = userDao.selectAllArtical(userid);
        return articals;
    }

    @Override
    public List<Guangbo> selectAllGuangbo(int userid) {
        UserDao userDao = new UserDaoImpl();
        List<Guangbo> guangbos=userDao.selectAllGuangbo(userid);
        return guangbos;
    }

    @Override
    public boolean addUser(User user) {
        UserDao userDao = new UserDaoImpl();
        return  userDao.addUser(user);
    }

    @Override
    public boolean deleteUser(int userId) {
        UserDao userDao = new UserDaoImpl();
        return  userDao.deleteUser(userId);
    }

    @Override
    public User selectUserId(int userId) {
        UserDao userDao = new UserDaoImpl();
        User user =  userDao.selectUserId(userId);
        return user;
    }

    @Override
    public boolean updateUser(User user) {
        UserDao userDao = new UserDaoImpl();
        return  userDao.updateUser(user);
    }
}
