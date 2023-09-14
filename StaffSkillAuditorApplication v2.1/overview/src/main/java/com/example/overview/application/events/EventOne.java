package com.example.overview.application.events;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EventOne implements Serializable {
    @JsonProperty
    private String aggregateID;
    @JsonProperty
    private String someData;
}