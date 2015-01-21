import java.io.*;

import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font;

public class DeckOfCard {

	public static void main(String[] args ) throws Exception{
		
		
		Document document = new Document();
		
		PdfWriter.getInstance(document, new FileOutputStream("Cards.pdf"));
		document.open();
		
		PdfPTable table = new PdfPTable(4);
        table.setWidthPercentage(110);
        table.getDefaultCell().setFixedHeight(180);
       
        FontFactory.defaultEmbedding = true;
		Font blackFont = FontFactory.getFont("/home/ivan/Desktop/Arial Regular.ttf",
			    BaseFont.IDENTITY_H, BaseFont.EMBEDDED, 40f, Font.NORMAL, BaseColor.BLACK);
		Font redFont = FontFactory.getFont("/home/ivan/Desktop/Arial Regular.ttf",
			    BaseFont.IDENTITY_H, BaseFont.EMBEDDED, 40f, Font.NORMAL, BaseColor.RED);
       
        String symbol = "";
        char color = ' ';
        
        for (int i = 2; i <= 14; i++) {
            switch (i) {
            case 11: symbol = " J";break;
            case 12: symbol = " Q";break;
            case 13: symbol = " K";break;
            case 14: symbol = " A";break;
            default: symbol = " " + i;break;
            }
            for (int j = 1; j <= 4; j++) {
                    switch (j) {
                    case 1: color = '\u2660'; table.addCell(new Paragraph(symbol + color , blackFont)); break;
                    case 2: color = '\u2666'; table.addCell(new Paragraph(symbol + color , redFont)); break;
                    case 3: color = '\u2663'; table.addCell(new Paragraph(symbol + color , blackFont)); break;
                    case 4: color = '\u2665'; table.addCell(new Paragraph(symbol + color , redFont)); break;
                    }
            }
         }
		 document.add(table);
         document.close(); 
	}
	
}
