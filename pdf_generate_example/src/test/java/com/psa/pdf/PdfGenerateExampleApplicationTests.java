package com.psa.pdf;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.psa.pdf.utility.ExcelReader;
import com.psa.pdf.utility.PdfGenerator;

@SpringBootTest
class PdfGenerateExampleApplicationTests {

	@Test
	void contextLoads() {
//		PdfGenerator pdf= new PdfGenerator();
//		pdf.writeUsingIText();
		ExcelReader read= new ExcelReader();
		read.readExcel();
	}

}
