package example.hibernate.one_to_many.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "article_details")
public class Article {
	
	@Id
	@Column(name = "article_Id",length = 5)
	private String articleId;
	
	@Column(name = "article_subject", length = 10)
	private String subject;
	
	@Column(name = "article_published_date")
	private LocalDate dateOfPublication;
	
	public Article() {
		
	}

	public Article(String articleId, String subject, LocalDate dateOfPublication) {
		super();
		this.articleId = articleId;
		this.subject = subject;
		this.dateOfPublication = dateOfPublication;
	}

	public String getArticleId() {
		return articleId;
	}

	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public LocalDate getDateOfPublication() {
		return dateOfPublication;
	}

	public void setDateOfPublication(LocalDate dateOfPublication) {
		this.dateOfPublication = dateOfPublication;
	}

	@Override
	public String toString() {
		return "Article [articleId=" + articleId + ", subject=" + subject + ", dateOfPublication=" + dateOfPublication
				+ "]";
	}
	
}
