package com.fitzgerald.flash;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class FlashController {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/submit", method = RequestMethod.POST)
	public String submitGuess(@RequestParam(value="secretCode") String secretCode, RedirectAttributes redirectAttributes) {
		if (secretCode.equals("bushido")){
			return "redirect:/secret";
		} else {
			redirectAttributes.addFlashAttribute("error", "Not the secret code!");
			return "redirect:/";
		}
	}
	
	@RequestMapping("/secret") 
		public String secretWin() {
			return "code.jsp";
		}
	}

