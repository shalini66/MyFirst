package com.capgemini.spring.dto;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class BookIssueDetailsPK {
	private int bookId;
	private String email;
}
