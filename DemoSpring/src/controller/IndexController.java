package controller;

import org.springframework.stereotype.*;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("index")
public class IndexController {

	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap) {

		return "index";
	}

}
