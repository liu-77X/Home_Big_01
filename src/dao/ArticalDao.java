package dao;

import entity.Artical;
import entity.User;

import java.util.List;

/**
 * @outhet shkstart
 * @2020/5/9-23:00
 */
public interface ArticalDao {
    public List<Artical> selectArticals();
    public List<User> detailUser(int articalid);
    public boolean addArtical(Artical artical);
    public boolean deleteArtical(int articalId);
    public Artical selectArticalId(int articalId);
    public boolean updateArtical(Artical artical);
}
