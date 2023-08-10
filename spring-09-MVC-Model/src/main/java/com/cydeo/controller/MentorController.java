package com.cydeo.controller;

import com.cydeo.model.Gender;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MentorController {
    @RequestMapping("/mentor")
    public String mentor(Model model){

       Mentor mentor1 = new Mentor("Mike","Smith",45, Gender.MALE);
       model.addAttribute("mentor1",mentor1);

       Mentor mentor2 = new Mentor("Tom","Hanks",65, Gender.MALE);
       model.addAttribute("mentor2",mentor2);

       Mentor mentor3 = new Mentor("Ammy","Bryan",25, Gender.FEMALE);
       model.addAttribute("mentor3",mentor3);

       return "mentor/mentor";



    }


}
