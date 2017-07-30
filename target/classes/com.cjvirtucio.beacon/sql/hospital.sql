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
  ,PRIMARY KEY (Id)
  ,FOREIGN KEY (DistrictId) REFERENCES district (Id),
);