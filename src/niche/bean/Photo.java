package niche.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="photos")
public class Photo 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int photoid;
	@Column(nullable=false)
	private int userid;
	@Column(nullable=false)
	private String type;
	@Column(nullable=false)
	private String description;
	@Column(nullable=false)
	private String title;
	@Column(nullable=false)
	private String photo;
	
	public Photo()
	{
		
	}

	public int getPhotoid() {
		return photoid;
	}

	public void setPhotoid(int photoid) {
		this.photoid = photoid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "Photo [photoid=" + photoid + ", userid=" + userid + ", type=" + type + ", description=" + description
				+ ", title=" + title + ", photo=" + photo + "]";
	}
		
}
