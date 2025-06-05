package example.hibernate.entity;

public class Course {
	private String courseId;
	private String title;
	private int duration;
	private int fees;

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", title=" + title + ", duration=" + duration + ", fees=" + fees + "]";
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

	public Course(String courseId, String title, int duration, int fees) {
		super();
		this.courseId = courseId;
		this.title = title;
		this.duration = duration;
		this.fees = fees;
	}

	public Course() {
		// TODO Auto-generated constructor stub
	}

}
