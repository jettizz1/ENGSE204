package lab5_new;
import java.util.Scanner;

class Documentiti {
	protected String title;
	
	public Documentiti(String title) {
		this.title = title;
	}
	
	public void displayDetails() {
		System.out.println("Document: " + title);
	}
}

class TextDocumentiti extends Documentiti {
	protected int wordCount;
	
	public TextDocumentiti(String title, int wordCount) {
		super(title);
		this.wordCount = wordCount;
	}
	@Override
	public void displayDetails() {
		System.out.println("Text: " + title + ", Words: " + wordCount);
	}
}

class PDFDocument extends Documentiti {
	protected int pageCount;
	
	public PDFDocument(String title, int pageCount) {
		super(title);
		this.pageCount = pageCount;
	}
	@Override
	public void displayDetails() {
		System.out.println("PDF: " + title + ", Pages: " + pageCount);
	}
}

public class lab5_11 {

	public static void main(String[] args) {
		Scanner scannerzz = new Scanner(System.in);
		if (scannerzz.hasNextLine()) {
			String toneName = scannerzz.nextLine();
			int toneWords = scannerzz.nextInt();
			scannerzz.nextLine();
			String poneName = scannerzz.nextLine();
			int poneePages = scannerzz.nextInt();
			scannerzz.nextLine();
			String ttwoName = scannerzz.nextLine();
			int ttwooWords = scannerzz.nextInt();
			scannerzz.nextLine();
			String ptwozName = scannerzz.nextLine();
			int ptwozPages = scannerzz.nextInt();
			Documentiti tone = new TextDocumentiti(toneName, toneWords);
			Documentiti ponez = new PDFDocument(poneName, poneePages);
			Documentiti ttwo = new TextDocumentiti(ttwoName, ttwooWords);
			Documentiti ptwoz = new PDFDocument(ptwozName, ptwozPages);
			Documentiti[] docs = {tone, ponez, ttwo, ptwoz};
			int totalPages = 0;
			for (Documentiti d : docs) {
				if (d instanceof PDFDocument) {
					PDFDocument pdf = (PDFDocument) d;
					totalPages += pdf.pageCount;
				}
			}
			for (Documentiti d : docs) {
				d.displayDetails();
			}
			System.out.println("Total Pages: " + totalPages);
		}
		scannerzz.close();
	}
}