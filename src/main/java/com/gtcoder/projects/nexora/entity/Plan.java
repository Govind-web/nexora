package com.gtcoder.projects.nexora.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Plan {
    Long id;
    String name;
    String stripePrice;
    Integer maxProjects;
    Integer maxTokensPerDay;
    Integer maxPreviews; //max number of preview allowed
    Boolean unlimitedAt; //unlimited access to LLM, ignore if true
    Boolean active;

}
