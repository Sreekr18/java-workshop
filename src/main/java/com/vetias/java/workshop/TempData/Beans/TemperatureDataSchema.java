CREATE TABLE Location (
    LocationID INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(100),
    Latitude DOUBLE,
    Longitude DOUBLE,
    Description TEXT,
    Country VARCHAR(100),
    City VARCHAR(100),
    Address TEXT,
    PostalCode VARCHAR(20),
    BuildingID INT,
    FOREIGN KEY (BuildingID) REFERENCES Building(BuildingID)
);

CREATE TABLE Building (
    BuildingID INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(100),
    Area DOUBLE,
    Floors INT,
    OpenDateTime DATETIME,
    CloseDateTime DATETIME
);

CREATE TABLE Hostel (
    HostelID INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(100),
    Area DOUBLE,
    Floors INT,
    OpenHours DATETIME,
    CloseHours DATETIME,
    IsMessAvailable BOOLEAN,
    RoomsAvailable INT
);

CREATE TABLE Floor (
    FloorID INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(100),
    Number INT,
    BuildingID INT,
    FOREIGN KEY (BuildingID) REFERENCES Building(BuildingID)
);

CREATE TABLE Zone (
    ZoneID INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(100),
    Type VARCHAR(50),
    Area DOUBLE,
    FloorID INT,
    FOREIGN KEY (FloorID) REFERENCES Floor(FloorID)
);

CREATE TABLE Sensor (
    SensorID INT PRIMARY KEY AUTO_INCREMENT,
    Type VARCHAR(100),
    Reading FLOAT,
    ZoneID INT,
    FOREIGN KEY (ZoneID) REFERENCES Zone(ZoneID)
);

CREATE TABLE TemperatureSensor (
    SensorID INT PRIMARY KEY,
    Temperature FLOAT,
    FOREIGN KEY (SensorID) REFERENCES Sensor(SensorID)
);
