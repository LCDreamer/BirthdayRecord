package action;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dao.UserInfoDao;
import entity.UserInfo;
import json.JackJsonUtils;
import json.ListObject;
import json.ResponseUtils;
import json.UserInfoCode;

@Controller
public class UserInfoActionServlet {
	private UserInfoDao userInfoDao = new UserInfoDao();
    
    public UserInfoActionServlet() {
        super();
        
        // TODO Auto-generated constructor stub
    }
	@RequestMapping("/getAllUserInfo")
	public void getAllUserInfo(HttpServletRequest request, HttpServletResponse response) {
		
		
		List<UserInfo> list = userInfoDao.findAll();
		ListObject listObject = new ListObject();
		listObject.setItems(list);
		listObject.setCode(UserInfoCode.CODE_SUCCESS);
		listObject.setMsg("访问成功");
		ResponseUtils.renderJson(response, JackJsonUtils.toJson(listObject));
	}
	
	@RequestMapping("/getAllUserInfo.dbo")
	public ModelAndView getAllUserInfo(HttpServletRequest request, HttpServletResponse response,ModelMap modelMap) {
		List<UserInfo> list = userInfoDao.findAll();
		modelMap.addAttribute("list", list);
		return new ModelAndView("result",modelMap);
	}

}