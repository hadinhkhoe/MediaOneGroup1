package group1.khai.models;

import java.sql.Timestamp;

public class Book extends Product{
	private String publishingCompany;
	private String authorName;
	private String bookType;
	public static int idNumber;
	public Book() {
		super();
	}
	public Book(String iD, String productName, int productType, long productQuota, double buyPrice, double sellPrice,
			Timestamp buyTimestamp,String publishingCompany, String authorName, String bookType) {
		super(iD,productName,productType,productQuota,buyPrice,sellPrice,buyTimestamp);
		this.publishingCompany = publishingCompany;
		this.authorName = authorName;
		this.bookType = bookType;
	}
	public String getPublishingCompany() {
		return publishingCompany;
	}
	public String getAuthorName() {
		return authorName;
	}
	public String getBookType() {
		return bookType;
	}
	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	public static String genID() {
		String a = Integer.toString(++idNumber);
		StringBuilder build = new StringBuilder();
		build.append("BK");
		for(int i=0;i<8-a.length()-2;i++) {
			build.append("0");
		}
		build.append(a);
		return build.toString();
	}
	
}
