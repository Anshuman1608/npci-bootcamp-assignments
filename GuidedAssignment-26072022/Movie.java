package practice;

public class Movie {
	private String name;
	private String directorName;
	private String duration;
	private int releasedYear;
	
	public Movie()
	{
		
	}
	public Movie(String name, String directorName, String duration, int releasedYear)
	{
		this.name = name;
		this.directorName = directorName;
		this.duration = duration;
		this.releasedYear = releasedYear;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDirectorName() {
		return directorName;
	}
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public int getReleasedYear() {
		return releasedYear;
	}
	public void setReleasedYear(int releasedYear) {
		this.releasedYear = releasedYear;
	}
	@Override
	public String toString() {
		return "\nName : " + name +
				"\nDirector's Name : " + directorName +
				"\nDuration : " + duration +
				"\nReleased On : " + releasedYear;
	}
	
	

}
