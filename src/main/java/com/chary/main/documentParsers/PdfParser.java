package com.chary.main.documentParsers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.pdf.PDFParser;
import org.apache.tika.sax.BodyContentHandler;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PdfParser {
	public void parse(File file) throws IOException, TikaException, Exception {
		FileInputStream fis=new FileInputStream(file);
		
		//Model person=new Model();
		
		BodyContentHandler ch=new BodyContentHandler(); 
		Metadata md =new Metadata();
		ParseContext pc =new ParseContext();
		PDFParser pp=new PDFParser();
		
		pp.parse(fis, ch, md,pc);
		
		String str=ch.toString();
		System.out.println(str);
		
	}
}
