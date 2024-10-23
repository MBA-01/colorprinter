package com.mba.colorprinter.services.impl;

import com.mba.colorprinter.services.BluePrinter;
import com.mba.colorprinter.services.ColourPrinter;
import com.mba.colorprinter.services.GreenPrinter;
import com.mba.colorprinter.services.RedPrinter;
import org.springframework.stereotype.Component;

import java.awt.*;


@Component
public class ColourPrinterImpl implements ColourPrinter {
    private RedPrinter redPrinter;
    private GreenPrinter greenPrinter;
    private BluePrinter bluePrinter;


    public ColourPrinterImpl(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter){
        this.redPrinter = redPrinter;
        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;

    }

    @Override
    public String Print(){
        return String.join(", ",redPrinter.Print(),greenPrinter.Print(),bluePrinter.Print());
    }

}