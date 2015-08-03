package actions;

import com.opensymphony.xwork2.Action;

/**
 * Created by aignat on 8/3/2015.
 */
public class HelloAction implements Action {

    String greeting;

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    @Override
    public String execute() throws Exception {

        greeting = "Hello Struts 2";

        return "success";
    }
}
