INSERT INTO flight (id,source, destination, IATA_Code,flight_id,Travel_Date) VALUES
  (flight_id_seq.nextVal,'India', 'China', 'AGR','AI001',TO_DATE('2017-07-05', 'YYYY-MM-DD')),
  (flight_id_seq.nextVal,'China', 'India', 'AKA','AI002',TO_DATE('2017-07-05', 'YYYY-MM-DD')),
  (flight_id_seq.nextVal,'India', 'China', 'AGR','AI003',TO_DATE('2017-07-06', 'YYYY-MM-DD')),
  (flight_id_seq.nextVal,'China', 'India', 'AKA','AI004',TO_DATE('2017-07-07', 'YYYY-MM-DD')),
   (flight_id_seq.nextVal,'India', 'China', 'AGR','AI005',TO_DATE('2017-07-08', 'YYYY-MM-DD')),
  (flight_id_seq.nextVal,'China', 'India', 'AKA','AI006',TO_DATE('2017-07-08', 'YYYY-MM-DD')),
  (flight_id_seq.nextVal,'India', 'Japan', 'AGR','KA001',TO_DATE('2017-07-05', 'YYYY-MM-DD')),
   (flight_id_seq.nextVal,'Japan', 'India', 'TAK','KA002',TO_DATE('2017-07-05', 'YYYY-MM-DD'));
     (flight_id_seq.nextVal,'India', 'Japan', 'AGR','KA003',TO_DATE('2017-07-06', 'YYYY-MM-DD')),
   (flight_id_seq.nextVal,'Japan', 'India', 'TAK','KA004',TO_DATE('2017-07-06', 'YYYY-MM-DD'));
     (flight_id_seq.nextVal,'India', 'Japan', 'AGR','KA005',TO_DATE('2017-07-07', 'YYYY-MM-DD')),
   (flight_id_seq.nextVal,'Japan', 'India', 'TAK','KA006',TO_DATE('2017-07-07', 'YYYY-MM-DD'));
   
  