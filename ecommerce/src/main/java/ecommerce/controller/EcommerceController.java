package ecommerce.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EcommerceController {
	
	@GetMapping("/hello")
    public String hello() 
	{
        return "Hello, World!";
    }
	@GetMapping("/cart")
    public String cart() 
	{
        return "Hello, cart!";
    }
}
