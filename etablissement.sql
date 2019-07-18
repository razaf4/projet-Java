-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Client: localhost
-- Généré le: Jeu 18 Juillet 2019 à 09:46
-- Version du serveur: 5.6.12-log
-- Version de PHP: 5.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `etablissement`
--
CREATE DATABASE IF NOT EXISTS `etablissement` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `etablissement`;

-- --------------------------------------------------------

--
-- Structure de la table `etudiant`
--

CREATE TABLE IF NOT EXISTS `etudiant` (
  `Num_inscription` int(11) NOT NULL AUTO_INCREMENT,
  `Nom` varchar(80) NOT NULL,
  `Adresse` varchar(50) NOT NULL,
  `Date_naissance` date NOT NULL,
  `Sexe` varchar(10) NOT NULL,
  `Annee` year(4) NOT NULL,
  PRIMARY KEY (`Num_inscription`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=457 ;

--
-- Contenu de la table `etudiant`
--

INSERT INTO `etudiant` (`Num_inscription`, `Nom`, `Adresse`, `Date_naissance`, `Sexe`, `Annee`) VALUES
(1, 'eka', 'tanà', '2000-10-10', 'Masculin', 2019),
(11, 'dddd', 'rrrr', '2019-05-02', 'Masculin', 2019),
(12, 'razaf', 'mahajanga', '2019-05-09', 'masculin', 2017),
(23, 'valisoa', 'mahajanga', '2019-05-07', 'feminin', 2018),
(44, 'lena', 'toliara', '2000-11-11', 'Masculin', 2025),
(47, 'njara', 'betroka', '1999-01-12', 'Feminin', 2019),
(55, 'donne', 'maintirano', '1998-02-04', 'Masculin', 2019),
(65, 'fiainana', 'ambalavao', '2000-03-01', 'Masculin', 2019),
(66, 'jaja', 'toliara', '2000-04-02', 'Feminin', 2019),
(88, 'fifi', 'fianar', '1999-03-01', 'Feminin', 2025),
(444, 'fifaliana', 'Androy', '2019-05-01', 'feminin', 2000),
(456, 'dada', 'jaja', '2000-12-03', 'Masculin', 2019);

-- --------------------------------------------------------

--
-- Structure de la table `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `user_name` text NOT NULL,
  `pass` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `login`
--

INSERT INTO `login` (`user_name`, `pass`) VALUES
('java', 'java');

-- --------------------------------------------------------

--
-- Structure de la table `matiere`
--

CREATE TABLE IF NOT EXISTS `matiere` (
  `Code_matiere` int(11) NOT NULL,
  `Libelle` varchar(40) NOT NULL,
  `Coefficient` int(11) NOT NULL,
  PRIMARY KEY (`Code_matiere`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `matiere`
--

INSERT INTO `matiere` (`Code_matiere`, `Libelle`, `Coefficient`) VALUES
(1, 'Physique', 3),
(2, 'Philosophie', 3),
(3, 'mathematique', 3),
(4, 'Malagay', 2),
(5, 'zz', 1),
(7, 'histoire_geo', 1);

-- --------------------------------------------------------

--
-- Structure de la table `note`
--

CREATE TABLE IF NOT EXISTS `note` (
  `Id_note` int(11) NOT NULL,
  `Code_matiere` int(11) NOT NULL,
  `Num_inscription` int(11) NOT NULL,
  `Note` double NOT NULL,
  PRIMARY KEY (`Id_note`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
