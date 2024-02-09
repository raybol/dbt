package org.example;

import io.objectbox.BoxStore;

public class ObjectBox {
    private static BoxStore boxStore;

    public static void init() {
        boxStore = MyObjectBox.builder()
                .name("objectbox-notes-db")
                .build();
    }

    public static BoxStore get() { return boxStore; }
}
