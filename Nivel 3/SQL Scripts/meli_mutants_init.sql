SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";

CREATE DATABASE IF NOT EXISTS meli_mutants DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci;
USE meli_mutants;

CREATE TABLE dna_history (
  DNA_ID int(255) NOT NULL,
  DNA_JSON_REQUEST varchar(1025) COLLATE utf8_spanish_ci NOT NULL,
  DNA_ARRAY varchar(1000) COLLATE utf8_spanish_ci NOT NULL,
  DNA_MUTANT varchar(5) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

INSERT INTO dna_history (DNA_ID, DNA_JSON_REQUEST, DNA_ARRAY, DNA_MUTANT) VALUES
(1, '{\r\n  \"dna\": [\"CCCCCC\",\"CCCCCC\",\"TTTTTT\",\"AGACGG\",\"GCGTCA\",\"TCACTG\"]\r\n}', '[\"CCCCCC\",\"CCCCCC\",\"TTTTTT\",\"AGACGG\",\"GCGTCA\",\"TCACTG\"]', 'YES'),
(2, '{\r\n  \"dna\": [\"ATGCGA\",\"CAGTGC\",\"TTATTT\",\"AGACGG\",\"GCGTCA\",\"TCACTG\"]\r\n}', '[\"ATGCGA\",\"CAGTGC\",\"TTATTT\",\"AGACGG\",\"GCGTCA\",\"TCACTG\"]', 'NO');


DELIMITER $$
CREATE TRIGGER `update_stats` AFTER INSERT ON `dna_history` FOR EACH ROW BEGIN
DECLARE var_count_human_dna integer;
DECLARE var_count_mutant_dna integer;
DECLARE var_ratio float;

set @var_count_human_dna := (SELECT COUNT(1) FROM `dna_history` WHERE `DNA_MUTANT` = 'NO');
set @var_count_mutant_dna := (SELECT COUNT(1) FROM `dna_history` WHERE `DNA_MUTANT` = 'YES');
set @var_ratio := @var_count_mutant_dna / @var_count_human_dna;

	UPDATE dna_stats 
	SET count_human_dna= @var_count_human_dna,
	count_mutant_dna= @var_count_mutant_dna,
	ratio= @var_ratio;
 END
$$
DELIMITER ;

CREATE TABLE dna_stats (
  DNA_STATS_ID int(2) NOT NULL,
  COUNT_HUMAN_DNA int(255) NOT NULL,
  COUNT_MUTANT_DNA int(255) NOT NULL,
  RATIO float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

INSERT INTO dna_stats (DNA_STATS_ID, COUNT_HUMAN_DNA, COUNT_MUTANT_DNA, RATIO) VALUES
(1, 1, 1, 1);



ALTER TABLE dna_history
  ADD PRIMARY KEY (DNA_ID);


ALTER TABLE dna_history
  MODIFY DNA_ID int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;
