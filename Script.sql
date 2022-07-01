create table gremlin (
	name text,
	age integer,
	color text,
	isEvil boolean
);
insert into gremlin (name, age, color, isEvil)
values
('gizmo',10,'brown',false),
('mohawk',25,'black',true),
('greta',15,'green',true);
select * from gremlin;
