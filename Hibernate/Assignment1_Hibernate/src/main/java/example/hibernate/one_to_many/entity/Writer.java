package example.hibernate.one_to_many.entity;

import java.util.Collection;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "writer_details")
public class Writer {

	@Id
	@Column(name = "writer_id")
	private Integer writerId;
	
	@Column(name = "writer_name", length = 10)
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "writer_id")
	private Collection<Article> articles;
	
	public Writer() {
		// TODO Auto-generated constructor stub
	}

	public Writer(Integer writerId, String name, Collection<Article> articles) {
		super();
		this.writerId = writerId;
		this.name = name;
		this.articles = articles;
	}

	public Integer getWriterId() {
		return writerId;
	}

	public void setWriterId(Integer writerId) {
		this.writerId = writerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<Article> getArticles() {
		return articles;
	}

	public void setArticles(Collection<Article> articles) {
		this.articles = articles;
	}

	@Override
	public String toString() {
		return "Writer [writerId=" + writerId + ", name=" + name + ", articles=" + articles + "]";
	}
	
}
