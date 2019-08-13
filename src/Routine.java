import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.VerticalPositionMark;


public class Routine {
	
	private static final String BOLDs = null;

	public static void main(String[] args)throws DocumentException, MalformedURLException, IOException {
		String file_name="C:\\Users\\user\\eclipse-workspace\\Exception\\RoutinePDF\\Routine.pdf";
		
		
	
		Rectangle pageSize = new Rectangle( 595,842);
		pageSize.setBorder(Rectangle.BOX);
		pageSize.setBorderColor(BaseColor.CYAN);
		pageSize.setBorderColor(new BaseColor(72,61,139));
		pageSize .setBorderWidth(10);
		//pageSize.setBackgroundColor(new BaseColor(255, 204, 255));
		Document document=new Document(pageSize);
		Document document1 = new Document(pageSize);
		
		
		PdfWriter.getInstance(document, new FileOutputStream(file_name));
		Font font = new Font();
				font.setSize(10);
				font.setColor(255, 255, 255);
				font.isBold();
		Font font1 = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLDITALIC );
		Font font2 = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLDITALIC | Font.UNDERLINE);
		Font font3 = new Font(Font.FontFamily.HELVETICA, 12, Font.ITALIC);
		Font font4 = new Font(Font.FontFamily.HELVETICA, 15, Font.BOLDITALIC | Font.UNDERLINE);
		font4.setColor(72,61,139);
		Font font5 = new Font(Font.FontFamily.HELVETICA, 10, Font.ITALIC);
		Font font6 = new Font(Font.FontFamily.HELVETICA, 10, Font.BOLDITALIC);
		Font font7 = new Font(Font.FontFamily.HELVETICA, 15, Font.BOLDITALIC);
		Font font8 = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLDITALIC );
		font8.setColor(72,61,139);
		font7.setColor(255,20,147);
		PdfWriter.getInstance(document, new FileOutputStream(file_name));
		document.open();
		Image img = Image.getInstance("C:\\Users\\user\\Desktop\\Routine\\logo.png");
		img.setAlignment(Image.MIDDLE);
		document.add(img);
		
		Paragraph para=new Paragraph();
		Chunk glue=new Chunk(new VerticalPositionMark());
		para.add(new Chunk("             Chabahil,Kathmandu",font1));
		para.setAlignment(Element.ALIGN_CENTER);
		para.add(new Paragraph(" "));
		document.add(para);
		
		Paragraph para1=new Paragraph();
		para1.add(new Paragraph(" "));
		para1.add(new Chunk("DAILY CLASS ROUTINE",font4));
		para1.add(new Paragraph(" "));
		para1.add(new Paragraph(" "));
		para1.add(new Chunk("Course : ",font1));
		para1.add(new Chunk("Bsc. CSIT",font7)); //Course Name
		para1.add(new Chunk(glue));
		para1.add(new Chunk(" Shift : ",font1)); 
		para1.add(new Chunk("  Morning",font3));    //Shift 
		para1.add(new Paragraph(" "));
		para1.add(new Chunk("Semester : ",font1));
		para1.add(new Chunk("IV",font3));  //Semester
		para1.add(new Chunk(glue));
		para1.add(new Chunk(" Section : ",font1));
		para1.add(new Chunk(" A         ",font3));  //Section
		document.add(para1);
		
		document.add(new Paragraph(" "));

		
		//for table 
		
     	PdfPTable table=new PdfPTable(7);
		//Heading of tables 
		PdfPCell c1=new PdfPCell(new Phrase(new Chunk("Day/Time",font)));
		c1.setBackgroundColor(BaseColor.GRAY);
		table.addCell(c1);
		c1=new PdfPCell(new Phrase(new Chunk("6:30-7:30",font)));
		c1.setBackgroundColor(BaseColor.GRAY);
		table.addCell(c1);
		c1=new PdfPCell(new Phrase(new Chunk("7:30-8:30",font)));
		c1.setBackgroundColor(BaseColor.GRAY);
		table.addCell(c1);
		
		c1=new PdfPCell(new Phrase(new Chunk("8:30-9:30",font)));
		c1.setBackgroundColor(BaseColor.GRAY);
		table.addCell(c1);
		c1=new PdfPCell(new Phrase(new Chunk("9:30-10:00",font)));
		c1.setBackgroundColor(BaseColor.GRAY);
		table.addCell(c1);
		c1=new PdfPCell(new Phrase(new Chunk("10:00-11:00",font)));
		c1.setBackgroundColor(BaseColor.GRAY);
		table.addCell(c1);
		c1.setBackgroundColor(BaseColor.GRAY);
		c1=new PdfPCell(new Phrase(new Chunk("11:00-12:00",font)));
		c1.setBackgroundColor(BaseColor.GRAY);
		table.addCell(c1);

		//Data into the table 
	
		
		//Subjects for Sunday
		c1=new PdfPCell(new Phrase(new Chunk("Sunday",font1)));
	//	c1.setBackgroundColor(BaseColor.LIGHT_GRAY);
		table.addCell(c1);
		table.addCell("OS");
		table.addCell("Java/PHP");
		table.addCell("TOC");
		table.addCell("BREAK");
		table.addCell("DBMS");
		table.addCell("CN(LAB)");
		
		//Subjects for Mon
		c1=new PdfPCell(new Phrase(new Chunk("Monday",font1)));
		c1.setBackgroundColor(BaseColor.LIGHT_GRAY);
		table.addCell(c1);
		c1=new PdfPCell(new Phrase(new Chunk("Java/PHP",font3)));
		c1.setBackgroundColor(BaseColor.LIGHT_GRAY);
		table.addCell(c1);
		

		c1=new PdfPCell(new Phrase(new Chunk("TOC",font3)));
		c1.setBackgroundColor(BaseColor.LIGHT_GRAY);
		table.addCell(c1);

		c1=new PdfPCell(new Phrase(new Chunk("OS",font3)));
		c1.setBackgroundColor(BaseColor.LIGHT_GRAY);
		table.addCell(c1);

		c1=new PdfPCell(new Phrase(new Chunk("BREAK",font3)));
		c1.setBackgroundColor(BaseColor.LIGHT_GRAY);
		table.addCell(c1);
		

		c1=new PdfPCell(new Phrase(new Chunk("DBMS",font3)));
		c1.setBackgroundColor(BaseColor.LIGHT_GRAY);
		table.addCell(c1);
		
		

		c1=new PdfPCell(new Phrase(new Chunk("CN(LAB)",font3)));
		c1.setBackgroundColor(BaseColor.LIGHT_GRAY);
		table.addCell(c1);
		
		
		//Subjects for Tue
		c1=new PdfPCell(new Phrase(new Chunk("Tuesday",font1)));
	//	c1.setBackgroundColor(BaseColor.LIGHT_GRAY);
		table.addCell(c1);
		table.addCell("TOC");
		table.addCell("Java/PHP");
		table.addCell("OS");
		table.addCell("BREAK");
		table.addCell("DBMS");
		table.addCell("AI(LAB)");
		
		//Subjects for Wed
		c1=new PdfPCell(new Phrase(new Chunk("Wednesday",font6)));
		c1.setBackgroundColor(BaseColor.LIGHT_GRAY);
		table.addCell(c1);
		c1=new PdfPCell(new Phrase(new Chunk("OS",font3)));
		c1.setBackgroundColor(BaseColor.LIGHT_GRAY);
		table.addCell(c1);
		

		c1=new PdfPCell(new Phrase(new Chunk("TOC",font3)));
		c1.setBackgroundColor(BaseColor.LIGHT_GRAY);
		table.addCell(c1);

		c1=new PdfPCell(new Phrase(new Chunk("Java/PHP",font3)));
		c1.setBackgroundColor(BaseColor.LIGHT_GRAY);
		table.addCell(c1);

		c1=new PdfPCell(new Phrase(new Chunk("BREAK",font3)));
		c1.setBackgroundColor(BaseColor.LIGHT_GRAY);
		table.addCell(c1);
		

		c1=new PdfPCell(new Phrase(new Chunk("CN",font3)));
		c1.setBackgroundColor(BaseColor.LIGHT_GRAY);
		table.addCell(c1);
		
		

		c1=new PdfPCell(new Phrase(new Chunk("CN(LAB)",font3)));
		c1.setBackgroundColor(BaseColor.LIGHT_GRAY);
		table.addCell(c1);
		
		
		
		//Subjects for Thrus
		c1=new PdfPCell(new Phrase(new Chunk("Thrusday",font1)));
	//	c1.setBackgroundColor(BaseColor.LIGHT_GRAY);
		table.addCell(c1);
		table.addCell("TOC");
		table.addCell("AI");
		table.addCell("OS");
		table.addCell("BREAK");
		table.addCell("DBMS");
		table.addCell("OS(LAB)");
		
		//Subjects for Friday
		c1=new PdfPCell(new Phrase(new Chunk("Friday",font1)));
		c1.setBackgroundColor(BaseColor.LIGHT_GRAY);
		table.addCell(c1);
		c1=new PdfPCell(new Phrase(new Chunk("TOC",font3)));
		c1.setBackgroundColor(BaseColor.LIGHT_GRAY);
		table.addCell(c1);
		

		c1=new PdfPCell(new Phrase(new Chunk("Java/PHP",font3)));
		c1.setBackgroundColor(BaseColor.LIGHT_GRAY);
		table.addCell(c1);

		c1=new PdfPCell(new Phrase(new Chunk("DBMS",font3)));
		c1.setBackgroundColor(BaseColor.LIGHT_GRAY);
		table.addCell(c1);

		c1=new PdfPCell(new Phrase(new Chunk("BREAK",font3)));
		c1.setBackgroundColor(BaseColor.LIGHT_GRAY);
		table.addCell(c1);
		

		c1=new PdfPCell(new Phrase(new Chunk("OS",font3)));
		c1.setBackgroundColor(BaseColor.LIGHT_GRAY);
		table.addCell(c1);
		
		

		c1=new PdfPCell(new Phrase(new Chunk("CN(LAB)",font3)));
		c1.setBackgroundColor(BaseColor.LIGHT_GRAY);
		table.addCell(c1);
		
		
		document.add(table);		
		
		document.add(new Paragraph(" "));
		document.add(new Paragraph(" "));
		
		
		
		Paragraph p=new Paragraph();
		p.add(new Paragraph(new Chunk("Faculties Details :",font4)));
		p.add(new Paragraph(" "));
		p.setAlignment(Element.ALIGN_CENTER);
		document.add(p);
		
		
		
		//for details of Routine
		
		PdfPTable table1=new PdfPTable(6);
		//Heading of tables 
		PdfPCell c11=new PdfPCell(new Phrase(new Chunk("Subjects",font)));
		c11.setBackgroundColor(BaseColor.GRAY);
		table1.addCell(c11);
		
		 c11=new PdfPCell(new Phrase(new Chunk("Alias",font)));
		c11.setBackgroundColor(BaseColor.GRAY);
		table1.addCell(c11);
		
		c11=new PdfPCell(new Phrase(new Chunk("Teachers",font)));
		c11.setBackgroundColor(BaseColor.GRAY);
		table1.addCell(c11);
		
		
		c11=new PdfPCell(new Phrase(new Chunk("Hours Per Week",font)));
		c11.setBackgroundColor(BaseColor.GRAY);
		table1.addCell(c11);
		
		c11=new PdfPCell(new Phrase(new Chunk("Contact Number",font)));
		c11.setBackgroundColor(BaseColor.GRAY);
		table1.addCell(c11);
		c11=new PdfPCell(new Phrase(new Chunk("Remarks",font)));
		c11.setBackgroundColor(BaseColor.GRAY);
		table1.addCell(c11);
		
		//row 1
		
		 c11=new PdfPCell(new Phrase(new Chunk("Java",font5)));     //Subject Name 
			
		table1.addCell(c11);
			
		c11=new PdfPCell(new Phrase(new Chunk("Advance Java",font5))); //Alias 
		
		table1.addCell(c11);
			

		c11=new PdfPCell(new Phrase(new Chunk("Yubaraj Kalathoki",font5)));//teacher name
			
		table1.addCell(c11);

		c11=new PdfPCell(new Phrase(new Chunk("4",font5)));  //Number of hours per week
		
			table1.addCell(c11);

			c11=new PdfPCell(new Phrase(new Chunk("98123123112",font5)));   //Contact Number 

			table1.addCell(c11);
			

			c11=new PdfPCell(new Phrase(new Chunk(" ",font5)));  //Remarks
			
			table1.addCell(c11);
			
			
		
		//row2
		 c11=new PdfPCell(new Phrase(new Chunk("Computer Network",font5)));     //Subject Name 
		 c11.setBackgroundColor(BaseColor.LIGHT_GRAY);
			table1.addCell(c11);
			
			c11=new PdfPCell(new Phrase(new Chunk("CN",font5))); //Alias 
			c11.setBackgroundColor(BaseColor.LIGHT_GRAY);
			table1.addCell(c11);
			

			c11=new PdfPCell(new Phrase(new Chunk("Jeet Narayan Yadav",font5)));//teacher name
			c11.setBackgroundColor(BaseColor.LIGHT_GRAY);
			table1.addCell(c11);

			c11=new PdfPCell(new Phrase(new Chunk("5",font5)));  //Number of hours per week
			c11.setBackgroundColor(BaseColor.LIGHT_GRAY);
			table1.addCell(c11);

			c11=new PdfPCell(new Phrase(new Chunk("9862326143",font5)));   //Contact Number 
			c11.setBackgroundColor(BaseColor.LIGHT_GRAY);
			
			table1.addCell(c11);
			

			c11=new PdfPCell(new Phrase(new Chunk(" ",font5)));  //Remarks
			c11.setBackgroundColor(BaseColor.LIGHT_GRAY);
			
			
			table1.addCell(c11);
		
			//row 3
		 c11=new PdfPCell(new Phrase(new Chunk("Operating System",font5)));     //Subject Name 
				
			table1.addCell(c11);
				
			c11=new PdfPCell(new Phrase(new Chunk("OS",font5))); //Alias 
			
			table1.addCell(c11);
				

			c11=new PdfPCell(new Phrase(new Chunk("Saroj Ghimire",font5)));//teacher name
			table1.addCell(c11);
			c11=new PdfPCell(new Phrase(new Chunk("4",font5)));  //Number of hours per week
			
			table1.addCell(c11);

			c11=new PdfPCell(new Phrase(new Chunk("98123123143",font5)));   //Contact Number 
			table1.addCell(c11);
				
			c11=new PdfPCell(new Phrase(new Chunk(" ",font5)));  //Remarks
				
			table1.addCell(c11);
				
				
				
				
				//row 5
				
		 c11=new PdfPCell(new Phrase(new Chunk("Database System",font5)));     //Subject Name 
			 c11.setBackgroundColor(BaseColor.LIGHT_GRAY);
			table1.addCell(c11);
					
			c11=new PdfPCell(new Phrase(new Chunk("DBMS",font5))); //Alias 
			c11.setBackgroundColor(BaseColor.LIGHT_GRAY);
			table1.addCell(c11);
					

     		c11=new PdfPCell(new Phrase(new Chunk("Surya Basnet",font5)));//teacher name
			c11.setBackgroundColor(BaseColor.LIGHT_GRAY);
			table1.addCell(c11);

			c11=new PdfPCell(new Phrase(new Chunk("6",font5)));  //Number of hours per week
			c11.setBackgroundColor(BaseColor.LIGHT_GRAY);
			table1.addCell(c11);

			c11=new PdfPCell(new Phrase(new Chunk("9832323443",font5)));   //Contact Number 
			c11.setBackgroundColor(BaseColor.LIGHT_GRAY);
					
			table1.addCell(c11);
					

			c11=new PdfPCell(new Phrase(new Chunk(" ",font5)));  //Remarks
			c11.setBackgroundColor(BaseColor.LIGHT_GRAY);
					
					
			table1.addCell(c11);
					
					

					//row 6
						
			 c11=new PdfPCell(new Phrase(new Chunk("Theory of Computation",font5)));     //Subject Name 
				
				table1.addCell(c11);
				
				c11=new PdfPCell(new Phrase(new Chunk("TOC",font5))); //Alias 
			
				table1.addCell(c11);
				

				c11=new PdfPCell(new Phrase(new Chunk("Krishna Khadka",font5)));//teacher name
				
				table1.addCell(c11);

				c11=new PdfPCell(new Phrase(new Chunk("5",font5)));  //Number of hours per week
			
				table1.addCell(c11);

				c11=new PdfPCell(new Phrase(new Chunk("9861616143",font5)));   //Contact Number 

				table1.addCell(c11);
				

				c11=new PdfPCell(new Phrase(new Chunk(" ",font5)));  //Remarks
				
				table1.addCell(c11);
				
				//row7
				
		 c11=new PdfPCell(new Phrase(new Chunk("Artificial Intelligence",font5)));     //Subject Name 
		 c11.setBackgroundColor(BaseColor.LIGHT_GRAY);
		table1.addCell(c11);
					
			c11=new PdfPCell(new Phrase(new Chunk("AI",font5))); //Alias 
			c11.setBackgroundColor(BaseColor.LIGHT_GRAY);
			table1.addCell(c11);
					

			c11=new PdfPCell(new Phrase(new Chunk("Omkar Basnet",font5)));//teacher name
			c11.setBackgroundColor(BaseColor.LIGHT_GRAY);
			table1.addCell(c11);

			c11=new PdfPCell(new Phrase(new Chunk("4",font5)));  //Number of hours per week
			c11.setBackgroundColor(BaseColor.LIGHT_GRAY);
			table1.addCell(c11);

			c11=new PdfPCell(new Phrase(new Chunk("9862326143",font5)));   //Contact Number 
			c11.setBackgroundColor(BaseColor.LIGHT_GRAY);
					
			table1.addCell(c11);
					

			c11=new PdfPCell(new Phrase(new Chunk(" ",font5)));  //Remarks
			c11.setBackgroundColor(BaseColor.LIGHT_GRAY);
					
					
			table1.addCell(c11);


					//row 8
		 c11=new PdfPCell(new Phrase(new Chunk("Personal Home Page",font5)));     //Subject Name 
						
			table1.addCell(c11);
						
			c11=new PdfPCell(new Phrase(new Chunk("PHP",font5))); //Alias 
					
			table1.addCell(c11);
						

			c11=new PdfPCell(new Phrase(new Chunk("Hari Khadka",font5)));//teacher name
						
			table1.addCell(c11);

			c11=new PdfPCell(new Phrase(new Chunk("3",font5)));  //Number of hours per week
					
			table1.addCell(c11);

			c11=new PdfPCell(new Phrase(new Chunk("98611216143",font5)));   //Contact Number 

			table1.addCell(c11);
						

			c11=new PdfPCell(new Phrase(new Chunk(" ",font5)));  //Remarks
						
			table1.addCell(c11);			
									
		document.add(table1);
		
		
		Paragraph p1=new Paragraph();
		p1.add(new Paragraph(" "));
		p1.add(new Paragraph(new Chunk("Note : ",font8)));
		p1.add(new Paragraph(new Chunk("All Subjects have practicals.",font3)));
		p1.add(new Paragraph(new Chunk("Class Comencement Date: ",font8)));
		p1.add(new Paragraph(new Chunk("2076-5-1",font3)));
		document.add(p1);
		
		
		
		
		
		System.out.println("pdf created successfully");
		
		document.close();
		
	}

}
