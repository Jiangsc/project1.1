package Project01;

import java.util.HashSet;
import java.util.Set;

public class Book {

	/**
	 * @return the authors
	 */
	public String getAuthors() {
		return authors;
	}
	/**
	 * @param authors the authors to set
	 */
	public void setAuthors(String authors) {
		this.authors = authors;
	}
	/**
	 * @return the edition
	 */
	public String getEdition() {
		return edition;
	}
	/**
	 * @param edition the edition to set
	 */
	public void setEdition(String edition) {
		this.edition = edition;
	}
	/**
	 * @return the sbuject
	 */
	public String getSubject() {
		return Subject;
	}
	/**
	 * @param sbuject the sbuject to set
	 */
	public void setSubject(String subject) {
		Subject = subject;
	}
	/**
	 * @return the course
	 */
	public String getCourse() {
		return course;
	}
	/**
	 * @param course the course to set
	 */
	public void setCourse(String course) {
		this.course = course;
	}
	/**
	 * @return the bookCondition
	 */
	public String getBookCondition() {
		return bookCondition;
	}
	/**
	 * @param bookCondition the bookCondition to set
	 */
	public void setBookCondition(String bookCondition) {
		this.bookCondition = bookCondition;
	}
	public void setUserIdOfBook(String userIdOfBook) {
		this.userIdOfBook = userIdOfBook;
	}
	public String getUserIdOfBook() {
		return userIdOfBook;
	}
	
	private String authors;
	private String edition;
	private String Subject;
	private String course;
	private String bookCondition;
	private String userIdOfBook;
	
	
}
