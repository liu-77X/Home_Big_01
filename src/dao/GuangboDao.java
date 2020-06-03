package dao;

import entity.Guangbo;
import entity.User;

import java.util.List;

/**
 * @outhet shkstart
 * @2020/5/9-23:00
 */
public interface GuangboDao {
    public List<Guangbo> selectGuangbos();
    public boolean addGuangbo(Guangbo guangbo);
    public boolean deleteGuangbo(int guangboId);
    public Guangbo selectGuangboId(int guangboId);
    public boolean updateGuangbo(Guangbo guangbo);
    public List<User> detailUser(int gb_id);
}
