package com.foxminded.igorFrenkel.domain;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Test;

public class UniversityTest {

	@Test
	public void smokeTest_ProgrammeShouldWorkProperly() {
		University university = new University();
		assertTrue(university instanceof University);
	}

	@Test
	public void university_createTeacherDaySchedule_addedValues() {

		University university = new University();
		Group groupA1 = university.createGroup();
		groupA1.setId(1);
		university.enrollStudent();
		university.addGroup(groupA1);

		Teacher teacher = university.enrollTeacher("Paul Smeeth");
		teacher.setId(1);
		Classroom classRoom = university.createClassroom();
		university.addClassroom(classRoom);

		Calendar dateEconomics = new GregorianCalendar(2017, 05, 31, 9, 0);
		LessonItem lessonEconomics = university.createLessonItem();
		lessonEconomics.setId(1);
		Calendar dateEnglish = new GregorianCalendar(2017, 05, 31, 10, 0);
		LessonItem lessonEnglish = university.createLessonItem();
		lessonEnglish.setId(2);
		Calendar dateIT = new GregorianCalendar(2017, 05, 31, 11, 0);
		LessonItem lessonIT = university.createLessonItem();
		lessonIT.setId(3);

		Schedule teacherSchedule = university.createSchedule("Monday");
		teacherSchedule.addLessonItem(lessonEconomics);
		teacherSchedule.addLessonItem(lessonEnglish);
		teacherSchedule.addLessonItem(lessonIT);

		university.setTeacherDaySchedule(teacher, teacherSchedule);

		assertNotNull(university.getTeacherDaySchedule());

	}

	@Test
	public void university_createTeacherDaySchedule_addedCorrectValues() {

		University university = new University();
		Group groupA1 = university.createGroup();
		groupA1.setId(1);
		university.enrollStudent();
		university.addGroup(groupA1);

		Teacher teacher = university.enrollTeacher("Paul Smeeth");
		teacher.setId(1);
		Classroom classRoom = university.createClassroom();
		university.addClassroom(classRoom);

		Calendar dateEconomics = new GregorianCalendar(2017, 05, 31, 9, 0);
		LessonItem lessonEconomics = university.createLessonItem();
		lessonEconomics.setId(1);
		Calendar dateEnglish = new GregorianCalendar(2017, 05, 31, 10, 0);
		LessonItem lessonEnglish = university.createLessonItem();
		lessonEnglish.setId(2);
		Calendar dateIT = new GregorianCalendar(2017, 05, 31, 11, 0);
		LessonItem lessonIT = university.createLessonItem();
		lessonIT.setId(3);

		Schedule teacherSchedule = university.createSchedule("Monday");
		teacherSchedule.addLessonItem(lessonEconomics);
		teacherSchedule.addLessonItem(lessonEnglish);
		teacherSchedule.addLessonItem(lessonIT);

		university.setTeacherDaySchedule(teacher, teacherSchedule);
		assertTrue(university.getTeacherDaySchedule().containsKey(teacher));
	}

}
