package Lab4;

public class PrintJob {

	private int id;
	private String doc_name;
	private int pages;
	
	public PrintJob(int id, String doc_name, int pages) {
	
		this.id = id;
		this.doc_name = doc_name;
        this.pages = pages;
        
	}
	
	public int getId() {
		
        return id;
        
    }

    public String getDocName() {
    	
        return doc_name;
        
    }

    public int getPages() {
    	
        return pages;
        
    }

    public String toString() {
    	
        return doc_name;
        
    }
}
