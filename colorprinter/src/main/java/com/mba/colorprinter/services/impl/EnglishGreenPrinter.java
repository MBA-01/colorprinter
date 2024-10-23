package com.mba.colorprinter.services.impl;

import com.mba.colorprinter.services.GreenPrinter;
import org.springframework.stereotype.Component;

@Component

public class EnglishGreenPrinter implements GreenPrinter {
    @Override
    public String Print() {
        return "Green";
    }
}
