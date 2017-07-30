CREATE TABLE hospital (
   Id INT NOT NULL AUTO_INCREMENT
  ,name            VARCHAR(37) NOT NULL
  ,type            VARCHAR(18) NOT NULL
  ,zipCode         INTEGER  NOT NULL
  ,neighborhood    VARCHAR(31) NOT NULL
  ,councilDistrict INTEGER  NOT NULL
  ,DistrictName  VARCHAR(12) NOT NULL
  ,DistrictId      INTEGER
  ,Location_1      VARCHAR(33) NOT NULL
  ,PRIMARY KEY (Id)
  ,FOREIGN KEY (`DistrictId`) REFERENCES district (Id)
)$$

CREATE TRIGGER
    before_trg_hospital_district_fk
    BEFORE INSERT ON hospital
    FOR EACH ROW
BEGIN
    SET NEW.DistrictId = COALESCE(NEW.DistrictId, (SELECT d.DistrictName FROM district d WHERE d.DistrictName = NEW.DistrictName));
END$$