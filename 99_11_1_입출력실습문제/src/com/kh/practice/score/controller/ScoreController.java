package com.kh.practice.score.controller;

import java.io.DataInputStream;

import com.kh.practice.score.model.dao.ScoreDAO;

public class ScoreController {
	ScoreDAO sd = new ScoreDAO();
	
	public void saveScore(String name,int kor,int eng,int math,int sum, double avg) {
		sd.saveScore(name, kor, eng, math, sum, avg);
	}
	public DataInputStream readScore() throws Exception {
		return sd.readScore();
	}
}
