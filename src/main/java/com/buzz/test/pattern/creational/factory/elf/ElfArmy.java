package com.buzz.test.pattern.creational.factory.elf;

import com.buzz.test.pattern.creational.factory.Army;

public class ElfArmy implements Army {

    private static final String DESCRIPTION = "this is Elf Army";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
