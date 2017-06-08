package ticketsapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import ticketsapp.account.AccountService;
import ticketsapp.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AccountController {

    @Autowired
    private  AccountService accountService;

    @RequestMapping(value = "/account/registration", method = RequestMethod.GET)
    public String registerNewUser(Model model) {
        Account account = new Account();
        model.addAttribute("newUser", account);
        return "registration";
    }

    @RequestMapping(value = "/account/registration", method = RequestMethod.POST)
    public String processAddNewProductForm(@ModelAttribute("newUser") Account accountToBeAdded) {

        accountService.create(accountToBeAdded);
        return "redirect:/";
    }
    @RequestMapping (value = "/account/login", method = RequestMethod.GET)
    public  String loginUser (Model model) {
        return "login";
    }
}
