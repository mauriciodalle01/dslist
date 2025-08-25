package com.mauriciodalle.dslist.dto;

public class RaplacementDTO {

	private Integer sourceIndex;
	private Integer destinationIndex;
	
	public Integer getSourceIndex() {
		return sourceIndex;
	}
	public void setSourceIndex(Integer sourceIndex) {
		this.sourceIndex = sourceIndex;
	}
	
	public Integer getDestinationIndex() {
		return destinationIndex;
	}
	
	public void setDestinationIndex(Integer destinationIndex) {
		this.destinationIndex = destinationIndex;
	}
}
