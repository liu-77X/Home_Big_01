package dao.Impl;

import dao.GuangboDao;
import entity.Artical;
import entity.Guangbo;
import entity.User;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @outhet shkstart
 * @2020/5/9-23:03
 */
public class GuangboDaoImpl implements GuangboDao {
    @Override
    public List<Guangbo> selectGuangbos() {
        // TODO 这个地方和数据库真正打交道
        Connection conn = DBUtil.getConn();
        String sql = "select * from guangbo";

        PreparedStatement ps = null;
        ResultSet rs = null;

        List<Guangbo> guangbos = new ArrayList<Guangbo>();
        try {
            ps = conn.prepareStatement(sql);
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

    @Override
    public boolean addGuangbo(Guangbo guangbo) {
        Connection conn = DBUtil.getConn();
        String sql = "insert into guangbo (articalname,userid,username,timelong,liulan_number,pingfen) values (?,?,?,?,?,?)";
        PreparedStatement ps = null;
        int count = 0;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, guangbo.getArticalname());
            ps.setInt(2, guangbo.getUserid());
            ps.setString(3, guangbo.getUsername());
            ps.setInt(4, guangbo.getTimelong());
            ps.setInt(5, guangbo.getLiulan_number());
            ps.setInt(6, guangbo.getPingfen());
            count = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConn(conn, ps, null);
        }

        if (count > 0)
            return true;
        else
            return false;
    }

    @Override
    public boolean deleteGuangbo(int guangboId) {
        Connection conn = DBUtil.getConn();
        String sql = "delete from guangbo where gb_id = ?";
        PreparedStatement ps = null;
        int count = 0;
        try {
            ps = conn.prepareStatement(sql);

            ps.setInt(1, guangboId);
            count = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConn(conn, ps, null);
        }

        if (count > 0)
            return true;
        else
            return false;
    }

    @Override
    public Guangbo selectGuangboId(int guangboId) {
        Connection conn = DBUtil.getConn();
        String sql = "select * from guangbo where gb_id = ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        Guangbo guangbo = new Guangbo();

        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, guangboId);
            rs = ps.executeQuery();
            if(rs.next()){

                guangbo.setGb_id(rs.getInt(1));
                guangbo.setArticalname(rs.getString(2));
                guangbo.setUserid(rs.getInt(3));
                guangbo.setUsername(rs.getString(4));
                guangbo.setTimelong(rs.getInt(5));
                guangbo.setLiulan_number(rs.getInt(6));
                guangbo.setPingfen(rs.getInt(7));

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConn(conn, ps, null);
        }
        return guangbo;
    }

    @Override
    public boolean updateGuangbo(Guangbo guangbo) {
        Connection conn = DBUtil.getConn();
        String sql = "update  guangbo  set articalname =  ?,userid = ?,username = ?,timelong = ?,liulan_number = ?,pingfen = ? where gb_id =?" ;
        PreparedStatement ps = null;
        int count = 0;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, guangbo.getArticalname());
            ps.setInt(2, guangbo.getUserid());
            ps.setString(3, guangbo.getUsername());
            ps.setInt(4, guangbo.getTimelong());
            ps.setInt(5, guangbo.getLiulan_number());
            ps.setInt(6, guangbo.getPingfen());
            ps.setInt(7, guangbo.getGb_id());
            count = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConn(conn, ps, null);
        }
        if (count > 0)
            return true;
        else
            return false;
    }

    @Override
    public List<User> detailUser(int gb_id) {
        Connection conn = DBUtil.getConn();
        String sql1 = "select * from guangbo where gb_id=?";
        String sql = "select * from user where userid=?";

        PreparedStatement ps1 = null;
        ResultSet rs1 = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Guangbo guangbo = new Guangbo();
        List<User> users = new ArrayList<User>();
        try {
            ps1 = conn.prepareStatement(sql1);
            ps1.setInt(1,gb_id);
            rs1 = ps1.executeQuery();
            if(rs1.next()){
                guangbo.setGb_id(rs1.getInt(1));
                guangbo.setArticalname(rs1.getString(2));
                guangbo.setUserid(rs1.getInt(3));
                guangbo.setUsername(rs1.getString(4));
                guangbo.setTimelong(rs1.getInt(5));
                guangbo.setLiulan_number(rs1.getInt(6));
                guangbo.setPingfen(rs1.getInt(7));
            }
            System.out.println("guangbo"+guangbo);
            int userid=guangbo.getUserid();
            System.out.println("userid:"+userid);
            ps = conn.prepareStatement(sql);
            ps.setInt(1,userid);
            rs = ps.executeQuery();
            while(rs.next()){
                User user = new User();
                user.setUserid(rs.getInt(1));
                user.setUsername(rs.getString(2));
                user.setZhuangtai(rs.getInt(4));
                user.setArtical_number(rs.getInt(5));
                user.setGuangbo_number(rs.getInt(6));
                user.setFans_number(rs.getInt(7));
                user.setBlack_number_table(rs.getString(8));
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            DBUtil.closeConn(conn, ps, rs);
        }

        return users;
    }
}
