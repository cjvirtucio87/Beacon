DROP TABLE IF EXISTS district;
CREATE TABLE district(
   Id INT NOT NULL AUTO_INCREMENT,
   District VARCHAR(12),
   PRIMARY KEY (Id),
   FOREIGN KEY (CrimeId) REFERENCES crime (Id),
   FOREIGN KEY (HospitalId) REFERENCES hospital (Id)
);
INSERT INTO district(District) VALUES ('CENTRAL');
INSERT INTO district(District) VALUES ('EASTERN');
INSERT INTO district(District) VALUES ('NORTHEASTERN');
INSERT INTO district(District) VALUES ('NORTHERN');
INSERT INTO district(District) VALUES ('NORTHWESTERN');
INSERT INTO district(District) VALUES ('SOUTHEASTERN');
INSERT INTO district(District) VALUES ('SOUTHERN');
INSERT INTO district(District) VALUES ('SOUTHWESTERN');
INSERT INTO district(District) VALUES ('WESTERN');