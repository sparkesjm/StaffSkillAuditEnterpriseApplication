package com.example.allocation.ui.skill;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.allocation.application.identity.IdentityService;

import java.util.List;
import java.util.Optional;

@RequestMapping("/skills")
@RestController
@AllArgsConstructor
public class SkillController {

    private IdentityService identityService;
}
