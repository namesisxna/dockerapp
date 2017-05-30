INSERT INTO flight (id,source, destination, IATA_Code,Travel_Date) VALUES
  (flight_id_seq.nextVal,'India', 'China', 'IC201',TO_DATE('2017-07-05', 'YYYY-MM-DD')),
  (flight_id_seq.nextVal,'China', 'India', 'CI201',TO_DATE('2017-07-05', 'YYYY-MM-DD'));