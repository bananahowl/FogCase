CREATE  DATABASE IF NOT EXISTS Fogdatabase;

USE Fogdatabase;

#DROP TABLE IF EXISTS 'orderlist';
#CREATE TABLE 'orderlist' (
#'orderlistID' int(11) NOT NULL AUTO_INCREMENT,
#'UserID' int (11) NOT NULL,
#REFERENCES
#)

##DROP TABLE IF EXISTS 'order';

CREATE TABLE IF NOT exists width(
widthID int(11)NOT NULL AUTO_INCREMENT PRIMARY KEY,
width int(11)

);
CREATE TABLE IF NOT exists length(
lengthID int(11)NOT NULL AUTO_INCREMENT PRIMARY KEY,
length int(11)

);
CREATE TABLE IF NOT exists heigth(
heigthID int (11)NOT NULL AUTO_INCREMENT PRIMARY KEY,
heigth int(11)
);
CREATE TABLE IF NOT exists degree(
degreeID int (11)NOT NULL AUTO_INCREMENT PRIMARY KEY,
degree int(11)
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
heigth int(11),
degreeFK int(11),
FOREIGN KEY (widthFK) REFERENCES width(widthID),
FOREIGN KEY (lengthFK) REFERENCES length(lengthID),
FOREIGN KEY (degreeFK) REFERENCES degree(degreeID)
);
#rename table area to arearoof; 

CREATE TABLE if not exists materials(
materialID int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
materialPrice int(11) NOT NULL,
materialName varchar(90)
);


CREATE TABLE if not exists carport (
carportID int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
width int(11) NOT NULL,
length int(11) NOT NULL,
heigth int(11) NOT NULL,
materialFK int(11),
FOREIGN KEY (widthFK) REFERENCES width(widthID),
FOREIGN KEY (heigthFK) REFERENCES heigth(heigthID),
FOREIGN KEY (lengthFK) REFERENCES length(lengthID),
FOREIGN KEY (materialFK) REFERENCES materials(materialID)
);


CREATE TABLE if not exists shed(
shedID int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
widthFK int(11),
lengthFK int(11),

materialFK int(11),
FOREIGN KEY (widthFK) REFERENCES width(widthID),
FOREIGN KEY (lengthFK) REFERENCES length(lengthID),
FOREIGN KEY (materialFK) REFERENCES materials(materialID)
);


CREATE TABLE if not exists roof(
roofID int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
roofmaterialFK int(11),
areaFK int(11),

FOREIGN KEY (roofmaterialFK) REFERENCES roofmaterial(roofmaterialID),
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












