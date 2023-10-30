package com.mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class question {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int questio_Id;
	
	private String question;
	
	@OneToOne
	private Answer answer;
	
	public int getQuestio_Id() {
		return questio_Id;
	}

	public question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public question(int questio_Id, String question, Answer answer) {
		super();
		this.questio_Id = questio_Id;
		this.question = question;
		this.answer = answer;
	}

	public void setQuestio_Id(int questio_Id) {
		this.questio_Id = questio_Id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

}
