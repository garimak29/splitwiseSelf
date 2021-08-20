package com.splitwise.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
public class Group extends Details{

    Set<Expenses> expenses;
    Admin admin;

}
