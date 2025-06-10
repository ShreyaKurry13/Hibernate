package example.spring.core.annotation.bean;

import java.time.LocalDate;

public class MessageBean {
	private String content;
	private LocalDate deliveredOn;
	public MessageBean() {
		
	}
	public MessageBean(String content, LocalDate deliveredOn) {
		super();
		this.content = content;
		this.deliveredOn = deliveredOn;
	}
	
	public MessageBean(LocalDate deliveredOn, String content) {
		super();
		this.deliveredOn = deliveredOn;
		this.content = content;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public LocalDate getDeliveredOn() {
		return deliveredOn;
	}
	public void setDeliveredOn(LocalDate deliveredOn) {
		this.deliveredOn = deliveredOn;
	}
	@Override
	public String toString() {
		return "MessageBean [content=" + content + ", deliveredOn=" + deliveredOn + "]";
	}
	
	
}
