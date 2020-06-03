package entity;

/**
 * @outhet shkstart
 * @2020/5/7-9:29
 */
public class Guangbo {
    private int gb_id;
    private int userid;
    private String username;
    private String articalname;
//    private Artical artical;
//    private User user;
    private int timelong;
    private int liulan_number;
    private int pingfen;

    public int getGb_id() {
        return gb_id;
    }

    public void setGb_id(int gb_id) {
        this.gb_id = gb_id;
    }

//    public Artical getArtical() {
//        return artical;
//    }
//
//    public void setArtical(Artical artical) {
//        this.artical = artical;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }

    public int getTimelong() {
        return timelong;
    }

    public void setTimelong(int timelong) {
        this.timelong = timelong;
    }

    public int getLiulan_number() {
        return liulan_number;
    }

    public void setLiulan_number(int liulan_number) {
        this.liulan_number = liulan_number;
    }

    public int getPingfen() {
        return pingfen;
    }

    public void setPingfen(int pingfen) {
        this.pingfen = pingfen;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getArticalname() {
        return articalname;
    }

    public void setArticalname(String articalname) {
        this.articalname = articalname;
    }

    public Guangbo(int gb_id, int userid, String username, String articalname, int timelong, int liulan_number, int pingfen) {
        this.gb_id = gb_id;
        this.userid = userid;
        this.username = username;
        this.articalname = articalname;
        this.timelong = timelong;
        this.liulan_number = liulan_number;
        this.pingfen = pingfen;
    }

    @Override
    public String toString() {
        return "Guangbo{" +
                "gb_id=" + gb_id +
                ", userid=" + userid +
                ", username='" + username + '\'' +
                ", articalname='" + articalname + '\'' +
                ", timelong=" + timelong +
                ", liulan_number=" + liulan_number +
                ", pingfen=" + pingfen +
                '}';
    }

    public Guangbo(){}

}
