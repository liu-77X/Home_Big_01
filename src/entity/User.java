package entity;

/**
 * @outhet shkstart
 * @2020/5/7-9:29
 */
public class User {
    private int userid;
    private String username;
    private String userpassword;
    private int zhuangtai;
    private int artical_number;
    private int guangbo_number;
    private int fans_number;
    private String black_number_table;

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

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public int getZhuangtai() {
        return zhuangtai;
    }

    public void setZhuangtai(int zhuangtai) {
        this.zhuangtai = zhuangtai;
    }

    public int getArtical_number() {
        return artical_number;
    }

    public void setArtical_number(int artical_number) {
        this.artical_number = artical_number;
    }

    public int getGuangbo_number() {
        return guangbo_number;
    }

    public void setGuangbo_number(int guangbo_number) {
        this.guangbo_number = guangbo_number;
    }

    public int getFans_number() {
        return fans_number;
    }

    public void setFans_number(int fans_number) {
        this.fans_number = fans_number;
    }

    public String getBlack_number_table() {
        return black_number_table;
    }

    public void setBlack_number_table(String black_number_table) {
        this.black_number_table = black_number_table;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", userpassword='" + userpassword + '\'' +
                ", zhuangtai=" + zhuangtai +
                ", artical_number=" + artical_number +
                ", guangbo_number=" + guangbo_number +
                ", fans_number=" + fans_number +
                ", black_number_table='" + black_number_table + '\'' +
                '}';
    }

    public User(int userid, String username, String userpassword, int zhuangtai, int artical_number, int guangbo_number, int fans_number, String black_number_table) {
        this.userid = userid;
        this.username = username;
        this.userpassword = userpassword;
        this.zhuangtai = zhuangtai;
        this.artical_number = artical_number;
        this.guangbo_number = guangbo_number;
        this.fans_number = fans_number;
        this.black_number_table = black_number_table;
    }
    public User(){}
}
