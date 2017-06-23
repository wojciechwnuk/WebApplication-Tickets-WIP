package ticketsapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import ticketsapp.service.AccountService;
import ticketsapp.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AccountController {

    private AccountService accountService;

    @Autowired

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    @RequestMapping(value = "/account/registration", method = RequestMethod.GET)
    public String registerNewUser(Model model) {
        Account account = new Account();

        model.addAttribute("newUser", account);

        return "registration";
    }

    @RequestMapping(value = "/account/registration", method = RequestMethod.POST)
    public String processAddNewAccountForm(@ModelAttribute("newUser") Account accountToBeAdded) {
        accountService.create(accountToBeAdded);
        return "redirect:/";
    }

    @RequestMapping(value = "/account/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/account/loginfailed", method = RequestMethod.GET)
    public String loginerror(Model model) {
        model.addAttribute("error", "true");
        return "login";
    }
}