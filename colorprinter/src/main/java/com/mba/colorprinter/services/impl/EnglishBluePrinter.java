package com.mba.colorprinter.services.impl;

import com.mba.colorprinter.services.BluePrinter;
import org.springframework.stereotype.Component;

@Component

public class EnglishBluePrinter implements BluePrinter {
    @Override
    public String Print() {
        return "Blue";
    }
}
