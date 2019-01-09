package spittr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import spittr.Spitter;
import spittr.data.SpitterRepository;

import javax.validation.Valid;


@Controller
@RequestMapping("/spitter")
public class SpitterController {

    private SpitterRepository spitterRepository;

    @Autowired
    public void setSpitterRepository(SpitterRepository spitterRepository) {
        this.spitterRepository = spitterRepository;
    }

    @RequestMapping(value="/register",method = RequestMethod.GET)
    public String showRegistrationForm(Model model){
        model.addAttribute(new Spitter());
        System.out.println("跳转表单页面");
        return "registerForm";
    }

    @RequestMapping(value="/register",method = RequestMethod.POST)
    public String processRegistration(@Valid Spitter spitter, Errors error){

        if(error.hasErrors()){
            return "registerForm";
        }
        spitterRepository.save(spitter);

        System.out.println("保存完毕");
        return "redirect:/spitter/"+spitter.getUsername();
    }

    @RequestMapping(value = "/{username}" ,method = RequestMethod.GET)
    public String showSpitterProfile(
            //pathVariable:可以匹配路径中相同名称的变量，并填充
            @PathVariable String username, Model model){
        Spitter spitter=spitterRepository.findByUsername(username);
        model.addAttribute(spitter);
        return "profile";
    }

}
