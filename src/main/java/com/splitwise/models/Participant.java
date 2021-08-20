package com.splitwise.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class Participant extends Audit {
    String name;
    String email;
    String phoneNum;
    Set<Group> group;
    Set<Expenses> expenses;

}
