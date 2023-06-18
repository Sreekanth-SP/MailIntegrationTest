package org.geekster;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MIController {
    @Autowired
    private MIObjects obj;
    @GetMapping("name")
    public String getObjectname(){
        return obj.getName();
    }
    @GetMapping("id")
    public int getObjectid(){
        return obj.getId();
    }


}
