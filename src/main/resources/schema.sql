CREATE TABLE flight(
	id INTEGER,
	source 	VARCHAR(150),
	destination 	VARCHAR(150),
	IATA_Code	VARCHAR(150),
	flight_id	VARCHAR(150),
	Travel_Date         DATE,
	
);

CREATE SEQUENCE flight_id_seq START WITH 1000 INCREMENT BY 1;

ALTER TABLE flight ALTER COLUMN id SET DEFAULT nextval('flight_id_seq');
