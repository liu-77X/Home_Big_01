package dao.Impl;

import dao.UserSomeDao;
import entity.Artical;
import entity.Guangbo;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @outhet shkstart
 * @2020/5/13-16:05
 */
public class UserSomeDaoImpl implements UserSomeDao {
    @Override
    public List<Artical> selectArticals(int userid) {
        // TODO 这个地方和数据库真正打交道
        Connection conn = DBUtil.getConn();
        String sql = "select * from artical where userid=?";

        PreparedStatement ps = null;
        ResultSet rs = null;

        List<Artical> articals = new ArrayList<Artical>();
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, userid);
            rs = ps.executeQuery();
            while(rs.next()){
                Artical artical = new Artical();
                artical.setArticalid(rs.getInt(1));
                artical.setArticalname(rs.getString(2));
                artical.setWord_number(rs.getInt(3));
                artical.setLeibie(rs.getString(4));
                artical.setLiulan_number(rs.getInt(5));
                artical.setPingfen(rs.getInt(6));
                artical.setUserid(rs.getInt(7));
                artical.setUsername(rs.getString(8));
                articals.add(artical);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            DBUtil.closeConn(conn, ps, rs);
        }

        return articals;
    }

    @Override
    public List<Guangbo> selectGuangbos(int userid) {
        // TODO 这个地方和数据库真正打交道
        Connection conn = DBUtil.getConn();
        String sql = "select * from guangbo where userid=?";

        PreparedStatement ps = null;
        ResultSet rs = null;

        List<Guangbo> guangbos = new ArrayList<Guangbo>();
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, userid);
            rs = ps.executeQuery();
            while(rs.next()){
                Guangbo guangbo = new Guangbo();
                guangbo.setGb_id(rs.getInt(1));
                guangbo.setArticalname(rs.getString(2));
                guangbo.setUserid(rs.getInt(3));
                guangbo.setUsername(rs.getString(4));
                guangbo.setTimelong(rs.getInt(5));
                guangbo.setLiulan_number(rs.getInt(6));
                guangbo.setPingfen(rs.getInt(7));
                guangbos.add(guangbo);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            DBUtil.closeConn(conn, ps, rs);
        }

        return guangbos;
    }
}
