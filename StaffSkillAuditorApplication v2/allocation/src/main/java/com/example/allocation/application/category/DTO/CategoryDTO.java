package com.example.allocation.application.category.DTO;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@EqualsAndHashCode
@Getter
@ToString
public class CategoryDTO {
    private String category_id;
    private String SkillCategory;
    private String CategoryDescription;
}
