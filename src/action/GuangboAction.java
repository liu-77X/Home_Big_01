package action;

import com.opensymphony.xwork2.ActionSupport;
import entity.Guangbo;
import entity.User;
import org.apache.struts2.ServletActionContext;
import service.ArticalService;
import service.GuangboService;
import service.Impl.ArticalServiceImpl;
import service.Impl.GuangboServiceImpl;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @outhet shkstart
 * @2020/5/12-22:57
 */
public class GuangboAction extends ActionSupport {
    private Guangbo guangbo;

    public Guangbo getGuangbo() {
        return guangbo;
    }

    public void setGuangbo(Guangbo guangbo) {
        this.guangbo = guangbo;
    }
    public String guangboList(){
        GuangboService guangboService = new GuangboServiceImpl();
        List<Guangbo> guangbos = guangboService.selectGuangbos();

        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("guangbos", guangbos);
        return "success";
    }
    public String toAddGuangbo() {
        return "success";
    }

    public String addGuangbo() {
        GuangboService guangboService = new GuangboServiceImpl();
        System.out.println("111");
        guangboService.addGuangbo(guangbo);
        return "success";
    }

    public String delGuangbo(){
        GuangboService guangboService = new GuangboServiceImpl();
        guangboService.deleteGuangbo(guangbo.getGb_id());
        return "success";
    }
    public String selectGuangboId(){
        GuangboService guangboService = new GuangboServiceImpl();
        Guangbo guangbosId = guangboService.selectGuangboId(guangbo.getGb_id());
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("guangbosId", guangbosId);
        return "success";
    }
    public String updateGuangbo(){
        GuangboService guangboService = new GuangboServiceImpl();
        guangboService.updateGuangbo(guangbo);
        return "success";

    }
    public String detailUser(){
        GuangboService guangboService = new GuangboServiceImpl();
        List<User> user=guangboService.detailUser(guangbo.getGb_id());
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("users", user);
        System.out.println("user:"+user);
        return "success";
    }
}
