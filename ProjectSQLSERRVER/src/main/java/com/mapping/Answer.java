package com.mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Answer {
	@Id
	private int answer_Id;
	
	private String answer;

	public int getAnswer_Id() {
		return answer_Id;
	}

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answer(int answer_Id, String answer) {
		super();
		this.answer_Id = answer_Id;
		this.answer = answer;
	}

	public void setAnswer_Id(int answer_Id) {
		this.answer_Id = answer_Id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
