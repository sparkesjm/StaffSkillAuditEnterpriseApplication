package com.example.allocation.application.skill.events;

import org.springframework.context.ApplicationEvent;
import com.example.allocation.domain.staff.StaffName;

import java.time.LocalDate;
public class NewSkillAddedDomainEvent extends ApplicationEvent {
    private String aggregateID;
    private String occurredDateTime;
    private String staffID;
    private StaffName staffName;

    private String skillName;
    private String skillDescription;
    private String skillCategory;

    public NewSkillAddedDomainEvent(Object source,
                                    String aggregateID,
                                    String staffID,
                                    StaffName staffName,
                                    String skillName,
                                    String skillDescription,
                                    String skillCategory){
        super(source);
        this.occurredDateTime = LocalDate.now().toString();
        this.aggregateID = aggregateID;
        this.staffID = staffID;
        this.staffName = staffName;
        this.skillName = skillName;
        this.skillDescription = skillDescription;
        this.skillCategory = skillCategory;
    }

}
