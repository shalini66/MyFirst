package com.capgemini.spring.dto;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class BorrowedBookPK implements Serializable {

	private int bookId;
	private String email;
}
