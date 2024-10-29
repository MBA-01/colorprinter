package com.mba.colorprinter.services.impl;

import com.mba.colorprinter.services.GreenPrinter;
import org.springframework.stereotype.Service;

@Service
public class SpanishGreenPrinter implements GreenPrinter {

    @Override
    public String Print() {
        return "Verde";
    }
}
