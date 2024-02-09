package org.example;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

/**
 * Thing
 */
@Entity
public class Thing {
    @Id
    public long id;
    public String name;
}