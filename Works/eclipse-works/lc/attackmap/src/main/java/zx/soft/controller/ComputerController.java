package zx.soft.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import zx.soft.model.Computer;
import zx.soft.service.ComGetDataService;

@Controller
public class ComputerController {

	@Inject
	private ComGetDataService comGetDataService;
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String showHomePage() {
		return "index";
	}
	
 	@RequestMapping(value="/computer", method = RequestMethod.GET)
	public String getComputerJSON(HttpServletRequest request, HttpServletResponse response, Model model) {
		List<Computer> computers = comGetDataService.getData();
	//	model.addAllAttributes(computers);
		model.addAttribute("computers", computers);
		model.addAttribute("test", "test String"); 
		return "test";
	}
}

