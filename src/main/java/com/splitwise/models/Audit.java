package com.splitwise.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Audit {
    Long id;
    Date createdOn;
    Date lastUpdatedOn;
}
