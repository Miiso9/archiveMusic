package me.miso.arhivamuzike.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MusicController {
    @GetMapping("/")
    public String home(){
        return "home";
    }



}
