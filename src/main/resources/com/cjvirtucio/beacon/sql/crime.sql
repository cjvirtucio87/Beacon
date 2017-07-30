CREATE TABLE crime (
   Id INT NOT NULL AUTO_INCREMENT
  ,CrimeDate       DATE  NOT NULL
  ,CrimeTime       VARCHAR(8) NOT NULL
  ,CrimeCode       VARCHAR(4) NOT NULL
  ,Location        VARCHAR(33)
  ,Description     VARCHAR(20) NOT NULL
  ,Weapon          VARCHAR(7)
  ,Post            INTEGER
  ,DistrictName        VARCHAR(12)
  ,DistrictId      INTEGER
  ,Neighborhood    VARCHAR(25)
  ,Location_1      VARCHAR(31)
  ,crimeCaseNumber VARCHAR(30)
  ,PRIMARY KEY (Id)
  ,FOREIGN KEY (`DistrictId`) REFERENCES district (Id)
)$$

CREATE TRIGGER
    before_trg_crime_district_fk
    BEFORE INSERT ON crime
    FOR EACH ROW
BEGIN
    SET NEW.DistrictId = COALESCE(NEW.DistrictId, (SELECT d.Id FROM district d WHERE d.DistrictName = NEW.DistrictName));
END$$