package github.benlewis9000.LearnSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@SpringBootApplication
public class LearnSpringApplication {

	@GetMapping("/name/{name}")
	String name(@PathVariable String name){
		return "Hello, " + name;
	}

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

	/*
	//  TODO: error page doesn't work? "no explicit mapping for /error"
	@GetMapping("/error")
	String error(){
		return "Sorry, this website isn't quite finished yet!";
	}
	 */

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringApplication.class, args);
	}

}
