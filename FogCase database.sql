Create database if not exists FogCase;
Use FogCase;

CREATE TABLE if not exists cWidth(
widthID int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
widthValue int(11) NOT NULL
);

CREATE TABLE if not exists cLength(
lengthID int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
lengthValue int(11) NOT NULL
);

CREATE TABLE if not exists cHeight(
heightID int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
heightValue int(11) NOT NULL
);

CREATE TABLE if not exists angle(
degreeID int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
degreeValue int(11) NOT NULL
);

CREATE TABLE IF NOT exists shedwidth(
shedwidthID int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
shedwidthValue int(11) NOT NULL

);

CREATE TABLE if not exists shedlength(
shedlengthID int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
shedlengthValue int(11) NOT NULL
);

CREATE TABLE IF NOT EXISTS user(
userID int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
firstname varchar(11) NOT NULL,
lastname varchar(11) NOT NULL,
adress varchar(30) NOT NULL,
city varchar(30) NOT NULL,
zipcode int(4) NOT NULL,
email varchar(35) NOT NULL,
phonenumber int(8) NOT NULL,
kodeord varchar(30)
);

create table if not exists orderTable(
order_id int primary key auto_increment,
user_id int not null,
cLength int not null,
cWidth int not null,
cHeigth int not null,
sLength int not null,
sWidth int not null, 
angle int not null,
price decimal not null,
shipped tinyint(1) not null,
foreign key (user_id) references user(userID),
foreign key (cLength) references cLength(lengthID),
foreign key (cWidth) references cWidth(widthID),
foreign key (cHeigth) references cHeight(heightID),
foreign key (sLength) references shedlength(shedlengthID),
foreign key (sWidth) references shedwidth(shedwidthID),
foreign key (angle) references angle(degreeID)
);

insert into cHeight (heightValue) values (220);

insert into cLength (lengthvalue) values
(270),(300),(330),(360),(390),(420),(450),(480)
,(510),(540),(570),(600),(630),(660),(690),(720),(750),(780);

insert into cWidth (widthvalue) values 
(240),(270),(300),(330),(360),(390),(420),(450)
,(480),(510),(540),(570),(600),(630),(660),(690),(720),(750);

insert into shedlength(shedlengthvalue) values
(0),(150),(180),(210),(240),(270),(300),(330),(360)
,(390),(420) ,(450),(480),(510),(540),(570),(600);

insert into shedwidth(shedwidthvalue) values
(0),(210),(240),(270),(300),(330),(360),(390),(420),
(450),(480),(510),(540),(570),(600);

insert into angle(degreevalue) values
(0),(15),(20),(30),(35),(40),(45);

CREATE VIEW maxLength AS
SELECT MAX(lengthid) FROM cLength;

CREATE VIEW maxWidth AS
select max(widthid) from cWidth;

CREATE VIEW maxShedWidth AS
select max(shedwidthid) from shedwidth;

CREATE VIEW maxShedLength AS
select max(shedlengthid) from shedlength;

CREATE VIEW maxAngle AS
select max(degreeid) from angle;

