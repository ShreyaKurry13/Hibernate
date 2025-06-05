package example.hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "course_details")
public class CourseData {
	@Id
	@Column(name = "course_id", length = 5)
	private String courseId;
	
	@Column(name = "course_title", length = 40)
	private String title;
	
	@Column(name = "course_duration")
	private int duration;
	
	@Column(name = "course_fees")
	private int fees;

	@Override
	public String toString() {
		return "CourseData [courseId=" + courseId + ", title=" + title + ", duration=" + duration + ", fees=" + fees
				+ "]";
	}

	public CourseData(String courseId, String title, int duration, int fees) {
		super();
		this.courseId = courseId;
		this.title = title;
		this.duration = duration;
		this.fees = fees;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public CourseData() {
		// TODO Auto-generated constructor stub
	}

}
