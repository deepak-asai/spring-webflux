package com.controller;

import java.util.Date;

import com.model.Student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class StudentEvent {
	private Student student;
	private Date date;
}
