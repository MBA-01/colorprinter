package com.mba.colorprinter.config;

import com.mba.colorprinter.services.BluePrinter;
import com.mba.colorprinter.services.ColourPrinter;
import com.mba.colorprinter.services.GreenPrinter;
import com.mba.colorprinter.services.RedPrinter;
import com.mba.colorprinter.services.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;




@Configuration
public class PrinterConfig {

    @Bean
    public BluePrinter bluePrinter(){
        return new SpanishBluePrinter();
    }

    @Bean
    public RedPrinter redPrinter(){
        return new SpanishRedPrinter();
    }

    @Bean
    public GreenPrinter greenPrinter(){
        return new SpanishGreenPrinter();
    }

    @Bean
    public ColourPrinter colourPrinter(BluePrinter bluePrinter,RedPrinter redPrinter, GreenPrinter greenPrinter){
        return new ColourPrinterImpl(redPrinter,bluePrinter,greenPrinter);
    }
}
