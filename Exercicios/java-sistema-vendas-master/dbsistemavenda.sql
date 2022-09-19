-- phpMyAdmin SQL Dump
-- version 2.11.0
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tempo de Geração: Ago 16, 2018 as 02:41 PM
-- Versão do Servidor: 5.0.45
-- Versão do PHP: 5.2.4

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

--
-- Banco de Dados: `dbsistemavenda`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbcliente`
--

CREATE TABLE `tbcliente` (
  `Codigo` int(11) NOT NULL auto_increment,
  `Nome` varchar(100) NOT NULL,
  `CPF` varchar(14) NOT NULL,
  `DataNascimento` date NOT NULL,
  PRIMARY KEY  (`Codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Extraindo dados da tabela `tbcliente`
--


-- --------------------------------------------------------

--
-- Estrutura da tabela `tbcompra`
--

CREATE TABLE `tbcompra` (
  `Codigo` int(11) NOT NULL,
  `CodigoFornecedor` int(11) NOT NULL,
  `DataCompra` date NOT NULL,
  `ValorTotal` decimal(10,2) NOT NULL,
  `Situacao` int(11) NOT NULL,
  PRIMARY KEY  (`Codigo`),
  KEY `FK_CodigoFornecedor_idx` (`CodigoFornecedor`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbcompra`
--


-- --------------------------------------------------------

--
-- Estrutura da tabela `tbfornecedor`
--

CREATE TABLE `tbfornecedor` (
  `Codigo` int(11) NOT NULL auto_increment,
  `Nome` varchar(100) NOT NULL,
  `CNPJ` varchar(18) NOT NULL,
  PRIMARY KEY  (`Codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Extraindo dados da tabela `tbfornecedor`
--


-- --------------------------------------------------------

--
-- Estrutura da tabela `tbitemcompra`
--

CREATE TABLE `tbitemcompra` (
  `Codigo` int(11) NOT NULL auto_increment,
  `CodigoProduto` int(11) NOT NULL,
  `CodigoCompra` int(11) NOT NULL,
  `Quantidade` int(11) NOT NULL,
  `ValorUnitario` decimal(10,2) NOT NULL,
  PRIMARY KEY  (`Codigo`),
  KEY `FK_CodigoCompra_idx2` (`CodigoCompra`),
  KEY `FK_CodigoProduto_idk2` (`CodigoProduto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Extraindo dados da tabela `tbitemcompra`
--


-- --------------------------------------------------------

--
-- Estrutura da tabela `tbitemvenda`
--

CREATE TABLE `tbitemvenda` (
  `Codigo` int(11) NOT NULL auto_increment,
  `CodigoProduto` int(11) NOT NULL,
  `CodigoVenda` int(11) NOT NULL,
  `Quantidade` int(11) NOT NULL,
  `ValorUnitario` decimal(10,2) NOT NULL,
  PRIMARY KEY  (`Codigo`),
  KEY `FK_CodigoVenda_idx` (`CodigoVenda`),
  KEY `FK_CodigoProduto_idx` (`CodigoProduto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Extraindo dados da tabela `tbitemvenda`
--


-- --------------------------------------------------------

--
-- Estrutura da tabela `tbproduto`
--

CREATE TABLE `tbproduto` (
  `Codigo` int(11) NOT NULL auto_increment,
  `Nome` varchar(100) NOT NULL,
  `PrecoCompra` decimal(10,2) NOT NULL,
  `PrecoVenda` decimal(10,2) NOT NULL,
  `QuantidadeEstoque` int(11) NOT NULL,
  PRIMARY KEY  (`Codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Extraindo dados da tabela `tbproduto`
--


-- --------------------------------------------------------

--
-- Estrutura da tabela `tbvenda`
--

CREATE TABLE `tbvenda` (
  `Codigo` int(11) NOT NULL auto_increment,
  `CodigoCliente` int(11) NOT NULL,
  `DataVenda` date NOT NULL,
  `ValorTotal` decimal(10,2) NOT NULL,
  `Situacao` int(11) NOT NULL,
  PRIMARY KEY  (`Codigo`),
  KEY `FK_CodigoCliente_idx` (`CodigoCliente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Extraindo dados da tabela `tbvenda`
--

