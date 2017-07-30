
### Getting Started
1. Install [MySQL](https://dev.mysql.com/downloads/mysql/).
2. Verify that MySQL has been installed by typing `mysql` on your command line.
3. Restart your computer.
4. Verify that the MySQL Server is running by typing `mysqladmin -u root -p status`. Enter your password when prompted.
5. Place a properties file in src/main/resources/config. The file should be named "beacondb.local.properties" (in the future, the environment in the properties file name will depend on whether it's under development, under systems integration testing (SIT), functional and quality testing (FQT), performance verification testing (PVT) or production (PROD)).

You don't have to worry about running any scripts. The app should take care of populating the database with initial date.