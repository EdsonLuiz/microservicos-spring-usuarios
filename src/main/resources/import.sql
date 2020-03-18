insert into usuarios (email, enabled, first_name, last_name, password, user_name) values ('emitchley0@delicious.com', true, 'Emmey', 'Mitchley', '84TYWDUW632', 'emitchley0');
insert into usuarios (email, enabled, first_name, last_name, password, user_name) values ('aleteurtre1@1688.com', true, 'Archie', 'Leteurtre', 'HoV5kSM3Xy', 'aleteurtre1');

insert into roles (name) values('ROLE_USER');
insert into roles (name) values('ROLE_ADMIN');

insert into usuarios_to_roles (user_id, role_id) values(1, 1);
insert into usuarios_to_roles (user_id, role_id) values(2, 2);
insert into usuarios_to_roles (user_id, role_id) values(2, 1);