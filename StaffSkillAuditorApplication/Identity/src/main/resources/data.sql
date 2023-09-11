insert into role (type) values ('ADMIN');
insert into role (type) values ('USER');

insert into application_user (id, username, password, first_name, surname, email, role_id)
values ('0000', 'admin', 'admin1', 'first2', 'surname2', 'admin@email.com', 2);

insert into application_user (id, username, password, first_name, surname, email, role_id)
values ('0001', 'sparkesjm', 'Password1234!', 'Josh', 'Sparkes', 'sparkesjm@email.com', 1);
insert into application_user (id, username, password, first_name, surname, email, role_id)
values ('0002', 'philj', 'staffsuni@', 'Phil', 'James', 'philj@email.com', 1);
insert into application_user (id, username, password, first_name, surname, email, role_id)
values ('0003', 'testuser1', 'staffsuni@', 'Test', 'User1', 'testuser1@email.com', 1);
insert into application_user (id, username, password, first_name, surname, email, role_id)
values ('0004', 'testuser2', 'staffsuni@', 'Test', 'User2', 'testuser2@email.com', 1);