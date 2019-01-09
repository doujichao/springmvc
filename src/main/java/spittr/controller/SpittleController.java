package spittr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spittr.Spittle;
import spittr.data.SpittleRepository;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping({"/spittles"})
public class SpittleController {
    public SpittleController() {
        System.out.println("SpitterController创建了！！");
    }

    private SpittleRepository spittleRepository;

    @Autowired
    public SpittleController(SpittleRepository spittleRepository){
        this.spittleRepository=spittleRepository;
    }

    @RequestMapping(method = GET,value = "/spittleList")
    public List<Spittle> spittles(@RequestParam("max") long max,
                                  @RequestParam("count") int count){
        return spittleRepository.findSpittles(max,count);
    }

    @RequestMapping(method = GET)
    public String spittles(Model model){
        model.addAttribute(spittleRepository.findSpittles(Long.MAX_VALUE,20));
        return "spittles";
    }
}
