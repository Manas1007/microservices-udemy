insert into user_details(id,birth_date,name)
values(1001,current_date(),'Manas');

insert into user_details(id,birth_date,name)
values(1002,current_date(),'Vyas');

insert into user_details(id,birth_date,name)
values(1003,current_date(),'Monu');

insert into post(id, description, user_id)
values(201,'learn Java' , 1001);

insert into post(id, description, user_id)
values(203,'learn AWS' , 1001);

insert into post(id, description, user_id)
values(204,'learn React' , 1002);

insert into post(id, description, user_id)
values(205,'learn nothing' , 1003);
