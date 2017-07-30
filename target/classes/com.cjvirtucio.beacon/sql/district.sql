DROP TABLE IF EXISTS district;
CREATE TABLE district(
   Id INT NOT NULL AUTO_INCREMENT,
   DistrictName VARCHAR(12),
   PRIMARY KEY (Id)
);
INSERT INTO district(DistrictName) VALUES ('CENTRAL');
INSERT INTO district(DistrictName) VALUES ('EASTERN');
INSERT INTO district(DistrictName) VALUES ('NORTHEASTERN');
INSERT INTO district(DistrictName) VALUES ('NORTHERN');
INSERT INTO district(DistrictName) VALUES ('NORTHWESTERN');
INSERT INTO district(DistrictName) VALUES ('SOUTHEASTERN');
INSERT INTO district(DistrictName) VALUES ('SOUTHERN');
INSERT INTO district(DistrictName) VALUES ('SOUTHWESTERN');
INSERT INTO district(DistrictName) VALUES ('WESTERN');