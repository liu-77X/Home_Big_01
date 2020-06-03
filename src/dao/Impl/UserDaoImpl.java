package dao.Impl;

import dao.UserDao;
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
 * @2020/5/9-23:01
 */
public class UserDaoImpl implements UserDao {
    @Override
    public List<User> selectUsers() {
        Connection conn = DBUtil.getConn();
        String sql = "select * from user";

        PreparedStatement ps = null;
        ResultSet rs = null;

        List<User> users = new ArrayList<User>();
        try {
            ps = conn.prepareStatement(sql);
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

    @Override
    public List<Artical> selectAllArtical(int userid) {
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
    public List<Guangbo> selectAllGuangbo(int userid) {
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
    @Override
    public boolean addUser(User user) {
        Connection conn = DBUtil.getConn();
        String sql = "insert into user (userid,username,userpassword,zhuangtai,artical_number,guangbo_number,fans_number,black_number_table) values (?,?,?,?,?,?,?,?)";
        PreparedStatement ps = null;
        int count = 0;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, user.getUserid());
            ps.setString(2, user.getUsername());
            ps.setString(3, user.getUserpassword());
            ps.setInt(4, user.getZhuangtai());
            ps.setInt(5, user.getArtical_number());
            ps.setInt(6, user.getGuangbo_number());
            ps.setInt(7, user.getFans_number());
            ps.setString(8, user.getBlack_number_table());
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
    public boolean deleteUser(int userId) {
        Connection conn = DBUtil.getConn();
        String sql = "delete from user where userid = ?";
        PreparedStatement ps = null;
        int count = 0;
        try {
            ps = conn.prepareStatement(sql);

            ps.setInt(1, userId);
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
    public User selectUserId(int userId) {
        Connection conn = DBUtil.getConn();
        String sql = "select * from user where userid = ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        User user = new User();

        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, userId);
            rs = ps.executeQuery();
            if(rs.next()){

                user.setUserid(rs.getInt(1));
                user.setUsername(rs.getString(2));
                user.setZhuangtai(rs.getInt(3));
                user.setArtical_number(rs.getInt(4));
                user.setGuangbo_number(rs.getInt(5));
                user.setFans_number(rs.getInt(6));
                user.setBlack_number_table(rs.getString(7));

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConn(conn, ps, null);
        }
        return user;
    }

    @Override
    public boolean updateUser(User user) {
        Connection conn = DBUtil.getConn();
        String sql = "update  user  set username =  ?,zhuangtai = ?,artical_number = ?,guangbo_number = ?,fans_number=?,black_number_table=?  where userid =?" ;
        PreparedStatement ps = null;
        int count = 0;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setInt(2, user.getZhuangtai());
            ps.setInt(3, user.getArtical_number());
            ps.setInt(4, user.getGuangbo_number());
            ps.setInt(5, user.getFans_number());
            ps.setString(6, user.getBlack_number_table());
            ps.setInt(7, user.getUserid());
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
}
