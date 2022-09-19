-- phpMyAdmin SQL Dump
-- version 2.11.0
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tempo de Geração: Jun 14, 2018 as 02:46 AM
-- Versão do Servidor: 5.0.45
-- Versão do PHP: 5.2.4

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

--
-- Banco de Dados: `bd`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tabcliente`
--

CREATE TABLE `tabcliente` (
  `codcli` int(11) NOT NULL auto_increment,
  `cpf` varchar(30) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `fone` varchar(30) NOT NULL,
  `sexo` varchar(15) NOT NULL,
  `endereco` varchar(50) NOT NULL,
  `bairro` varchar(30) NOT NULL,
  `cidade` varchar(30) NOT NULL,
  `estado` varchar(2) NOT NULL,
  `cep` varchar(20) NOT NULL,
  PRIMARY KEY  (`codcli`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=24 ;

--
-- Extraindo dados da tabela `tabcliente`
--

INSERT INTO `tabcliente` (`codcli`, `cpf`, `nome`, `email`, `fone`, `sexo`, `endereco`, `bairro`, `cidade`, `estado`, `cep`) VALUES
(22, '500.473.038-59', 'Laura', 'lafochi@gmail.com', '(19)1238-9238', 'F', 'Rua Feliz', 'Betel', 'Paulínia', 'SP', '12.232.312');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tablogin`
--

CREATE TABLE `tablogin` (
  `codigo` int(11) NOT NULL auto_increment,
  `usuario` varchar(30) NOT NULL,
  `senha` varchar(20) NOT NULL,
  PRIMARY KEY  (`codigo`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Extraindo dados da tabela `tablogin`
--

INSERT INTO `tablogin` (`codigo`, `usuario`, `senha`) VALUES
(1, 'laura', '123');
