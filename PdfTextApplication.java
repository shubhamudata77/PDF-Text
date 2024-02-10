package com.pdf_text;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@SpringBootApplication
public class PdfTextApplication {

	public static void main(String[] args) {
		SpringApplication.run(PdfTextApplication.class, args);
	}

	//Loading an existing document
			File file = new File("C:/Users/sudata/Desktop/Report_Analysis_Project/JSDiagnosticReport.pdf");
			PDDocument document;

    {
        try {
            document = PDDocument.load(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Instantiate PDFTextStripper class
			PDFTextStripper pdfStripper;

    {
        try {
            pdfStripper = new PDFTextStripper();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Retrieving text from PDF document
			String text;

    {
        try {
            StringBuffer text = new StringBuffer(pdfStripper.getText(document));
            System.out.println(text);

            //Closing the document
            document.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }




		}




