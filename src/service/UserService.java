package service;

import entity.Artical;
import entity.Guangbo;
import entity.User;

import java.util.List;

/**
 * @outhet shkstart
 * @2020/5/9-23:08
 */
public interface UserService {
    public List<User> selectUsers();
    public List<Artical> selectAllArtical(int userid);
    public List<Guangbo> selectAllGuangbo(int userid);
    public boolean addUser(User user);
    public boolean deleteUser(int userId);
    public User selectUserId(int userId);
    public boolean updateUser(User user);
}