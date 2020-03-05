CREATE USER 'meli'@'%'
  IDENTIFIED BY 'meli';
GRANT SELECT,INSERT
  ON meli_mutants.*
  TO 'meli'@'%';