package com.mba.colorprinter.services.impl;

import com.mba.colorprinter.services.BluePrinter;
import com.mba.colorprinter.services.ColourPrinter;
import com.mba.colorprinter.services.GreenPrinter;
import com.mba.colorprinter.services.RedPrinter;

public class ColourPrinterImpl implements ColourPrinter {
    private RedPrinter redPrinter;
    private GreenPrinter greenPrinter;
    private BluePrinter bluePrinter;


    public ColourPrinterImpl(){
        this.redPrinter = new EnglishRedPrinter();
        this.greenPrinter = new EnglishGreenPrinter();
        this.bluePrinter = new EnglishBluePrinter();
    }

    @Override
    public String Print(){
        return String.join(", ",redPrinter.Print(),greenPrinter.Print(),bluePrinter.Print());
    }

}