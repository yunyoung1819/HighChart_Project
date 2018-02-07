package com.study.young;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "highchart")
public class chartController {

	public chartController(){
	
	}
	
	//Chart Main Page
	@RequestMapping("/chartMain.do")
	public String ChartMain(Model model, HttpServletRequest request){
		
		return "/chart/highChart_3D_Column";
	}
}
