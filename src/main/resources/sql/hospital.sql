DROP TABLE IF EXISTS hospital;
CREATE TABLE hospital(
   Id INT NOT NULL AUTO_INCREMENT
  ,name            VARCHAR(37) NOT NULL
  ,type            VARCHAR(18) NOT NULL
  ,zipCode         INTEGER  NOT NULL
  ,neighborhood    VARCHAR(31) NOT NULL
  ,councilDistrict INTEGER  NOT NULL
  ,policeDistrict  VARCHAR(12) NOT NULL
  ,Location_1      VARCHAR(33) NOT NULL
  , PRIMARY KEY (Id)
);
INSERT INTO hospital(name,type,zipCode,neighborhood,councilDistrict,policeDistrict,Location_1) VALUES ('Mercy Medical Cen.','Hospital',21202,'Downtown',11,'CENTRAL','301 St Paul St
Baltimore, MD');
INSERT INTO hospital(name,type,zipCode,neighborhood,councilDistrict,policeDistrict,Location_1) VALUES ('Maryland General Hospital','Hospital',21201,'Mount Vernon',11,'CENTRAL','827 Linden Ave
Baltimore, MD');
INSERT INTO hospital(name,type,zipCode,neighborhood,councilDistrict,policeDistrict,Location_1) VALUES ('VA Medical Center','Hospital',21201,'University Of Maryland',11,'CENTRAL','10 Greene St
Baltimore, MD');
INSERT INTO hospital(name,type,zipCode,neighborhood,councilDistrict,policeDistrict,Location_1) VALUES ('University of Maryland Medical Center','Hospital',21201,'University Of Maryland',11,'CENTRAL','22 Greene St
Baltimore, MD');
INSERT INTO hospital(name,type,zipCode,neighborhood,councilDistrict,policeDistrict,Location_1) VALUES ('John Hopkins Hospital','Hospital',21287,'Dunbar-Broadway',13,'EASTERN','600 Wolfe St
Baltimore, MD');
INSERT INTO hospital(name,type,zipCode,neighborhood,councilDistrict,policeDistrict,Location_1) VALUES ('Good Samaritan Hospital','Hospital',21239,'Loch Raven',3,'NORTHEASTERN','5601 Lockraven
Baltimore, MD');
INSERT INTO hospital(name,type,zipCode,neighborhood,councilDistrict,policeDistrict,Location_1) VALUES ('Union Memorial Hospital','Hospital',21218,'Charles Village',14,'NORTHERN','201 University
Baltimore, MD');
INSERT INTO hospital(name,type,zipCode,neighborhood,councilDistrict,policeDistrict,Location_1) VALUES ('Sinai Hospital','Hospital',21215,'Levindale',6,'NORTHERN','2401 Belvedere Ave
Baltimore, MD');
INSERT INTO hospital(name,type,zipCode,neighborhood,councilDistrict,policeDistrict,Location_1) VALUES ('MOUNT WASHINGTON PEDIATRIC HOSPITAL','Non-Acute Hospital',21209,'Mount Washington',5,'NORTHERN','1708 ROGERS AVE
Baltimore, MD');
INSERT INTO hospital(name,type,zipCode,neighborhood,councilDistrict,policeDistrict,Location_1) VALUES ('John Hopkins Bayview Medical Center','Hospital',21224,'Hopkins Bayview',2,'SOUTHEASTERN','4940 Eastern Ave
Baltimore, MD');
INSERT INTO hospital(name,type,zipCode,neighborhood,councilDistrict,policeDistrict,Location_1) VALUES ('Harbor Hospital Center','Hospital',21225,'Middle Branch/Reedbird Parks',10,'SOUTHERN','3001 Hanover St
Baltimore, MD');
INSERT INTO hospital(name,type,zipCode,neighborhood,councilDistrict,policeDistrict,Location_1) VALUES ('UNIVERSITY SPECIALTY HOSPITAL','Non-Acute Hospital',21230,'Otterbein',11,'SOUTHERN','611 CHARLES ST
Baltimore, MD');
INSERT INTO hospital(name,type,zipCode,neighborhood,councilDistrict,policeDistrict,Location_1) VALUES ('Kernan Hospital','Hospital',21207,'Dickeyville',8,'SOUTHWESTERN','2200 Kernan Dr
Baltimore, MD');
INSERT INTO hospital(name,type,zipCode,neighborhood,councilDistrict,policeDistrict,Location_1) VALUES ('St. Agnes Hospital','Hospital',21229,'Violetville',8,'SOUTHWESTERN','900 Caton Ave
Baltimore, MD');
INSERT INTO hospital(name,type,zipCode,neighborhood,councilDistrict,policeDistrict,Location_1) VALUES ('Bon Secours Hospital','Hospital',21223,'Penrose/Fayette Street Outreach',9,'WESTERN','2000 Baltimore St
Baltimore, MD');
