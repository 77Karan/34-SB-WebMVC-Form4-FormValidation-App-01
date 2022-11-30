package in.ashokit.binding.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.binding.User;

@Controller
public class UserController 
{
	@GetMapping("/loadform")
	public String loadForm(Model model)
	{
		User userObj = new User();
		model.addAttribute("user",userObj);
		return "index";
	}
	
	@PostMapping("/saveform")
	public String saveForm(@Valid User userObj,BindingResult result, Model model)
	{
		if(result.hasErrors())
		{
			return "index";
		}
		model.addAttribute("msg","User Form saved Sucessfully");
		return "dashboard";
	}

}
