package com.mauriciodalle.dslist.dto;

import com.mauriciodalle.dslist.entities.Game;

public class GameMinDTO {
	
	private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDscription;

    public GameMinDTO() {
    }

	public GameMinDTO(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDscription = entity.getShortDscription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDscription() {
		return shortDscription;
	}
}
