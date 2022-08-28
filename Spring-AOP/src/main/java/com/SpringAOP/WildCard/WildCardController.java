package com.SpringAOP.WildCard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WildCardController {
    @Autowired
    private  WildCardService wildCardService;
@GetMapping(value = "/wildcard")
    public  void  wildcardControl(){

    wildCardService.wildCard();
}
}
