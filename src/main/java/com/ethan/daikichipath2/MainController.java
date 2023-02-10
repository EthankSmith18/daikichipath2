package com.ethan.daikichipath2;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class MainController {

  @RequestMapping("")
  public String index(){
    return "Hello JOAN";
  }

  @RequestMapping("/today")
  public String today(){
    return "Today you will find luck in all areas.";
  }

  @RequestMapping("/tomorrow")
  public String tomorrow(){
    return "Tomorrow, an opportunity will arise!";
  }

  @RequestMapping("/travel/{city}")
    public String travel(@PathVariable("city") String city){
      return "Congratulations! You will soon travel to " + city;
    }

  @RequestMapping("/lotto/{number}")
    public String lottery(@PathVariable("number") int number){
      if(number%2 == 0){
        return "You will take grand journey in the future, but beware of JOAN.";
      }else{
        return "You have enjoyed the fruits of your labor but now is a great time to spend with family and friends.";
      }
      
    }

}
