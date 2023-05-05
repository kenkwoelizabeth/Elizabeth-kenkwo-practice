USE `ad-sba-sql`;

-- question 2
-- Create a query that lists each department and the number of ocurses offered by that department. 
-- The output should be sorted first by the Number of Courses in ascending order, then by Department 
-- Name in ascending order.

select department.name as Name, count(course.name) as "Number of courses"
from department
inner join course on department.id= course.deptId
group by department.name
order by count(course.name) asc;

-- question3
-- Create a query that lists the name of each course and 
-- the number of students in that course. The output should
--  be sorted by the Number of Students in descending order, 
-- then by Course Name in ascending order.

select course.name, count(studentCourse.courseId)
from course
inner join studentCourse on course.id= studentCourse.courseId
group by course.name
order by count(studentCourse.courseId) desc, course.name asc;

-- Question 4
-- Create a query that lists the names of all Courses 
-- where the number of faculty assigned to those courses
--  is zero. The output should be sorted by Course Name 
-- in ascending alphabetical order.

select course.name
from course
left join facultyCourse on course.id= facultyCourse.courseId
group by course.name having count(facultyCourse.facultyId) =0
order by course.name asc;

-- question 5
-- Create a query that lists the Course Names and 
-- the Number of Students in those courses for all
--  courses where there are no assigned faculty.
--  The output should be sorted by the Number of 
-- Students in descending order, then by Course 
-- Name in ascending order.

select course.name, count(studentCourse.studentId)
from course
left join facultyCourse on course.id= facultyCourse.courseId
inner join studentcourse on course.id= StudentCourse.courseId
group by course.name having count(facultyCourse.facultyId) =0
order by count(studentCourse.studentId) desc, course.name asc;

-- Question 6 
-- Create a query that lists the TotalNumber of Students 
-- that were enrolled in classes during each School Year. 
-- The first column should have the header "Students". 
-- Provide a second "Year" column showing the enrollment year.
-- The output should be sorted first by the School Year
--  in ascending order, then by Total Number of Students in descending order.

select count(distinct studentCourse.studentid) as "Students", year(studentCourse.startDate) as "Year"
from studentCourse
group by year(studentCourse.startDate)
order by year(studentCourse.startDate) asc, count(studentCourse.studentid) desc;

-- question 7 
-- Create a query that lists the Start Date and 
-- Total Number of Students who enrolled in classes 
-- in August of each year. The output should be ordered by the Start Date in ascending order, then by Total Number of Students in ascending order.


select studentCourse.startDate as "Start Date",  count(distinct studentCourse.studentid) as "Students"
from studentCourse
where month(StartDate) = 8
group by studentCourse.startDate
order by studentCourse.startDate asc, count(studentCourse.studentid) asc;


-- question 8 
-- Create a query that lists students firstname, 
-- lastname, and the number of courses they are 
-- taking in their major department. The output 
-- should be sorted by the number of courses in 
-- descending order, then by first name in ascending order,
--  then by the last name in ascending order.

select student.firstname, student.lastname, count(studentcourse.courseid)
from student
inner join studentcourse on studentcourse.studentid=student.id
inner join course on studentcourse.courseid= course.id
where student.majorId=course.deptId
group by student.firstname,  student.lastname
order by count(studentcourse.courseid) desc,student.firstname asc , student.lastname asc;


-- question 9
-- Create a query that lists firstName, lastName and 
-- average progress of all students achieving average
--  progress of less than 50%. The average progress 
-- displayed should be rounded to one decimal place. 
-- The output should be sorted by the average progress 
-- in descending order, then by first name in ascending 
-- order, then by last name in ascending order.


select student.firstname as "First Name", student.lastname as "Last Name", Round(avg(studentcourse.progress),1) as  "Average Progress"
from student
inner join studentCourse on student.id= studentCourse.studentId
group by student.firstname, student.lastname  having Round(avg(studentcourse.progress),1) < 50
order by  Round(avg(studentcourse.progress),1) desc, student.firstname asc, 
student.lastname asc;

-- question 10 
-- Create a query that lists each course name and the 
-- average progress of students in that course. 
-- The average progress displayed should be rounded 
-- to one decimal place. The output should be sorted 
-- first by average progress in descending order, 
-- then by course name in ascending order.

select course.name, Round(avg(studentcourse.progress),1) as " Average Progress"
from course
inner join studentCourse on course.id= studentCourse.courseId
group by course.name
order by  Round(avg(studentcourse.progress),1) desc, course.name asc;


-- question 11
-- Create a query that shows the course name and the 
-- average student progress of the course with the highest 
-- average progress in the system. Teh average progress 
-- displayed should be rounded to one decimal place.

select course.name, Round(avg(studentcourse.progress),1) as " Average Progress"
from course
inner join studentCourse on course.id= studentCourse.courseId
group by course.name
order by  Round(avg(studentcourse.progress),1) desc , course.name asc limit 1;


-- question 12
-- Create a query that outputs the faculty first name, 
-- last name and the average progress made over all of 
-- their courses. The average progress displayed should 
-- be rounded to one decimal place. The output should be 
-- sorted by the average progress in descending order, 
-- then by faculty first name in ascending order, then by 
-- faculty last name in ascending order.

select faculty.firstname,faculty.lastname, Round(avg(studentcourse.progress),1) as " Average Progress"
from faculty
inner join facultycourse on faculty.id= facultyCourse.facultyId
inner join course on course.id= facultyCourse.courseId
inner join studentCourse on studentCourse.courseId= course.id
group by faculty.firstname,faculty.lastname
order by  Round(avg(studentcourse.progress),1) desc , faculty.firstname asc,faculty.lastname asc;

-- question13
-- Create a query that displays each students firstname,
--  lastname, miminum grade based on their minimum progress, 
-- and maximum grad based on their maximum progress. 
-- The output should be soreted by minimum grade in 
-- descending order, then by maximum grade in descending 
-- order, then by first name in ascending order, then by
--  last name in ascending order.
-- progress < 40 = F
-- progress < 50 = D
-- progress < 60 = C
-- progress < 70 = B
-- progress >=70 = A


select student.firstname as "First Name", 
student.lastname as "Last Name", 
case
 when min(studentCourse.progress) < 40 then'F'
when min(studentCourse.progress) < 50 then'D'
when min(studentCourse.progress) < 60 then'C'
when min(studentCourse.progress) < 70 then'B'
when min(studentCourse.progress) >= 70 then'A'
end as  Minimum_Grade,

case
 when max(studentCourse.progress) < 40 then'F'
when max(studentCourse.progress) < 50 then'D'
when max(studentCourse.progress) < 60 then'C'
when max(studentCourse.progress) < 70 then'B'
when max(studentCourse.progress) >= 70 then'A'
end as  Maximum_Grade
from studentCourse
inner join student on student.id= studentCourse.studentid
group by student.firstname , student.lastname 
order by Minimum_Grade desc, Maximum_Grade desc,
student.firstname asc, student.lastname asc;



