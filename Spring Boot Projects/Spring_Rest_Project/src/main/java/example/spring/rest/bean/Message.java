package example.spring.rest.bean;

import java.time.LocalDate;

public class Message {
	private String content;
	private LocalDate sentOn;
	
	public Message() {
		content = "Happy New Year";
		sentOn = LocalDate.of(2025,1, 1);
	}

	public Message(String content, LocalDate sentOn) {
		super();
		this.content = content;
		this.sentOn = sentOn;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDate getSentOn() {
		return sentOn;
	}

	public void setSentOn(LocalDate sentOn) {
		this.sentOn = sentOn;
	}

	@Override
	public String toString() {
		return "Message [content=" + content + ", sentOn=" + sentOn + "]";
	}
	
}
