package service.Impl;

import dao.ArticalDao;
import dao.GuangboDao;
import dao.Impl.ArticalDaoImpl;
import dao.Impl.GuangboDaoImpl;
import entity.Guangbo;
import entity.User;
import service.GuangboService;

import java.util.List;

/**
 * @outhet shkstart
 * @2020/5/10-7:54
 */
public class GuangboServiceImpl implements GuangboService {
    @Override
    public List<Guangbo> selectGuangbos() {
        GuangboDao guangboDao=new GuangboDaoImpl();
        List<Guangbo> guangbos=guangboDao.selectGuangbos();
        return guangbos;
    }

    @Override
    public boolean addGuangbo(Guangbo guangbo) {
        GuangboDao guangboDao=new GuangboDaoImpl();
        return guangboDao.addGuangbo(guangbo);
    }

    @Override
    public boolean deleteGuangbo(int guangboId) {
        GuangboDao guangboDao=new GuangboDaoImpl();
        return guangboDao.deleteGuangbo(guangboId);
    }

    @Override
    public Guangbo selectGuangboId(int guangboId) {
        GuangboDao guangboDao=new GuangboDaoImpl();
        Guangbo guangbo=guangboDao.selectGuangboId(guangboId);
        return guangbo;
    }

    @Override
    public boolean updateGuangbo(Guangbo guangbo) {
        GuangboDao guangboDao=new GuangboDaoImpl();
        return guangboDao.updateGuangbo(guangbo);
    }

    @Override
    public List<User> detailUser(int gb_id) {
        GuangboDao guangboDao = new GuangboDaoImpl();
        List<User> users=guangboDao.detailUser(gb_id);
        return users;
    }
}
