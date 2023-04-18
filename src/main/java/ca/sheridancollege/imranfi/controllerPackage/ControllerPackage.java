package ca.sheridancollege.imranfi.controllerPackage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import ca.sheridancollege.imranfi.beans.Cat;
import ca.sheridancollege.imranfi.beans.Customer;
import ca.sheridancollege.imranfi.database.CatDatabase;
import ca.sheridancollege.imranfi.database.CustomerDatabase;
@Controller
public class ControllerPackage{
	
	// Maps the method to the root URL path and returns "home.html".
	@GetMapping("/")
	public String goHome() {
		return "home.html";
	}

	// Maps the method to the "/addCustomer" URL path, sets a "customer" attribute in the model, and returns "addCustomer.html".
	@GetMapping("/addCustomer")
	public String goAddCustomer(Model model) {
		model.addAttribute(	"customer", new Customer());
		return "addCustomer.html";
	}

	//  Maps the method to the "/proccessAddCustomer" URL path, adds the submitted customer to the database, sets a "customer" attribute in the model, 
	// and returns "addCustomer.html".
	@GetMapping("/proccessAddCustomer")
	public String proccessAddCustomer(Model model, @ModelAttribute Customer customer) {
		CustomerDatabase.customers.add(customer);
		model.addAttribute(	"customer", new Customer());
		return "addCustomer.html";
	}

	// Maps the method to the "/viewCustomer" URL path, retrieves the list of customers from the database, sets a "customerList" attribute in the model, 
	// and returns "viewCustomer.html".
	@GetMapping("/viewCustomer")
	public String goViewCustomer(Model model ) {
		model.addAttribute("customerList", CustomerDatabase.customers);
		return "viewCustomer.html";
	}

	//  Maps the method to the "/addCat" URL path, sets a "cat" attribute in the model, and returns "addCat.html
	@GetMapping("/addCat")
	public String goAddCat(Model model) {
		model.addAttribute("cat", new Cat());
		return "addCat.html";
	}

	//  Maps the method to the "/proccessAddCat" URL path, adds the submitted cat to the database, sets a "cat" attribute in the model, 
	// and returns "addCat.html".
	@GetMapping("/proccessAddCat")
	public String proccessAddCat(Model model, @ModelAttribute Cat cat) {
		CatDatabase.Cats.add(cat);
		model.addAttribute("cat", new Cat());
		return "addCat.html";
	}
	
	// Maps the method to the "/viewCat" URL path, retrieves the list of cats from the database, sets a "catList" attribute in the model, and returns "viewCat.html".
	@GetMapping("/viewCat")
	public String goViewCat(Model model) {
		model.addAttribute("catList", CatDatabase.Cats);
		return "viewCat.html";
	}
	
	
	
}
