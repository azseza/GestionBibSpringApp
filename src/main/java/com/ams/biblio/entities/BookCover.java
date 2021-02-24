package com.ams.biblio.entities;

import javax.persistence.*;

@Entity
@Table(name = "cover_image", schema = "public")
public class BookCover {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "image_id")
	private int imgNumber;

	@Lob
	@Column(name = "image")
	private byte[] covImg;

	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;
	
	@ManyToOne
	@JoinColumn(name = "book_id")
	private int idBook;
	
	@Column(name = "image_size")
	private long imgSize;

	
	public int getImageId() {
	    return imgNumber;
	}

	public void setImageId(int imgNumber) {
	    this.imgNumber = imgNumber;
	}

	
	public byte[] getImg() {
	    return covImg;
	}

	public void setCovImg(byte[] covImg) {
	    this.covImg = covImg;
	}

	public String getCategory() {
	    return category.toString();
	}

	
	public long getImgSize() {
	    return imgSize;
	}

	



}
