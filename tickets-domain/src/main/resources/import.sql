create table EVENTS (
  account_id bigint not null auto_increment,
  availableTickets bigint,
  date varchar(255),
  name varchar(255),
  price bigint,
  primary key (account_id)
);
insert into events values('2', '1000', '2017-12-12', 'Big event', '12');
INSERT into events values('1', '1000', '2017-09-09', 'Small event', '9');
insert into events values('3', '5000', '2017-11-11', 'Colours festival', '4');
