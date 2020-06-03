package interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class UserInterceptor extends AbstractInterceptor{

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        String user=(String) ActionContext.getContext().getSession().get("user");
        if (user==null||"".equals(user)) {
            return "fail";
        }
        return invocation.invoke();
    }


}