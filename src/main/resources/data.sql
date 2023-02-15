insert into user_details(id,birth_date,name) values(10001, current_date(), 'Agniva');
insert into user_details(id,birth_date,name) values(10002, current_date(), 'Xavi');
insert into user_details(id,birth_date,name) values(10003, current_date(), 'Iniesta');

insert into post(id,description,user_id) values(20001, 'Learning AWS', 10001);
insert into post(id,description,user_id) values(20002, 'Learning Azure', 10001);
insert into post(id,description,user_id) values(20003, 'Learning GCP', 10002);
insert into post(id,description,user_id) values(20004, 'Learning OCI', 10002);