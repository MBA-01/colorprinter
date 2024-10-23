package com.mba.colorprinter.services.impl;

import com.mba.colorprinter.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishRedPrinter implements RedPrinter {
    @Override
    public String Print() {
        return "Red";
    }
}
