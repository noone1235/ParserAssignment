package com.chary.main.service;

import java.io.File;
import java.io.IOException;

import org.apache.tika.exception.TikaException;
import org.springframework.beans.factory.annotation.Autowired;

import com.chary.main.documentParsers.PdfParser;

@org.springframework.stereotype.Service
public class Service {
	@Autowired
	PdfParser pdfParser;
	
	public void main() throws IOException, TikaException, Exception {
		
		File file=new File("rampandu.pdf");
		pdfParser.parse(file);
	}
}
