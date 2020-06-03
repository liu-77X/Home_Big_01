package service.Impl;

import dao.ArticalDao;
import dao.Impl.ArticalDaoImpl;
import entity.Artical;
import entity.User;
import service.ArticalService;

import java.util.List;

/**
 * @outhet shkstart
 * @2020/5/10-15:23
 */
public class ArticalServiceImpl implements ArticalService {
    @Override
    public List<Artical> selectArticals() {
        // TODO 从数据库获取内容进行数据组织
        ArticalDao articalDao = new ArticalDaoImpl();
        List<Artical> articals = articalDao.selectArticals();
        return articals;
    }

    @Override
    public List<User> detailUser(int articalid) {
        ArticalDao articalDao = new ArticalDaoImpl();
        List<User> users=articalDao.detailUser(articalid);
        return users;
    }

    @Override
    public boolean addArtical(Artical artical) {
        ArticalDao articalDao = new ArticalDaoImpl();
        return  articalDao.addArtical(artical);
    }

    @Override
    public boolean deleteArtical(int articalId) {
        ArticalDao articalDao = new ArticalDaoImpl();
        return  articalDao.deleteArtical(articalId);
    }

    @Override
    public Artical selectArticalId(int articalId) {
        ArticalDao articalDao = new ArticalDaoImpl();
        Artical artical =  articalDao.selectArticalId(articalId);
        return artical;
    }

    @Override
    public boolean updateArtical(Artical artical) {
        ArticalDao articalDao = new ArticalDaoImpl();
        return  articalDao.updateArtical(artical);
    }
}
