package action;

import java.util.Map;

import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

    private String name;
    private String pwd;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }


    public String login(){
        if(name !=null &&!"".equals(name) && pwd !=null &&!"".equals(pwd)){
            //判断
            if(name.equals("刘雪洁")&&pwd.equals("1714010115")){

                Map<String, Object> session = ActionContext.getContext().getSession();
                session.put("user", name);
                return "success";
            }else{
                return "fail";
            }
        }else{
            return "fail";
        }
    }

}