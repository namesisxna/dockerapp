INSERT INTO flight (id,source, destination, IATA_Code,flight_id,Travel_Date) VALUES
  (flight_id_seq.nextVal,'India', 'China', 'AGR','AI001',TO_DATE('2017-07-05', 'YYYY-MM-DD')),
  (flight_id_seq.nextVal,'China', 'India', 'AKA','AI002',TO_DATE('2017-07-05', 'YYYY-MM-DD')),
  (flight_id_seq.nextVal,'India', 'Japan', 'AGR','AI003',TO_DATE('2017-07-05', 'YYYY-MM-DD')),
   (flight_id_seq.nextVal,'Japan', 'India', 'TAK','AI004',TO_DATE('2017-07-05', 'YYYY-MM-DD'));
  