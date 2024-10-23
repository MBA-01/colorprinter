package com.mba.colorprinter;

import com.mba.colorprinter.services.ColourPrinter;
import com.mba.colorprinter.services.impl.ColourPrinterImpl;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



// CommandLineRunner Usage
//	! not clear !

@SpringBootApplication
@Log
public class ColorprinterApplication implements CommandLineRunner {


	private ColourPrinter colourPrinter;

	public ColorprinterApplication(ColourPrinter colourPrinter) {
		this.colourPrinter = colourPrinter;
	}

	public static void main(String[] args) {
		SpringApplication.run(ColorprinterApplication.class, args);
	}

	@Override
	public void run(final String... args){
		log.info(colourPrinter.Print());
	}
}
