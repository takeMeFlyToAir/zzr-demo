package com.zzr.web.index;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sjgtw-zzr on 2018/3/8.
 */
@Controller
@RequestMapping(value = "/")
public class IndexController {

    @RequestMapping("")
    public String index(Model model){
        model.addAttribute("user","zzr is good");
        return "index";
    }

    @RequestMapping("user")
    @ResponseBody
    public Map getMap(){
        Map map = new HashMap();
        map.put("name","zzr");
        return map;
    }
}
