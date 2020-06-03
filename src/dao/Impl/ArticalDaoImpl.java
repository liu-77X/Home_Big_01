package dao.Impl;

import dao.ArticalDao;
import entity.Artical;
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
 * @2020/5/9-23:05
 */
public class ArticalDaoImpl implements ArticalDao {
    @Override
    public List<Artical> selectArticals() {
        // TODO 这个地方和数据库真正打交道
        Connection conn = DBUtil.getConn();
            String sql = "select * from artical";

            PreparedStatement ps = null;
            ResultSet rs = null;

            List<Artical> articals = new ArrayList<Artical>();
            try {
                ps = conn.prepareStatement(sql);
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
    public List<User> detailUser(int articalid) {
        Connection conn = DBUtil.getConn();

        String sql1 = "select * from artical where articalid=?";
        String sql = "select * from user where userid=?";

        PreparedStatement ps1 = null;
        PreparedStatement ps = null;
        ResultSet rs1 = null;
        ResultSet rs = null;
        Artical artical = new Artical();

        List<User> users = new ArrayList<User>();
        try {
            ps1 = conn.prepareStatement(sql1);
            ps1.setInt(1,articalid);
            rs1 = ps1.executeQuery();
            if(rs1.next()){
                artical.setUserid(rs1.getInt(1));
                artical.setArticalname(rs1.getString(2));
                artical.setWord_number(rs1.getInt(3));
                artical.setLeibie(rs1.getString(4));
                artical.setLiulan_number(rs1.getInt(5));
                artical.setPingfen(rs1.getInt(6));
                artical.setUserid(rs1.getInt(7));
                artical.setUsername(rs1.getString(8));

            }
            System.out.println("artical111::"+artical);
            ps = conn.prepareStatement(sql);
            int userid=artical.getUserid();
            System.out.println("userid:"+userid);
            ps.setInt(1,userid);
            rs = ps.executeQuery();
            while(rs.next()){
                User user = new User();
                user.setUserid(rs.getInt(1));
                user.setUsername(rs.getString(2));
                user.setUserpassword(rs.getString(3));
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

        System.out.println("user1:"+users);
        return users;
    }

    @Override
    public boolean addArtical(Artical artical) {
        Connection conn = DBUtil.getConn();
        String sql = "insert into artical (articalname,word_number,leibie,liulan_number,pingfen,userid,username) values (?,?,?,?,?,?,?)";
        PreparedStatement ps = null;
        int count = 0;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, artical.getArticalname());
            ps.setInt(2, artical.getWord_number());
            ps.setString(3, artical.getLeibie());
            ps.setInt(4, artical.getLiulan_number());
            ps.setInt(5, artical.getPingfen());
            ps.setInt(6, artical.getUserid());
            ps.setString(7, artical.getUsername());
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
    public boolean deleteArtical(int articalId) {
        Connection conn = DBUtil.getConn();
        String sql = "delete from artical where articalid = ?";
        PreparedStatement ps = null;
        int count = 0;
        try {
            ps = conn.prepareStatement(sql);

            ps.setInt(1, articalId);
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
    public Artical selectArticalId(int articalId) {
        Connection conn = DBUtil.getConn();
        String sql = "select * from artical where articalid = ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        Artical artical = new Artical();

        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, articalId);
            rs = ps.executeQuery();
            if(rs.next()){

                artical.setUserid(rs.getInt(1));
                artical.setArticalname(rs.getString(2));
                artical.setWord_number(rs.getInt(3));
                artical.setLeibie(rs.getString(4));
                artical.setLiulan_number(rs.getInt(5));
                artical.setPingfen(rs.getInt(6));
                artical.setUserid(rs.getInt(7));
                artical.setUsername(rs.getString(8));

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConn(conn, ps, null);
        }
        return artical;
    }

    @Override
    public boolean updateArtical(Artical artical) {
        Connection conn = DBUtil.getConn();
        String sql = "update  artical  set articalname =  ?,word_number = ?,leibie = ?,liulan_number = ?,pingfen = ?,userid  = ?,username = ? where articalid =?" ;
        PreparedStatement ps = null;
        int count = 0;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, artical.getArticalname());
            ps.setInt(2, artical.getWord_number());
            ps.setString(3, artical.getLeibie());
            ps.setInt(4, artical.getLiulan_number());
            ps.setInt(5, artical.getPingfen());
            ps.setInt(6, artical.getUserid());
            ps.setString(7, artical.getUsername());
            ps.setInt(8, artical.getArticalid());
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
