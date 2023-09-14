package com.example.allocation.application.skill.DTO;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@EqualsAndHashCode
@Getter
@ToString
public class SkillDTO {
    private String skill_id;
    private String SkillName;
    private String SkillDescription;
    private String SkillCategory;
}
