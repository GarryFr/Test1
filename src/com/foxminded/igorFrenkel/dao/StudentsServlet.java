package com.foxminded.igorFrenkel.dao;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.foxminded.igorFrenkel.domain.Group;
import com.foxminded.igorFrenkel.domain.Student;
import com.foxminded.igorFrenkel.domain.University;

public class StudentsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(LessonServlet.class.getName());
       
    public StudentsServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		logger.trace("show students' info");
		response.setContentType("text/ html;charset=UTF-8");
		String crudChoise = request.getParameter("students");
		University university = new University();
		List<Student> students = new ArrayList<Student>();
		
		if  (crudChoise.equals("createStudent")){
			Student newStudent = university.enrollStudent();
			Group group = university.createGroup();
			group.setNumber("Gr3");
			group.setId(3);
			newStudent.setGroup(group);
			newStudent.setId(4);
			newStudent.setName("Alex Voinov");
			request.setAttribute("student", newStudent);
			getServletContext().getRequestDispatcher("/createStudent.jsp").forward(request, response);
			students.add(newStudent);
		}
		if (crudChoise.equals("readStudent")){
			Student student = students.get(0); 
		}
		if (crudChoise.equals("updateStudent")){
			Student student = students.get(0);
			student.setId(44);
			students.set(0, student);
		}
		if (crudChoise.equals("deleteStudent")){
			students.remove(0);
		}
		/*try {
			if (!students.isEmpty()){
				request.setAttribute("students", students);
				getServletContext().getRequestDispatcher("/students.jsp").forward(request, response);
			} else {
				logger.trace("There are no students in the list");
				getServletContext().getRequestDispatcher("/studentsError.html").forward(request, response);
			}
		} catch (DAOException e) {
			logger.warn("cannot show sudents' info", e);
			System.out.println("Cannot retrieve students from DataBase");
		}*/
	}
}
