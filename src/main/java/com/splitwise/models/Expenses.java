package com.splitwise.models;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Set;

@Getter
@Setter
public class Expenses extends Details{

    Float amount;
    HashMap<Participant , Double> amountPaid;
    HashMap<Participant , Double> amountOwned;
    Long GroupID;
}
