package com.yedam.board.service;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Board {
	private int  bno;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	private Date updatedate;
}
