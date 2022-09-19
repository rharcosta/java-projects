-- phpMyAdmin SQL Dump
-- version 2.11.0
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tempo de Geração: Jun 06, 2018 as 01:23 AM
-- Versão do Servidor: 5.0.45
-- Versão do PHP: 5.2.4

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

--
-- Banco de Dados: `ex_login`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `login`
--

CREATE TABLE `login` (
  `Codigo` int(11) NOT NULL auto_increment,
  `Usuario` varchar(30) NOT NULL,
  `Senha` varchar(20) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Endereço` varchar(100) NOT NULL,
  `Bairro` varchar(200) NOT NULL,
  `Cidade` varchar(100) NOT NULL,
  `CEP` varchar(100) NOT NULL,
  `Estado` varchar(100) NOT NULL,
  `Telefone` varchar(40) NOT NULL,
  `Idade` int(11) NOT NULL,
  `Sexo` varchar(42) NOT NULL,
  PRIMARY KEY  (`Codigo`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Extraindo dados da tabela `login`
--

INSERT INTO `login` (`Codigo`, `Usuario`, `Senha`, `Email`, `Endereço`, `Bairro`, `Cidade`, `CEP`, `Estado`, `Telefone`, `Idade`, `Sexo`) VALUES
(1, 'JOÃO', 'eusoufofo', 'joao@hotmail.com', 'rua padre antona', 'santa marta', 'paulinia', '12345678', 'São Paulo', '', 0, '');
