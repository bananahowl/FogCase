CREATE  DATABASE IF NOT EXISTS Fogdatabase;

USE Fogdatabase;

#DROP TABLE IF EXISTS 'orderlist';
#CREATE TABLE 'orderlist' (
#'orderlistID' int(11) NOT NULL AUTO_INCREMENT,
#'UserID' int (11) NOT NULL,
#REFERENCES
#)

##DROP TABLE IF EXISTS 'order';

CREATE TABLE if not exists width(
widthID int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
widthValue int(11) NOT NULL
);

CREATE TABLE if not exists length(
lengthID int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
lengthValue int(11) NOT NULL
);

CREATE TABLE if not exists height(
heightID int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
heightValue int(11) NOT NULL
);

CREATE TABLE if not exists degrees(
degreeID int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
degreeValue int(11) NOT NULL
);

CREATE TABLE if not exists roofmaterial(
roofmaterialID int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
roofmaterialname varchar(90) NOT NULL,
roofmaterialprice int(11) NOT NULL
);


CREATE TABLE if not exists arearoof(
arearoofID int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
widthFK int(11),
lengthFK int(11),
height int(11),
degree int(11),
FOREIGN KEY (lengthFK) REFERENCES length(lengthID),
FOREIGN KEY (widthFK) REFERENCES width(widthID),
FOREIGN KEY (degree) REFERENCES degrees(degreeID)

);
#rename table area to arearoof; 

CREATE TABLE if not exists materials(
materialID int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
materialPrice int(11) NOT NULL,
materialName varchar(90)
);


CREATE TABLE if not exists carport (
carportID int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
widthFK int(11) NOT NULL,
lengthFK int(11) NOT NULL,
heightFK int(11) NOT NULL,
materialFK int(11),
FOREIGN KEY (materialFK) REFERENCES materials(materialID),
FOREIGN KEY (lengthFK) REFERENCES length(lengthID),
FOREIGN KEY (widthFK) REFERENCES width(widthID),
FOREIGN KEY (heightFK) REFERENCES height(heightID)
);


CREATE TABLE if not exists shed(
shedID int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
widthFK int(11) ,
lengthFK int(11),
materialFK int(11),
FOREIGN KEY (materialFK) REFERENCES materials(materialID),
FOREIGN KEY (lengthFK) REFERENCES length(lengthID),
FOREIGN KEY (widthFK) REFERENCES width(widthID)

);


CREATE TABLE if not exists roof(
roofID int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
roofmaterialFK int(11),
areaFK int(11),

FOREIGN KEY (roofmaterialFK) REFERENCES roofmaterial(roofmaterialid),
FOREIGN KEY (areaFK) REFERENCES arearoof(arearoofID)
);


CREATE TABLE IF NOT EXISTS orders (
orderID int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
carportFK int(11) NOT NULL,
shedFK int(11) NOT NULL,
roofFK int(11) NOT NULL,
FOREIGN KEY (carportFK) REFERENCES carport(carportID),
FOREIGN KEY (shedFK) REFERENCES shed (shedID),
FOREIGN KEY (roofFK) REFERENCES arearoof (arearoofID)
);












