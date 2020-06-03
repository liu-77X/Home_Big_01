package service;

import entity.Guangbo;
import entity.User;

import java.util.List;

/**
 * @outhet shkstart
 * @2020/5/9-23:09
 */
public interface GuangboService {
    public List<Guangbo> selectGuangbos();
    public boolean addGuangbo(Guangbo guangbo);
    public boolean deleteGuangbo(int guangboId);
    public Guangbo selectGuangboId(int guangboId);
    public boolean updateGuangbo(Guangbo guangbo);
    public List<User> detailUser(int gb_id);
}
