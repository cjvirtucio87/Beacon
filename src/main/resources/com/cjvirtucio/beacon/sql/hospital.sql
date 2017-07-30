CREATE TABLE hospital (
   Id INT NOT NULL AUTO_INCREMENT
  ,name            VARCHAR(37)
  ,type            VARCHAR(18)
  ,zipCode         INTEGER
  ,neighborhood    VARCHAR(31)
  ,councilDistrict INTEGER
  ,DistrictName  VARCHAR(12) NOT NULL
  ,DistrictId      INTEGER
  ,Location_1      VARCHAR(33)
  ,PRIMARY KEY (Id)
  ,FOREIGN KEY (`DistrictId`) REFERENCES district (Id)
)$$

CREATE TRIGGER
    before_trg_hospital_district_fk
    BEFORE INSERT ON hospital
    FOR EACH ROW
BEGIN
    SET NEW.DistrictId = COALESCE(NEW.DistrictId, (SELECT d.Id FROM district d WHERE d.DistrictName = NEW.DistrictName));
END$$