package com.example.overview.ui;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;
import com.example.overview.application.OverviewApplicationService;

@AllArgsConstructor
@RequestMapping("/overview")
@RestController
public class OverviewController {
    private OverviewApplicationService applicationService;
    @GetMapping("/send")
    public String testMessage(){
        applicationService.dummyCommand();
        return "ok";
    }
}
