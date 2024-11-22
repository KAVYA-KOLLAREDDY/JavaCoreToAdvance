create table Employee{
	id int,
	name varchar(50),
	email varchar(100);
	number double;
	date_of_joining date;
	gender varchar(10) check(gender in('Female','Male'));
	status varchar(10) check(status in('Inactive','Active'));
	Salary double;
	primary key (id)
}