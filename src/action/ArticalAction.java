package action;

import com.opensymphony.xwork2.ActionSupport;
import entity.Artical;
import entity.Guangbo;
import entity.User;
import org.apache.struts2.ServletActionContext;
import service.ArticalService;
import service.Impl.ArticalServiceImpl;
import service.Impl.UserServiceImpl;
import service.UserService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @outhet shkstart
 * @2020/5/12-18:38
 */
public class ArticalAction extends ActionSupport {
    private Artical artical;

    public Artical getArtical() {
        return artical;
    }

    public void setArtical(Artical artical) {
        this.artical = artical;
    }

    public String articalList(){
        //从数据库获取数据 进行数据准备 然后将数据传至bookList.jsp
        ArticalService articalService = new ArticalServiceImpl();
        List<Artical> articals = articalService.selectArticals();

        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("articals", articals);
        return "success";
    }
    public String toAddArtical() {
        return "success";
    }
    public String addArtical() {
        ArticalService articalService = new ArticalServiceImpl();
        articalService.addArtical(artical);
        return "success";
    }
    public String delArtical(){
        ArticalService articalService = new ArticalServiceImpl();
        articalService.deleteArtical(artical.getArticalid());
        return "success";
    }
    public String selectArticalId(){
        ArticalService articalService = new ArticalServiceImpl();
        Artical articalId = articalService.selectArticalId(artical.getArticalid());
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("articalId", articalId);
        return "success";
    }
    public String updateArtical(){
        ArticalService articalService = new ArticalServiceImpl();
        articalService.updateArtical(artical);
        return "success";

    }
    public String detailUser(){
        ArticalService articalService = new ArticalServiceImpl();
        List<User> user=articalService.detailUser(artical.getArticalid());
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("users", user);
        return "success";
    }
}
