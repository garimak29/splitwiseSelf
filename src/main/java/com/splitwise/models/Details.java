package com.splitwise.models;


import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class Details extends Audit {
    String name;
    String description;
    Set<Participant> participant;
}
