package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import po.User;
import service.UserService;


@Controller
public class UserController{
	@Autowired
	UserService userService;
	
	@RequestMapping("/hello")
	public void hello(HttpServletResponse response) throws IOException{
		response.getWriter().print("ok");
		ArrayList<User> list=userService.selectUserListbyUserid("1");
		response.getWriter().print(list.get(0));
	}
}
