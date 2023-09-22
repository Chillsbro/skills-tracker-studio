package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {
    @GetMapping("/")
    public String homePageDisplay() {
        return "<html>" +
                "<body>" +
                "<h1> Skills Tracker </h1>" +
                "<h2> Here are our programming languages to learn: </h2>" +
                "<ol>" +
                "<li> Java </li>" +
                "<li> Javascript </li>" +
                "<li> C++ </li>" +
                "</ol>" +
                "<h4>Click<a href= /form> here </a> to submit your favorite programming languages </h4>" +
                "</body>";
    }

    @GetMapping("/form")
    public String chooseSkillsForm() {
        return "<html>" +
                "<body>" +
                "<form action='/form' method ='POST'>" +
                "<label> Name: " +
                "<input type='text' name ='username' value='Enter your name.'/>" +
                "</label>" +
                "<label for = 'favLanguage'> My Favorite Language: </label>" +
                "<select name = 'favLanguage' id = 'languages'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Javascript'>Javascript</option>" +
                "<option value='C++'>C++</option>" +
                "</select>" +
                "<label for = 'secondLanguage'> Second Favorite Language: </label>" +
                "<select name = 'secondLanguage' id = 'languages'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Javascript'>Javascript</option>" +
                "<option value='C++'>C++</option>" +
                "</select>" +
                "<label for = 'thirdLanguage'>Third Favorite Language: </label>" +
                "<select name = 'thirdLanguage' id = 'languages'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Javascript'>Javascript</option>" +
                "<option value='C++'>C++</option>" +
                "</select>" +
                "<button>Submit</button>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

//    @PostMapping("/form")
//    public String postUserFavoriteLanguage (@RequestParam String username, String favLanguage, String secondLanguage, String thirdLanguage) {
//        return "<html>" +
//                "<body>" +
//                "<h1>"+ username + "</h1>" +
//                "<ol>" +
//                "<li>" + favLanguage + "</li>" +
//                "<li>" + secondLanguage + "</li>" +
//                "<li>" + thirdLanguage + "</li>" +
//                "</body>" +
//                        "</html>";
//    }

    @PostMapping("/form")
    public String postUserFavLanguagesToTable(@RequestParam String username, String favLanguage, String secondLanguage, String thirdLanguage) {
        return "<html>" +
                "<body>" +
                "<table>" +
                "<th>" + username + "</th>" +
                "<tr>" +
                "<td>" +
                "<label for='favLanguage'> Favorite Language: </label>" +
                "<td>" + favLanguage + "</td>" +
                "</td>" +
                "</tr>" +
                "<tr>" +
                "<td>" +
                "<label for='secondLanguage'> Second Language: </label>" +
                "<td>" + secondLanguage + "</td>" +
                "</td>" +
                "</tr>" +
                "<tr>" +
                "<td>" +
                "<label for='thirdLanguage'>Third Language: </label>" +
                "<td>" + thirdLanguage + "</td>" +
                "</td>" +
                "</tr>" +
                "</table>" +
                "</body>" +
                "</html>";
    }

}
