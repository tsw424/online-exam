package com.online.exam.tb;

// Generated 2015-1-22 23:39:56 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * ScoreTb generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "score_tb", catalog = "exam")
public class ScoreTb implements java.io.Serializable {

	private String id;
	private StudentTb studentTb;
	private ExamPaperTb examPaperTb;
	private Double score;
	private Date startTime;
	private Date endTime;

	public ScoreTb() {
	}


	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 36)
	@GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "STU_ID", nullable = false)
	public StudentTb getStudentTb() {
		return studentTb;
	}


	public void setStudentTb(StudentTb studentTb) {
		this.studentTb = studentTb;
	}


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EXAM_PAPER_NUM", nullable = false)
	public ExamPaperTb getExamPaperTb() {
		return examPaperTb;
	}

	public void setExamPaperTb(ExamPaperTb examPaperTb) {
		this.examPaperTb = examPaperTb;
	}
	

	@Column(name = "SCORE", precision = 36, scale = 0)
	public Double getScore() {
		return this.score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	@Column(name = "START_TIME", length = 19)
	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	@Column(name = "END_TIME", length = 19)
	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

}
