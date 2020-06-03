package action;

import entity.Artical;
import entity.Guangbo;
import entity.User;
import org.apache.struts2.ServletActionContext;
import service.Impl.UserServiceImpl;
import service.UserService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @outhet shkstart
 * @2020/5/7-10:04
 */
public class UserAction {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public String userList(){
        UserService userService =new UserServiceImpl();
        List<User> users = userService.selectUsers();
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("users", users);
        return "success";
    }
    public String toAddUser() {
        return "success";
    }

    public String addUser() {
        UserService userService = new UserServiceImpl();
        userService.addUser(user);
        return "success";
    }
    public String delUser(){
        UserService userService = new UserServiceImpl();
        userService.deleteUser(user.getUserid());
        return "success";
    }
    public String selectUserId(){
        UserService userService = new UserServiceImpl();
        User userId = userService.selectUserId(user.getUserid());
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("userId", userId);
        return "success";
    }
    public String updateUser(){
        UserService userService = new UserServiceImpl();
        userService.updateUser(user);
        return "success";

    }
    public String selectAllArtical(){
        UserService userService = new UserServiceImpl();
        List<Artical> artical=userService.selectAllArtical(user.getUserid());
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("artical", artical);
        return "success";
    }
    public String selectAllGuangbo(){
        UserService userService = new UserServiceImpl();
        List<Guangbo> guangbo=userService.selectAllGuangbo(user.getUserid());
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("guangbo", guangbo);
        return "success";
    }


}
