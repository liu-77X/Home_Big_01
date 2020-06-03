package dao;

import entity.Artical;
import entity.Guangbo;
import entity.User;

import java.util.List;

/**
 * @outhet shkstart
 * @2020/5/13-16:03
 */
public interface UserSomeDao {
    public List<Artical> selectArticals(int userid);
    public List<Guangbo> selectGuangbos(int userid);
}
