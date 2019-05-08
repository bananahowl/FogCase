use Fogdatabase;
# the price values is for a meter 
#insert into materials (materialPrice, materialName) values (100, "bøg");

insert into materials (materialPrice, materialName) values (120, "birk");
insert into materials (materialPrice, materialName) values (150, "eg");
insert into materials (materialPrice, materialName) values (150, "ask");
insert into materials (materialPrice, materialName) values (90, "fyr");

insert into roofmaterial (roofmaterialname, roofmaterialprice) values ("aluminium", 200);
insert into roofmaterial (roofmaterialname, roofmaterialprice) values ("tagsten", 175);
insert into roofmaterial (roofmaterialname, roofmaterialprice) values ("plast", 100);

insert into height ( heightValue) values (220);

insert into width(widthValue) values(240);
insert into width(widthValue) values(270);
insert into width(widthValue) values(300);
insert into width(widthValue) values(330);
insert into width(widthValue) values(360);
insert into width(widthValue) values(390);
insert into width(widthValue) values(420);
insert into width(widthValue) values(450);
insert into width(widthValue) values(480);
insert into width(widthValue) values(510);
insert into width(widthValue) values(540);
insert into width(widthValue) values(570);
insert into width(widthValue) values(600);
insert into width(widthValue) values(630);
insert into width(widthValue) values(660);
insert into width(widthValue) values(690);
insert into width(widthValue) values(720);
insert into width(widthValue) values(750);
select * from width;


select * from length;
#insert into length(lengthValue) values(240);
insert into length(lengthValue) values(270);
insert into length(lengthValue) values(300);
insert into length(lengthValue) values(330);
insert into length(lengthValue) values(360);
insert into length(lengthValue) values(390);
insert into length(lengthValue) values(420);
insert into length(lengthValue) values(450);
insert into length(lengthValue) values(480);
insert into length(lengthValue) values(510);
insert into length(lengthValue) values(540);
insert into length(lengthValue) values(570);
insert into length(lengthValue) values(600);
insert into length(lengthValue) values(630);
insert into length(lengthValue) values(660);
insert into length(lengthValue) values(690);
insert into length(lengthValue) values(720);
insert into length(lengthValue) values(750);
insert into length(lengthValue) values(780);

insert into degrees (degreeValue) values(15);
insert into degrees (degreeValue) values(20);
insert into degrees (degreeValue) values(30);
insert into degrees (degreeValue) values(35);
insert into degrees (degreeValue) values(40);
insert into degrees (degreeValue) values(45);

insert into height (heightValue) values(200);

#insert into length(lengthValue) values(240);
insert into shedlength(shedlengthValue) values(150);
insert into shedlength(shedlengthValue) values(180);
insert into shedlength(shedlengthValue) values(210);
insert into shedlength(shedlengthValue) values(240);
insert into shedlength(shedlengthValue) values(270);
insert into shedlength(shedlengthValue) values(300);
insert into shedlength(shedlengthValue) values(330);
insert into shedlength(shedlengthValue) values(360);
insert into shedlength(shedlengthValue) values(390);
insert into shedlength(shedlengthValue) values(420);
insert into shedlength(shedlengthValue) values(450);
insert into shedlength(shedlengthValue) values(480);
insert into shedlength(shedlengthValue) values(510);
insert into shedlength(shedlengthValue) values(540);
insert into shedlength(shedlengthValue) values(570);
insert into shedlength(shedlengthValue) values(600);
insert into shedlength(shedlengthValue) values(630);
insert into shedlength(shedlengthValue) values(660);
insert into shedlength(shedlengthValue) values(690);
insert into shedlength(shedlengthValue) values(0); # ret til at 0 værdierne kommer i toppen

insert into shedwidth(shedwidthValue) values(210);
insert into shedwidth(shedwidthValue) values(240);
insert into shedwidth(shedwidthValue) values(270);
insert into shedwidth(shedwidthValue) values(300);
insert into shedwidth(shedwidthValue) values(330);
insert into shedwidth(shedwidthValue) values(360);
insert into shedwidth(shedwidthValue) values(390);
insert into shedwidth(shedwidthValue) values(420);
insert into shedwidth(shedwidthValue) values(450);
insert into shedwidth(shedwidthValue) values(480);
insert into shedwidth(shedwidthValue) values(510);
insert into shedwidth(shedwidthValue) values(540);
insert into shedwidth(shedwidthValue) values(570);
insert into shedwidth(shedwidthValue) values(600);
insert into shedwidth(shedwidthValue) values(630);
insert into shedwidth(shedwidthValue) values(660);
insert into shedwidth(shedwidthValue) values(690);
insert into shedwidth(shedwidthValue) values(720);
insert into shedwidth(shedwidthValue) values(0);

select * from shedwidth;
insert into shed (widthFK,lengthFK, materialFK) values(1,1,1);
#REname table arearoof to area;

insert into arearoof (widthFK,lengthFK,height,degree) values (2,4,1,2);

insert into carport (widthFK, lengthFK, heightFK, materialFK) values (2,3,1,2);

insert into roof (roofmaterialFK, areaFK) values (1,1);

insert into orders (carportFK, shedFK, roofFK) values (1,1,1);

insert into roof (roofmaterialFK, areaFK) values (1,1);


