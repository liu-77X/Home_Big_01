package entity;

/**
 * @outhet shkstart
 * @2020/5/7-9:29
 */
public class Artical {
    private int articalid;
    private String articalname;
    private int word_number;
    private String leibie;
    private int liulan_number;
    private int pingfen;
//    private User user;
//    private String username=user.getUsername();
//    private int userid=user.getUserid();
    private int userid;
    private String username;
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

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }

    public int getArticalid() {
        return articalid;
    }

    public void setArticalid(int articalid) {
        this.articalid = articalid;
    }

    public String getArticalname() {
        return articalname;
    }

    public void setArticalname(String articalname) {
        this.articalname = articalname;
    }

    public int getWord_number() {
        return word_number;
    }

    public void setWord_number(int word_number) {
        this.word_number = word_number;
    }

    public String getLeibie() {
        return leibie;
    }

    public void setLeibie(String leibie) {
        this.leibie = leibie;
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

    @Override
    public String toString() {
        return "Artical{" +
                "articalid=" + articalid +
                ", articalname='" + articalname + '\'' +
                ", word_number=" + word_number +
                ", leibie='" + leibie + '\'' +
                ", liulan_number=" + liulan_number +
                ", pingfen=" + pingfen +
//                ", user=" + user +
                ", username='" + username + '\'' +
                ", userid=" + userid +
                '}';
    }

    public Artical(int articalid, String articalname, int word_number, String leibie, int liulan_number, int pingfen, String username, int userid) {
        this.articalid = articalid;
        this.articalname = articalname;
        this.word_number = word_number;
        this.leibie = leibie;
        this.liulan_number = liulan_number;
        this.pingfen = pingfen;
        this.username = username;
        this.userid = userid;
    }

    public Artical() {}

}
