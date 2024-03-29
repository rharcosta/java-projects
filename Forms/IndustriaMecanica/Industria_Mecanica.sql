-- phpMyAdmin SQL Dump
-- version 2.11.0
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tempo de Geração: Ago 01, 2018 as 02:31 PM
-- Versão do Servidor: 5.0.45
-- Versão do PHP: 5.2.4

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

--
-- Banco de Dados: `Industria_Mecanica`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cad_clientes`
--

CREATE TABLE `cad_clientes` (
  `Codigo` int(11) NOT NULL,
  `Nome` varchar(100) NOT NULL,
  `Data_Nasc` varchar(10) NOT NULL,
  `Sexo` varchar(30) NOT NULL,
  `RG` varchar(20) NOT NULL,
  `CPF` varchar(14) NOT NULL,
  `CEP` varchar(10) NOT NULL,
  `Rua` varchar(100) NOT NULL,
  `Numero` int(11) NOT NULL,
  `Bairro` varchar(100) NOT NULL,
  `Complemento` varchar(100) NOT NULL,
  `Cidade` varchar(100) NOT NULL,
  `Estado` varchar(100) NOT NULL,
  `Telefone` varchar(20) NOT NULL,
  `Celular` varchar(20) NOT NULL,
  `Email` varchar(100) NOT NULL,
  PRIMARY KEY  (`CPF`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cad_clientes`
--


-- --------------------------------------------------------

--
-- Estrutura da tabela `cad_fornecedores`
--

CREATE TABLE `cad_fornecedores` (
  `Codigo` int(11) NOT NULL,
  `Empresa` varchar(100) NOT NULL,
  `Departamento` varchar(100) NOT NULL,
  `Responsavel` varchar(100) NOT NULL,
  `Cidade` varchar(100) NOT NULL,
  `Estado` varchar(100) NOT NULL,
  `CEP` varchar(100) NOT NULL,
  `Rua` varchar(100) NOT NULL,
  `Numero` int(11) NOT NULL,
  `Bairro` varchar(100) NOT NULL,
  `Complemento` varchar(100) NOT NULL,
  `Telefone` varchar(100) NOT NULL,
  `Celular` varchar(100) NOT NULL,
  `Email` varchar(100) NOT NULL,
  PRIMARY KEY  (`Codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cad_fornecedores`
--


-- --------------------------------------------------------

--
-- Estrutura da tabela `cad_funcionarios`
--

CREATE TABLE `cad_funcionarios` (
  `Nome` varchar(100) NOT NULL,
  `Departamento` varchar(100) NOT NULL,
  `Sexo` varchar(100) NOT NULL,
  `RG` varchar(100) NOT NULL,
  `CPF` varchar(100) NOT NULL,
  `Cidade` varchar(100) NOT NULL,
  `Estado` varchar(100) NOT NULL,
  `CEP` varchar(100) NOT NULL,
  `Rua` varchar(100) NOT NULL,
  `Numero` int(11) NOT NULL,
  `Bairro` varchar(100) NOT NULL,
  `Complemento` varchar(100) NOT NULL,
  `Telefone` varchar(20) NOT NULL,
  `Celular` varchar(20) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `DataAdm` varchar(10) NOT NULL,
  `Renda` varchar(100) NOT NULL,
  `Salario` varchar(100) NOT NULL,
  `Comissao` varchar(100) NOT NULL,
  PRIMARY KEY  (`RG`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cad_funcionarios`
--


-- --------------------------------------------------------

--
-- Estrutura da tabela `cad_produtos`
--

CREATE TABLE `cad_produtos` (
  `Codigo` int(11) NOT NULL,
  `CodForn` int(11) NOT NULL,
  `Produto` varchar(100) NOT NULL,
  `Descricao` varchar(100) NOT NULL,
  `Fabricacao` varchar(10) NOT NULL,
  `Validade` varchar(10) NOT NULL,
  `Unidade` int(11) NOT NULL,
  `Categoria` varchar(100) NOT NULL,
  `Fornecedor` varchar(100) NOT NULL,
  `Valor` varchar(100) NOT NULL,
  PRIMARY KEY  (`Codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cad_produtos`
--


-- --------------------------------------------------------

--
-- Estrutura da tabela `cad_transportadora`
--

CREATE TABLE `cad_transportadora` (
  `Codigo` int(11) NOT NULL,
  `Nome` varchar(100) NOT NULL,
  `CNPJ` varchar(100) NOT NULL,
  `Departamento` varchar(100) NOT NULL,
  `Cidade` varchar(100) NOT NULL,
  `Estado` varchar(100) NOT NULL,
  `CEP` varchar(10) NOT NULL,
  `Rua` varchar(100) NOT NULL,
  `Numero` varchar(5) NOT NULL,
  `Bairro` varchar(100) NOT NULL,
  `Complemento` varchar(100) NOT NULL,
  `Telefone` varchar(20) NOT NULL,
  `Celular` varchar(20) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `ValorKm` varchar(100) NOT NULL,
  PRIMARY KEY  (`Codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cad_transportadora`
--


-- --------------------------------------------------------

--
-- Estrutura da tabela `login`
--

CREATE TABLE `login` (
  `Codigo` int(11) NOT NULL,
  `Usuario` varchar(100) NOT NULL,
  `Senha` varchar(100) NOT NULL,
  PRIMARY KEY  (`Codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `login`
--

