CREATE TABLE flight(
	id INTEGER,
	source 	VARCHAR(150),
	destination 	VARCHAR(150),
	IATA_Code	VARCHAR(150),
	
);

CREATE SEQUENCE flight_id_seq START WITH 1 INCREMENT BY 1;

ALTER TABLE flight ALTER COLUMN id SET DEFAULT nextval('flight_id_seq');
