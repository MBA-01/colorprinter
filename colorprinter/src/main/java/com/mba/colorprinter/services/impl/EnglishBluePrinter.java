package com.mba.colorprinter.services.impl;

import com.mba.colorprinter.services.BluePrinter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service

public class EnglishBluePrinter implements BluePrinter {
    @Override
    public String Print() {
        return "Blue";
    }
}
