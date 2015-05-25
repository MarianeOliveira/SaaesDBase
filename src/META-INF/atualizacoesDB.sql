CREATE TABLE `t200ies` (
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`nome` VARCHAR(200) NULL DEFAULT NULL,
	`campus` VARCHAR(200) NULL DEFAULT NULL,
	`dt_cadastro` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
	`t900_usuario_id` BIGINT(20) NULL DEFAULT NULL,
	PRIMARY KEY (`id`),
	INDEX `FK_200_t900` (`t900_usuario_id`),
	CONSTRAINT `FK_t200_t900` FOREIGN KEY (`t900_usuario_id`) REFERENCES `t900usuario` (`id`)
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
AUTO_INCREMENT=6;


CREATE TABLE `t300cursos` (
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`nome` VARCHAR(100) NULL DEFAULT NULL,
	`t200_ies_id` BIGINT(20) NULL DEFAULT NULL,
	`t905_modalidade_id` INT(11) NULL DEFAULT NULL,
	`t906_tipo_ato_id` INT(11) NULL DEFAULT NULL,
	`t907_tipo_curso_id` INT(11) NULL DEFAULT NULL,
	`carga_horaria` INT(11) NULL DEFAULT NULL,
	`duracao_curso` DECIMAL(10,0) NULL DEFAULT NULL,
	`carga_horaria_estagio` INT(11) NULL DEFAULT NULL,
	`carga_horaria_libras` INT(11) NULL DEFAULT NULL,
	`carga_horaria_minima` INT(11) NULL DEFAULT NULL,
	`carga_horaria_tcc` INT(11) NULL DEFAULT NULL,
	`num_alunos_matriculados` INT(11) NULL DEFAULT NULL,
	`num_atual_matriculados_periodo` INT(11) NULL DEFAULT NULL,
	`num_egressos` INT(11) NULL DEFAULT NULL,
	`num_total_disciplinas` INT(11) NULL DEFAULT NULL,
	`num_vagas` INT(11) NULL DEFAULT NULL,
	`num_vagas_anuais` INT(11) NULL DEFAULT NULL,
	`t900_usuario_id` BIGINT(20) NULL DEFAULT NULL,
	`turno` ENUM('MANHA','TARDE','NOITE','INTEGRAL') NULL DEFAULT NULL,
	`dt_cadastro` DATETIME NULL DEFAULT NULL,
	`ativo` SMALLINT(6) NULL DEFAULT '1',
	`t300_curso_id` BIGINT(20) NULL DEFAULT NULL,
	PRIMARY KEY (`id`),
	INDEX `FK_t300_t200` (`t200_ies_id`),
	INDEX `FK_t300_t900` (`t900_usuario_id`),
	INDEX `FK_t300_t905` (`t905_modalidade_id`),
	INDEX `FK_t300_t906` (`t906_tipo_ato_id`),
	INDEX `FK_t300_t907` (`t907_tipo_curso_id`),
	INDEX `FK_arj5dl24sb18rb08wdiuxo2ix` (`t300_curso_id`),
	CONSTRAINT `FK_arj5dl24sb18rb08wdiuxo2ix` FOREIGN KEY (`t300_curso_id`) REFERENCES `t500coordenador` (`id`),
	CONSTRAINT `FK_t300_t200` FOREIGN KEY (`t200_ies_id`) REFERENCES `t200ies` (`id`),
	CONSTRAINT `FK_t300_t900` FOREIGN KEY (`t900_usuario_id`) REFERENCES `t900usuario` (`id`),
	CONSTRAINT `FK_t300_t905` FOREIGN KEY (`t905_modalidade_id`) REFERENCES `t905modalidade` (`id`),
	CONSTRAINT `FK_t300_t906` FOREIGN KEY (`t906_tipo_ato_id`) REFERENCES `t906tipoato` (`id`),
	CONSTRAINT `FK_t300_t907` FOREIGN KEY (`t907_tipo_curso_id`) REFERENCES `t907tipocurso` (`id`)
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
AUTO_INCREMENT=6;



CREATE TABLE `t400docente` (
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`nome` VARCHAR(200) NULL DEFAULT NULL,
	`qnt_alunos` INT(11) NULL DEFAULT NULL,
	`qnt_discliplinas` INT(11) NULL DEFAULT NULL,
	`qnt_media_disciplinas_dois_anos` INT(11) NULL DEFAULT NULL,
	`carga_horaria_ativ_complementar` INT(11) NULL DEFAULT NULL,
	`carga_horaria_em_aula` INT(11) NULL DEFAULT NULL,
	`carga_horaria_outros_cursos` INT(11) NULL DEFAULT NULL,
	`carga_horaria_semanal` INT(11) NULL DEFAULT NULL,
	`tempo_fora_magist` INT(11) NULL DEFAULT NULL,
	`tempo_magist_exp_educacao` INT(11) NULL DEFAULT NULL,
	`dt_admissao` DATE NULL DEFAULT NULL,
	`dt_cadastro` DATETIME NULL DEFAULT NULL,
	`artigos_publicados_area` INT(11) NULL DEFAULT NULL,
	`formacao_capacit_exper_pedagogica` ENUM('SIM','NAO') NULL DEFAULT NULL,
	`artigos_publicados_outras_areas` INT(11) NULL DEFAULT NULL,
	`livros_publicados_area` INT(11) NULL DEFAULT NULL,
	`livros_publicados_outras_areas` INT(11) NULL DEFAULT NULL,
	`prod_didatico_pedagogica` INT(11) NULL DEFAULT NULL,
	`proj_produc_tec_artisitica_cultural` INT(11) NULL DEFAULT NULL,
	`propriedade_intelectual_depositada` INT(11) NULL DEFAULT NULL,
	`propriedade_intelectual_registrada` INT(11) NULL DEFAULT NULL,
	`trabalhos_publicados_anais_completo` INT(11) NULL DEFAULT NULL,
	`trabalhos_publicados_anais_resumo` INT(11) NULL DEFAULT NULL,
	`traduc_cap_art_publicados` INT(11) NULL DEFAULT NULL,
	`pertence_nde` ENUM('SIM','NAO') NULL DEFAULT NULL,
	`t200_ies_id` BIGINT(20) NULL DEFAULT NULL,
	`t900_usuario_id` BIGINT(20) NULL DEFAULT NULL,
	`t902_titulacao_maxima_id` INT(11) NULL DEFAULT NULL,
	`t903_regime_trab_id` INT(11) NULL DEFAULT NULL,
	`t904_vinculo_empregaticio_id` INT(11) NULL DEFAULT NULL,
	PRIMARY KEY (`id`),
	INDEX `FK_t400_t200` (`t200_ies_id`),
	INDEX `FK_t400_t900` (`t900_usuario_id`),
	INDEX `FK_t400_t902` (`t902_titulacao_maxima_id`),
	INDEX `FK_t400_t903` (`t903_regime_trab_id`),
	INDEX `FK_t400_t904` (`t904_vinculo_empregaticio_id`),
	CONSTRAINT `FK_t400_t200` FOREIGN KEY (`t200_ies_id`) REFERENCES `t200ies` (`id`),
	CONSTRAINT `FK_t400_t900` FOREIGN KEY (`t900_usuario_id`) REFERENCES `t900usuario` (`id`),
	CONSTRAINT `FK_t400_t902` FOREIGN KEY (`t902_titulacao_maxima_id`) REFERENCES `t902titulacao` (`id`),
	CONSTRAINT `FK_t400_t903` FOREIGN KEY (`t903_regime_trab_id`) REFERENCES `t903regimetrabalho` (`id`),
	CONSTRAINT `FK_t400_t904` FOREIGN KEY (`t904_vinculo_empregaticio_id`) REFERENCES `t904vinculoempregaticio` (`id`)
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
AUTO_INCREMENT=10;

CREATE TABLE `t400t300docentes` (
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`dt_cadastro` DATETIME NULL DEFAULT NULL,
	`t300_curso_id` BIGINT(20) NULL DEFAULT NULL,
	`t400_docente_id` BIGINT(20) NULL DEFAULT NULL,
	PRIMARY KEY (`id`),
	INDEX `FK_t300` (`t300_curso_id`),
	INDEX `FK_t400` (`t400_docente_id`),
	CONSTRAINT `FK_t300` FOREIGN KEY (`t300_curso_id`) REFERENCES `t300cursos` (`id`),
	CONSTRAINT `FK_t400` FOREIGN KEY (`t400_docente_id`) REFERENCES `t400docente` (`id`)
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB
AUTO_INCREMENT=6;


CREATE TABLE `t500coordenador` (
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`ens_dist` ENUM('SIM','NAO') NULL DEFAULT NULL,
	`ens_super` ENUM('SIM','NAO') NULL DEFAULT NULL,
	`ens_tec` ENUM('SIM','NAO') NULL DEFAULT NULL,
	`gest_academica` INT(11) NULL DEFAULT NULL,
	`carga_horaria` INT(11) NULL DEFAULT NULL,
	`t400_docente_id` BIGINT(20) NULL DEFAULT NULL,
	`t300_curso_id` BIGINT(20) NULL DEFAULT NULL,
	`t900_usuario_id` BIGINT(20) NULL DEFAULT NULL,
	`t902_titulacao_id` INT(11) NULL DEFAULT NULL,
	`t903_regime_trab_id` INT(11) NULL DEFAULT NULL,
	`t901_conceito_id` INT(11) NULL DEFAULT NULL,
	`dt_cadastro` DATETIME NULL DEFAULT NULL,
	PRIMARY KEY (`id`),
	INDEX `FK_t500_t400` (`t400_docente_id`),
	INDEX `FK_t500_t300` (`t300_curso_id`),
	INDEX `FK_t500_t900` (`t900_usuario_id`),
	INDEX `FK_t500_t902` (`t902_titulacao_id`),
	INDEX `FK_t500_t903` (`t903_regime_trab_id`),
	INDEX `FK_t500_t901` (`t901_conceito_id`),
	CONSTRAINT `FK_t500_t300` FOREIGN KEY (`t300_curso_id`) REFERENCES `t300cursos` (`id`),
	CONSTRAINT `FK_t500_t400` FOREIGN KEY (`t400_docente_id`) REFERENCES `t400docente` (`id`),
	CONSTRAINT `FK_t500_t900` FOREIGN KEY (`t900_usuario_id`) REFERENCES `t900usuario` (`id`),
	CONSTRAINT `FK_t500_t901` FOREIGN KEY (`t901_conceito_id`) REFERENCES `t901conceitos` (`id`),
	CONSTRAINT `FK_t500_t902` FOREIGN KEY (`t902_titulacao_id`) REFERENCES `t902titulacao` (`id`),
	CONSTRAINT `FK_t500_t903` FOREIGN KEY (`t903_regime_trab_id`) REFERENCES `t903regimetrabalho` (`id`)
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
AUTO_INCREMENT=5;


CREATE TABLE `t600bibliografia` (
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`periodico` INT(11) NULL DEFAULT NULL,
	`qnt_disciplina` INT(11) NULL DEFAULT NULL,
	`qnt_basica` INT(11) NULL DEFAULT NULL,
	`qnt_completa` INT(11) NULL DEFAULT NULL,
	`media_basica` INT(11) NULL DEFAULT NULL,
	`media_completa` INT(11) NULL DEFAULT NULL,
	`t300_curso_id` BIGINT(20) NULL DEFAULT NULL,
	`t900_usuario_id` BIGINT(20) NULL DEFAULT NULL,
	`dt_cadastro` DATETIME NULL DEFAULT NULL,
	PRIMARY KEY (`id`),
	INDEX `FK_t600_t300` (`t300_curso_id`),
	INDEX `FK_t600_t900` (`t900_usuario_id`),
	CONSTRAINT `FK_t600_t300` FOREIGN KEY (`t300_curso_id`) REFERENCES `t300cursos` (`id`),
	CONSTRAINT `FK_t600_t900` FOREIGN KEY (`t900_usuario_id`) REFERENCES `t900usuario` (`id`)
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
AUTO_INCREMENT=4;



CREATE TABLE `t700avaliacao` (
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`t300_curso_id` BIGINT(20) NOT NULL,
	`t905_modalidade_id` INT(11) NULL DEFAULT NULL,
	`t906_tipo_ato_id` INT(11) NULL DEFAULT NULL,
	`conceito_ind_1` ENUM('NAO EXISTENTE','INSUFICIENTE','SUFICIENTE','MUITO BOM/MUITO BEM','EXCELENTE') NULL DEFAULT NULL,
	`conceito_ind_2` ENUM('NAO EXISTENTE','INSUFICIENTE','SUFICIENTE','MUITO BOM/MUITO BEM','EXCELENTE') NULL DEFAULT NULL,
	`conceito_ind_3` ENUM('NAO EXISTENTE','INSUFICIENTE','SUFICIENTE','MUITO BOM/MUITO BEM','EXCELENTE') NULL DEFAULT NULL,
	`conceito_ind_4` ENUM('NAO EXISTENTE','INSUFICIENTE','SUFICIENTE','MUITO BOM/MUITO BEM','EXCELENTE') NULL DEFAULT NULL,
	`conceito_ind_5` ENUM('NAO EXISTENTE','INSUFICIENTE','SUFICIENTE','MUITO BOM/MUITO BEM','EXCELENTE') NULL DEFAULT NULL,
	`conceito_ind_6` ENUM('NAO EXISTENTE','INSUFICIENTE','SUFICIENTE','MUITO BOM/MUITO BEM','EXCELENTE') NULL DEFAULT NULL,
	`conceito_ind_7` ENUM('NAO EXISTENTE','INSUFICIENTE','SUFICIENTE','MUITO BOM/MUITO BEM','EXCELENTE') NULL DEFAULT NULL,
	`conceito_ind_8` ENUM('NAO EXISTENTE','INSUFICIENTE','SUFICIENTE','MUITO BOM/MUITO BEM','EXCELENTE') NULL DEFAULT NULL,
	`conceito_ind_9` ENUM('NAO EXISTENTE','INSUFICIENTE','SUFICIENTE','MUITO BOM/MUITO BEM','EXCELENTE') NULL DEFAULT NULL,
	`conceito_ind_10` ENUM('NAO EXISTENTE','INSUFICIENTE','SUFICIENTE','MUITO BOM/MUITO BEM','EXCELENTE') NULL DEFAULT NULL,
	`conceito_ind_11` ENUM('NAO EXISTENTE','INSUFICIENTE','SUFICIENTE','MUITO BOM/MUITO BEM','EXCELENTE') NULL DEFAULT NULL,
	`conceito_ind_12` ENUM('NAO EXISTENTE','INSUFICIENTE','SUFICIENTE','MUITO BOM/MUITO BEM','EXCELENTE') NULL DEFAULT NULL,
	`conceito_ind_13` ENUM('NAO EXISTENTE','INSUFICIENTE','SUFICIENTE','MUITO BOM/MUITO BEM','EXCELENTE') NULL DEFAULT NULL,
	`conceito_ind_14` ENUM('NAO EXISTENTE','INSUFICIENTE','SUFICIENTE','MUITO BOM/MUITO BEM','EXCELENTE') NULL DEFAULT NULL,
	`conceito_ind_15` ENUM('NAO EXISTENTE','INSUFICIENTE','SUFICIENTE','MUITO BOM/MUITO BEM','EXCELENTE') NULL DEFAULT NULL,
	`t900_usuario_id` BIGINT(20) NOT NULL,
	`dt_avaliacao` DATETIME NULL DEFAULT NULL,
	PRIMARY KEY (`id`, `t300_curso_id`),
	INDEX `FK_t700_t300` (`t300_curso_id`),
	INDEX `FK_t700_t905` (`t905_modalidade_id`),
	INDEX `FK_t700_t906` (`t906_tipo_ato_id`),
	INDEX `FK_t700_t900` (`t900_usuario_id`),
	CONSTRAINT `FK_t700_t300` FOREIGN KEY (`t300_curso_id`) REFERENCES `t300cursos` (`id`),
	CONSTRAINT `FK_t700_t900` FOREIGN KEY (`t900_usuario_id`) REFERENCES `t900usuario` (`id`),
	CONSTRAINT `FK_t700_t905` FOREIGN KEY (`t905_modalidade_id`) REFERENCES `t905modalidade` (`id`),
	CONSTRAINT `FK_t700_t906` FOREIGN KEY (`t906_tipo_ato_id`) REFERENCES `t906tipoato` (`id`)
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
AUTO_INCREMENT=4;



CREATE TABLE `t900usuario` (
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`ativo` TINYINT(1) NULL DEFAULT NULL,
	`cd_usu_reg` VARCHAR(255) NULL DEFAULT NULL,
	`cpf_cnpj` VARCHAR(255) NULL DEFAULT NULL,
	`dt_fim` DATE NULL DEFAULT NULL,
	`dt_inc` DATETIME NULL DEFAULT NULL,
	`email` VARCHAR(255) NULL DEFAULT NULL,
	`nome` VARCHAR(255) NULL DEFAULT NULL,
	`senha` VARCHAR(255) NULL DEFAULT NULL,
	`telefone` DECIMAL(19,2) NULL DEFAULT NULL,
	`usuario` VARCHAR(255) NOT NULL,
	`nome_reduzido` VARCHAR(255) NULL DEFAULT NULL,
	PRIMARY KEY (`id`)
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
AUTO_INCREMENT=3;


CREATE TABLE `t901conceitos` (
	`id` INT(11) NOT NULL,
	`descricao` VARCHAR(50) NULL DEFAULT NULL,
	PRIMARY KEY (`id`)
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB;


CREATE TABLE `t902titulacao` (
	`id` INT(11) NOT NULL,
	`descricao` VARCHAR(50) NULL DEFAULT NULL,
	PRIMARY KEY (`id`)
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB;


CREATE TABLE `t903regimetrabalho` (
	`id` INT(11) NOT NULL,
	`descricao` VARCHAR(50) NULL DEFAULT NULL,
	PRIMARY KEY (`id`)
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB;

CREATE TABLE `t904vinculoempregaticio` (
	`id` INT(11) NOT NULL,
	`descricao` VARCHAR(50) NULL DEFAULT NULL,
	PRIMARY KEY (`id`)
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB;

CREATE TABLE `t905modalidade` (
	`id` INT(11) NOT NULL,
	`descricao` VARCHAR(50) NULL DEFAULT NULL,
	PRIMARY KEY (`id`)
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB;

CREATE TABLE `t906tipoAto` (
	`id` INT(11) NOT NULL,
	`descricao` VARCHAR(50) NULL DEFAULT NULL,
	PRIMARY KEY (`id`)
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB;

CREATE TABLE `t907tipoCurso` (
	`id` INT(11) NOT NULL,
	`descricao` VARCHAR(50) NULL DEFAULT NULL,
	PRIMARY KEY (`id`)
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB;

INSERT INTO `saaes`.`t907tipoCurso` (`id`,`descricao`) VALUES (1, 'BACHARELADO');
INSERT INTO `saaes`.`t907tipoCurso` (`id`,`descricao`) VALUES (2, 'LICENCIATURA');
INSERT INTO `saaes`.`t907tipoCurso` (`id`,`descricao`) VALUES (3, 'TECNOLOGO');
INSERT INTO `saaes`.`t907tipoCurso` (`id`,`descricao`) VALUES (4, 'MEDICINA');


INSERT INTO `saaes`.`t901conceitos` (`id`,`descricao`) VALUES (1, 'NÃO EXISTENTE');
INSERT INTO `saaes`.`t901conceitos` (`id`,`descricao`) VALUES (2, 'INSUFICIENTE');
INSERT INTO `saaes`.`t901conceitos` (`id`,`descricao`) VALUES (3, 'SUFICIENTE');
INSERT INTO `saaes`.`t901conceitos` (`id`,`descricao`) VALUES (4, 'MUITO BOM/MUITO BEM');
INSERT INTO `saaes`.`t901conceitos` (`id`,`descricao`) VALUES (5, 'EXCELENTE');

INSERT INTO `saaes`.`t902titulacao` (`id`, `descricao`) VALUES (1, 'GRADUAÇÃO');
INSERT INTO `saaes`.`t902titulacao` (`id`, `descricao`) VALUES (2, 'ESPECIALISTA');
INSERT INTO `saaes`.`t902titulacao` (`id`, `descricao`) VALUES (3, 'MESTRE');
INSERT INTO `saaes`.`t902titulacao` (`id`, `descricao`) VALUES (4, 'DOUTOR');


INSERT INTO `saaes`.`t903regimetrabalho` (`id`, `descricao`) VALUES (1, 'INTEGRAL');
INSERT INTO `saaes`.`t903regimetrabalho` (`id`, `descricao`) VALUES (2, 'PARCIAL');
INSERT INTO `saaes`.`t903regimetrabalho` (`id`, `descricao`) VALUES (3, 'HORISTA');

INSERT INTO `saaes`.`t904vinculoempregaticio` (`id`, `descricao`) VALUES (1, 'CLT');
INSERT INTO `saaes`.`t904vinculoempregaticio` (`id`, `descricao`) VALUES (2, 'ESTATUTARIO');
INSERT INTO `saaes`.`t904vinculoempregaticio` (`id`, `descricao`) VALUES (3, 'OUTRO');

INSERT INTO `saaes`.`t906tipoAto` (`id`,`descricao`) VALUES (1, 'AUTORIZAÇÃO');
INSERT INTO `saaes`.`t906tipoAto` (`id`,`descricao`) VALUES (2, 'RECONHECIMENTO');
INSERT INTO `saaes`.`t906tipoAto` (`id`,`descricao`) VALUES (3, 'RENOVAÇÃO');

INSERT INTO `saaes`.`t905modalidade` (`id`,`descricao`) VALUES (1, 'PRESENCIAL');
INSERT INTO `saaes`.`t905modalidade` (`id`,`descricao`) VALUES (2, 'SEMI PRESENCIAL');
INSERT INTO `saaes`.`t905modalidade` (`id`,`descricao`) VALUES (3, 'A DISTANCIA');
INSERT INTO `saaes`.`t905modalidade` (`id`,`descricao`) VALUES (4, 'MEDICINA');

-- CREATE TABLE `t910indicadores` (
-- 	`t906_tipo_ato_id` INT(11) NOT NULL,
-- 	`t905_modalidade_id` INT(11) NOT NULL,
-- 	`t907_tipo_curso_id` INT(11) NOT NULL,
-- 	`ind_2_2` VARCHAR(4) NULL DEFAULT NULL,
-- 	`ind_2_3` VARCHAR(4) NULL DEFAULT NULL,
-- 	`ind_2_4` VARCHAR(4) NULL DEFAULT NULL,
-- 	`ind_2_5` VARCHAR(4) NULL DEFAULT NULL,
-- 	`ind_2_6` VARCHAR(4) NULL DEFAULT NULL,
-- 	`ind_2_7` VARCHAR(4) NULL DEFAULT NULL,
-- 	`ind_2_8` VARCHAR(4) NULL DEFAULT NULL,
-- 	`ind_2_9` VARCHAR(4) NULL DEFAULT NULL,
-- 	`ind_2_10` VARCHAR(4) NULL DEFAULT NULL,
-- 	`ind_2_11` VARCHAR(4) NULL DEFAULT NULL,
-- 	`ind_2_12` VARCHAR(4) NULL DEFAULT NULL,
-- 	`ind_2_13` VARCHAR(4) NULL DEFAULT NULL,
-- 	`ind_2_15` VARCHAR(4) NULL DEFAULT NULL,
-- 	`ind_2_17` VARCHAR(4) NULL DEFAULT NULL,
-- 	`ind_2_18` VARCHAR(4) NULL DEFAULT NULL,
-- 	`ind_2_19` VARCHAR(4) NULL DEFAULT NULL,
-- 	`ind_2_20` VARCHAR(4) NULL DEFAULT NULL,
-- 	`ind_3_6` VARCHAR(4) NULL DEFAULT NULL,
-- 	`ind_3_7` VARCHAR(4) NULL DEFAULT NULL,
-- 	`ind_3_8` VARCHAR(4) NULL DEFAULT NULL,
-- 	PRIMARY KEY (`t906_tipo_ato_id`, `t905_modalidade_id`, `t907_tipo_curso_id`)
-- )
-- COLLATE='utf8_general_ci'
-- ENGINE=InnoDB;



-- INSERT INTO `saaes`.`t910indicadores` (`t906_tipo_ato_id`, `t905_modalidade_id`, `t907_tipo_curso_id`,`ind_2_2`,`ind_2_3`,`ind_2_4`,`ind_2_5`,`ind_2_6`,`ind_2_7`,`ind_2_8`,`ind_2_9`,`ind_2_10`,`ind_2_11`,`ind_2_12`,`ind_2_13`,`ind_2_15`,`ind_2_17`,`ind_2_18`,`ind_2_19`,`ind_2_20`,`ind_3_6`,`ind_3_7`,`ind_3_8`) VALUES (1,1,1,2.2,NULL,2.4,2.5,NULL,2.7,2.8,2.9,2.10,NULL,2.12,NULL,2.15,NULL,NULL,NULL,NULL,3.6,3.7,3.8);
-- INSERT INTO `saaes`.`t910indicadores` (`t906_tipo_ato_id`, `t905_modalidade_id`, `t907_tipo_curso_id`,`ind_2_2`,`ind_2_3`,`ind_2_4`,`ind_2_5`,`ind_2_6`,`ind_2_7`,`ind_2_8`,`ind_2_9`,`ind_2_10`,`ind_2_11`,`ind_2_12`,`ind_2_13`,`ind_2_15`,`ind_2_17`,`ind_2_18`,`ind_2_19`,`ind_2_20`,`ind_3_6`,`ind_3_7`,`ind_3_8`) VALUES (1,1,3,2.2,NULL,2.4,2.5,NULL,2.7,2.8,2.9,2.10,NULL,2.12,NULL,2.15,NULL,NULL,NULL,NULL,3.6,3.7,3.8);
-- INSERT INTO `saaes`.`t910indicadores` (`t906_tipo_ato_id`, `t905_modalidade_id`, `t907_tipo_curso_id`,`ind_2_2`,`ind_2_3`,`ind_2_4`,`ind_2_5`,`ind_2_6`,`ind_2_7`,`ind_2_8`,`ind_2_9`,`ind_2_10`,`ind_2_11`,`ind_2_12`,`ind_2_13`,`ind_2_15`,`ind_2_17`,`ind_2_18`,`ind_2_19`,`ind_2_20`,`ind_3_6`,`ind_3_7`,`ind_3_8`) VALUES (1,1,2,2.2,NULL,2.4,2.5,NULL,2.7,2.8,2.9,NULL,2.11,2.12,NULL,2.15,NULL,NULL,NULL,NULL,3.6,3.7,3.8);
-- INSERT INTO `saaes`.`t910indicadores` (`t906_tipo_ato_id`, `t905_modalidade_id`, `t907_tipo_curso_id`,`ind_2_2`,`ind_2_3`,`ind_2_4`,`ind_2_5`,`ind_2_6`,`ind_2_7`,`ind_2_8`,`ind_2_9`,`ind_2_10`,`ind_2_11`,`ind_2_12`,`ind_2_13`,`ind_2_15`,`ind_2_17`,`ind_2_18`,`ind_2_19`,`ind_2_20`,`ind_3_6`,`ind_3_7`,`ind_3_8`) VALUES (1,3,1,2.2,2.3,2.4,NULL,2.6,2.7,2.8,2.9,2.10,NULL,2.12,2.13,2.15,2.17,2.18,NULL,NULL,3.6,3.7,NULL);
-- INSERT INTO `saaes`.`t910indicadores` (`t906_tipo_ato_id`, `t905_modalidade_id`, `t907_tipo_curso_id`,`ind_2_2`,`ind_2_3`,`ind_2_4`,`ind_2_5`,`ind_2_6`,`ind_2_7`,`ind_2_8`,`ind_2_9`,`ind_2_10`,`ind_2_11`,`ind_2_12`,`ind_2_13`,`ind_2_15`,`ind_2_17`,`ind_2_18`,`ind_2_19`,`ind_2_20`,`ind_3_6`,`ind_3_7`,`ind_3_8`) VALUES (1,3,3,2.2,2.3,2.4,NULL,2.6,2.7,2.8,2.9,2.10,NULL,2.12,2.13,2.15,2.17,2.18,NULL,NULL,3.6,3.7,NULL);
-- INSERT INTO `saaes`.`t910indicadores` (`t906_tipo_ato_id`, `t905_modalidade_id`, `t907_tipo_curso_id`,`ind_2_2`,`ind_2_3`,`ind_2_4`,`ind_2_5`,`ind_2_6`,`ind_2_7`,`ind_2_8`,`ind_2_9`,`ind_2_10`,`ind_2_11`,`ind_2_12`,`ind_2_13`,`ind_2_15`,`ind_2_17`,`ind_2_18`,`ind_2_19`,`ind_2_20`,`ind_3_6`,`ind_3_7`,`ind_3_8`) VALUES (1,3,2,2.2,2.3,2.4,NULL,2.6,2.7,2.8,2.9,NULL,2.11,2.12,2.13,2.15,2.17,2.18,NULL,NULL,3.6,3.7,NULL);
-- INSERT INTO `saaes`.`t910indicadores` (`t906_tipo_ato_id`, `t905_modalidade_id`, `t907_tipo_curso_id`,`ind_2_2`,`ind_2_3`,`ind_2_4`,`ind_2_5`,`ind_2_6`,`ind_2_7`,`ind_2_8`,`ind_2_9`,`ind_2_10`,`ind_2_11`,`ind_2_12`,`ind_2_13`,`ind_2_15`,`ind_2_17`,`ind_2_18`,`ind_2_19`,`ind_2_20`,`ind_3_6`,`ind_3_7`,`ind_3_8`) VALUES (2,1,1,2.2,NULL,2.4,2.5,NULL,2.7,2.8,2.9,2.10,NULL,2.12,NULL,2.15,NULL,NULL,NULL,NULL,3.6,3.7,3.8);
-- INSERT INTO `saaes`.`t910indicadores` (`t906_tipo_ato_id`, `t905_modalidade_id`, `t907_tipo_curso_id`,`ind_2_2`,`ind_2_3`,`ind_2_4`,`ind_2_5`,`ind_2_6`,`ind_2_7`,`ind_2_8`,`ind_2_9`,`ind_2_10`,`ind_2_11`,`ind_2_12`,`ind_2_13`,`ind_2_15`,`ind_2_17`,`ind_2_18`,`ind_2_19`,`ind_2_20`,`ind_3_6`,`ind_3_7`,`ind_3_8`) VALUES (2,1,3,2.2,NULL,2.4,2.5,NULL,2.7,2.8,2.9,2.10,NULL,2.12,NULL,2.15,NULL,NULL,NULL,NULL,3.6,3.7,3.8);
-- INSERT INTO `saaes`.`t910indicadores` (`t906_tipo_ato_id`, `t905_modalidade_id`, `t907_tipo_curso_id`,`ind_2_2`,`ind_2_3`,`ind_2_4`,`ind_2_5`,`ind_2_6`,`ind_2_7`,`ind_2_8`,`ind_2_9`,`ind_2_10`,`ind_2_11`,`ind_2_12`,`ind_2_13`,`ind_2_15`,`ind_2_17`,`ind_2_18`,`ind_2_19`,`ind_2_20`,`ind_3_6`,`ind_3_7`,`ind_3_8`) VALUES (2,1,2,2.2,NULL,2.4,2.5,NULL,2.7,2.8,2.9,NULL,2.11,2.12,NULL,2.15,NULL,NULL,NULL,NULL,3.6,3.7,3.8);
-- INSERT INTO `saaes`.`t910indicadores` (`t906_tipo_ato_id`, `t905_modalidade_id`, `t907_tipo_curso_id`,`ind_2_2`,`ind_2_3`,`ind_2_4`,`ind_2_5`,`ind_2_6`,`ind_2_7`,`ind_2_8`,`ind_2_9`,`ind_2_10`,`ind_2_11`,`ind_2_12`,`ind_2_13`,`ind_2_15`,`ind_2_17`,`ind_2_18`,`ind_2_19`,`ind_2_20`,`ind_3_6`,`ind_3_7`,`ind_3_8`) VALUES (2,3,1,2.2,2.3,2.4,NULL,2.6,2.7,2.8,2.9,2.10,NULL,2.12,2.13,2.15,2.17,2.18,NULL,NULL,3.6,3.7,NULL);
-- INSERT INTO `saaes`.`t910indicadores` (`t906_tipo_ato_id`, `t905_modalidade_id`, `t907_tipo_curso_id`,`ind_2_2`,`ind_2_3`,`ind_2_4`,`ind_2_5`,`ind_2_6`,`ind_2_7`,`ind_2_8`,`ind_2_9`,`ind_2_10`,`ind_2_11`,`ind_2_12`,`ind_2_13`,`ind_2_15`,`ind_2_17`,`ind_2_18`,`ind_2_19`,`ind_2_20`,`ind_3_6`,`ind_3_7`,`ind_3_8`) VALUES (2,3,3,2.2,2.3,2.4,NULL,2.6,2.7,2.8,2.9,2.10,NULL,2.12,2.13,2.15,2.17,2.18,NULL,NULL,3.6,3.7,NULL);
-- INSERT INTO `saaes`.`t910indicadores` (`t906_tipo_ato_id`, `t905_modalidade_id`, `t907_tipo_curso_id`,`ind_2_2`,`ind_2_3`,`ind_2_4`,`ind_2_5`,`ind_2_6`,`ind_2_7`,`ind_2_8`,`ind_2_9`,`ind_2_10`,`ind_2_11`,`ind_2_12`,`ind_2_13`,`ind_2_15`,`ind_2_17`,`ind_2_18`,`ind_2_19`,`ind_2_20`,`ind_3_6`,`ind_3_7`,`ind_3_8`) VALUES (2,3,2,2.2,2.3,2.4,NULL,2.6,2.7,2.8,2.9,NULL,2.11,2.12,2.13,2.15,2.17,2.18,NULL,NULL,3.6,3.7,NULL);
-- INSERT INTO `saaes`.`t910indicadores` (`t906_tipo_ato_id`, `t905_modalidade_id`, `t907_tipo_curso_id`,`ind_2_2`,`ind_2_3`,`ind_2_4`,`ind_2_5`,`ind_2_6`,`ind_2_7`,`ind_2_8`,`ind_2_9`,`ind_2_10`,`ind_2_11`,`ind_2_12`,`ind_2_13`,`ind_2_15`,`ind_2_17`,`ind_2_18`,`ind_2_19`,`ind_2_20`,`ind_3_6`,`ind_3_7`,`ind_3_8`) VALUES (3,1,1,2.2,NULL,2.4,2.5,NULL,2.7,2.8,2.9,NULL,NULL,2.12,NULL,2.15,NULL,NULL,NULL,NULL,3.6,3.7,3.8);
-- INSERT INTO `saaes`.`t910indicadores` (`t906_tipo_ato_id`, `t905_modalidade_id`, `t907_tipo_curso_id`,`ind_2_2`,`ind_2_3`,`ind_2_4`,`ind_2_5`,`ind_2_6`,`ind_2_7`,`ind_2_8`,`ind_2_9`,`ind_2_10`,`ind_2_11`,`ind_2_12`,`ind_2_13`,`ind_2_15`,`ind_2_17`,`ind_2_18`,`ind_2_19`,`ind_2_20`,`ind_3_6`,`ind_3_7`,`ind_3_8`) VALUES (3,1,3,2.2,NULL,2.4,2.5,NULL,2.7,2.8,2.9,2.10,NULL,2.12,NULL,2.15,NULL,NULL,NULL,NULL,3.6,3.7,3.8);
-- INSERT INTO `saaes`.`t910indicadores` (`t906_tipo_ato_id`, `t905_modalidade_id`, `t907_tipo_curso_id`,`ind_2_2`,`ind_2_3`,`ind_2_4`,`ind_2_5`,`ind_2_6`,`ind_2_7`,`ind_2_8`,`ind_2_9`,`ind_2_10`,`ind_2_11`,`ind_2_12`,`ind_2_13`,`ind_2_15`,`ind_2_17`,`ind_2_18`,`ind_2_19`,`ind_2_20`,`ind_3_6`,`ind_3_7`,`ind_3_8`) VALUES (3,1,2,2.2,NULL,2.4,2.5,NULL,2.7,2.8,2.9,NULL,2.11,2.12,NULL,2.15,NULL,NULL,NULL,NULL,3.6,3.7,3.8);
-- INSERT INTO `saaes`.`t910indicadores` (`t906_tipo_ato_id`, `t905_modalidade_id`, `t907_tipo_curso_id`,`ind_2_2`,`ind_2_3`,`ind_2_4`,`ind_2_5`,`ind_2_6`,`ind_2_7`,`ind_2_8`,`ind_2_9`,`ind_2_10`,`ind_2_11`,`ind_2_12`,`ind_2_13`,`ind_2_15`,`ind_2_17`,`ind_2_18`,`ind_2_19`,`ind_2_20`,`ind_3_6`,`ind_3_7`,`ind_3_8`) VALUES (3,3,1,2.2,2.3,2.4,NULL,2.6,2.7,2.8,2.9,2.10,NULL,2.12,2.13,2.15,2.17,2.18,NULL,NULL,3.6,3.7,NULL);
-- INSERT INTO `saaes`.`t910indicadores` (`t906_tipo_ato_id`, `t905_modalidade_id`, `t907_tipo_curso_id`,`ind_2_2`,`ind_2_3`,`ind_2_4`,`ind_2_5`,`ind_2_6`,`ind_2_7`,`ind_2_8`,`ind_2_9`,`ind_2_10`,`ind_2_11`,`ind_2_12`,`ind_2_13`,`ind_2_15`,`ind_2_17`,`ind_2_18`,`ind_2_19`,`ind_2_20`,`ind_3_6`,`ind_3_7`,`ind_3_8`) VALUES (3,3,3,2.2,2.3,2.4,NULL,2.6,2.7,2.8,2.9,2.10,NULL,2.12,2.13,2.15,2.17,2.18,NULL,NULL,3.6,3.7,NULL);
-- INSERT INTO `saaes`.`t910indicadores` (`t906_tipo_ato_id`, `t905_modalidade_id`, `t907_tipo_curso_id`,`ind_2_2`,`ind_2_3`,`ind_2_4`,`ind_2_5`,`ind_2_6`,`ind_2_7`,`ind_2_8`,`ind_2_9`,`ind_2_10`,`ind_2_11`,`ind_2_12`,`ind_2_13`,`ind_2_15`,`ind_2_17`,`ind_2_18`,`ind_2_19`,`ind_2_20`,`ind_3_6`,`ind_3_7`,`ind_3_8`) VALUES (3,3,2,2.2,2.3,2.4,NULL,2.6,2.7,2.8,NULL,NULL,NULL,2.12,2.13,2.15,2.17,2.18,2.19,NULL,3.6,3.7,3.8);
-- INSERT INTO `saaes`.`t910indicadores` (`t906_tipo_ato_id`, `t905_modalidade_id`, `t907_tipo_curso_id`,`ind_2_2`,`ind_2_3`,`ind_2_4`,`ind_2_5`,`ind_2_6`,`ind_2_7`,`ind_2_8`,`ind_2_9`,`ind_2_10`,`ind_2_11`,`ind_2_12`,`ind_2_13`,`ind_2_15`,`ind_2_17`,`ind_2_18`,`ind_2_19`,`ind_2_20`,`ind_3_6`,`ind_3_7`,`ind_3_8`) VALUES (4,4,4,2.2,NULL,2.4,2.5,NULL,2.7,2.8,2.9,2.10,2.11,2.12,NULL,2.15,NULL,NULL,2.19,2.20,3.6,3.7,3.8);

CREATE TABLE `t910indicadores` (
	`t906_tipo_ato_id` INT(11) NOT NULL,
	`t905_modalidade_id` INT(11) NOT NULL,
	`t907_tipo_curso_id` INT(11) NOT NULL,
	`ind_2_2` TINYINT(1) NULL DEFAULT NULL,
	`ind_2_3` TINYINT(1) NULL DEFAULT NULL,
	`ind_2_4` TINYINT(1) NULL DEFAULT NULL,
	`ind_2_5` TINYINT(1) NULL DEFAULT NULL,
	`ind_2_6` TINYINT(1) NULL DEFAULT NULL,
	`ind_2_7` TINYINT(1) NULL DEFAULT NULL,
	`ind_2_8` TINYINT(1) NULL DEFAULT NULL,
	`ind_2_9` TINYINT(1) NULL DEFAULT NULL,
	`ind_2_10` TINYINT(1) NULL DEFAULT NULL,
	`ind_2_11` TINYINT(1) NULL DEFAULT NULL,
	`ind_2_12` TINYINT(1) NULL DEFAULT NULL,
	`ind_2_13` TINYINT(1) NULL DEFAULT NULL,
	`ind_2_15` TINYINT(1) NULL DEFAULT NULL,
	`ind_2_17` TINYINT(1) NULL DEFAULT NULL,
	`ind_2_18` TINYINT(1) NULL DEFAULT NULL,
	`ind_2_19` TINYINT(1) NULL DEFAULT NULL,
	`ind_2_20` TINYINT(1) NULL DEFAULT NULL,
	`ind_3_6` TINYINT(1) NULL DEFAULT NULL,
	`ind_3_7` TINYINT(1) NULL DEFAULT NULL,
	`ind_3_8` TINYINT(1) NULL DEFAULT NULL,
	PRIMARY KEY (`t906_tipo_ato_id`, `t905_modalidade_id`, `t907_tipo_curso_id`),
	INDEX `FK_910_905` (`t905_modalidade_id`),
	INDEX `FK_910_907` (`t907_tipo_curso_id`),
	INDEX `FK_910_906` (`t906_tipo_ato_id`),
	CONSTRAINT `FK_910_906` FOREIGN KEY (`t906_tipo_ato_id`) REFERENCES `t906tipoato` (`id`),
	CONSTRAINT `FK_910_907` FOREIGN KEY (`t907_tipo_curso_id`) REFERENCES `t907tipocurso` (`id`),
	CONSTRAINT `FK_910_905` FOREIGN KEY (`t905_modalidade_id`) REFERENCES `t905modalidade` (`id`)
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB;


INSERT INTO `saaes`.`t910indicadores` (`t906_tipo_ato_id`, `t905_modalidade_id`, `t907_tipo_curso_id`,`ind_2_2`,`ind_2_3`,`ind_2_4`,`ind_2_5`,`ind_2_6`,`ind_2_7`,`ind_2_8`,`ind_2_9`,`ind_2_10`,`ind_2_11`,`ind_2_12`,`ind_2_13`,`ind_2_15`,`ind_2_17`,`ind_2_18`,`ind_2_19`,`ind_2_20`,`ind_3_6`,`ind_3_7`,`ind_3_8`) VALUES (1,1,1,true,false,true,true,false,true,true,true,true,false,true,false,true,false,false,false,false,true,true,true);
INSERT INTO `saaes`.`t910indicadores` (`t906_tipo_ato_id`, `t905_modalidade_id`, `t907_tipo_curso_id`,`ind_2_2`,`ind_2_3`,`ind_2_4`,`ind_2_5`,`ind_2_6`,`ind_2_7`,`ind_2_8`,`ind_2_9`,`ind_2_10`,`ind_2_11`,`ind_2_12`,`ind_2_13`,`ind_2_15`,`ind_2_17`,`ind_2_18`,`ind_2_19`,`ind_2_20`,`ind_3_6`,`ind_3_7`,`ind_3_8`) VALUES (1,1,3,true,false,true,true,false,true,true,true,true,false,true,false,true,false,false,false,false,true,true,true);
INSERT INTO `saaes`.`t910indicadores` (`t906_tipo_ato_id`, `t905_modalidade_id`, `t907_tipo_curso_id`,`ind_2_2`,`ind_2_3`,`ind_2_4`,`ind_2_5`,`ind_2_6`,`ind_2_7`,`ind_2_8`,`ind_2_9`,`ind_2_10`,`ind_2_11`,`ind_2_12`,`ind_2_13`,`ind_2_15`,`ind_2_17`,`ind_2_18`,`ind_2_19`,`ind_2_20`,`ind_3_6`,`ind_3_7`,`ind_3_8`) VALUES (1,1,2,true,false,true,true,false,true,true,true,false,true,true,false,true,false,false,false,false,true,true,true);
INSERT INTO `saaes`.`t910indicadores` (`t906_tipo_ato_id`, `t905_modalidade_id`, `t907_tipo_curso_id`,`ind_2_2`,`ind_2_3`,`ind_2_4`,`ind_2_5`,`ind_2_6`,`ind_2_7`,`ind_2_8`,`ind_2_9`,`ind_2_10`,`ind_2_11`,`ind_2_12`,`ind_2_13`,`ind_2_15`,`ind_2_17`,`ind_2_18`,`ind_2_19`,`ind_2_20`,`ind_3_6`,`ind_3_7`,`ind_3_8`) VALUES (1,3,1,true,true,true,false,true,true,true,true,true,false,true,true,true,true,true,false,false,true,true,false);
INSERT INTO `saaes`.`t910indicadores` (`t906_tipo_ato_id`, `t905_modalidade_id`, `t907_tipo_curso_id`,`ind_2_2`,`ind_2_3`,`ind_2_4`,`ind_2_5`,`ind_2_6`,`ind_2_7`,`ind_2_8`,`ind_2_9`,`ind_2_10`,`ind_2_11`,`ind_2_12`,`ind_2_13`,`ind_2_15`,`ind_2_17`,`ind_2_18`,`ind_2_19`,`ind_2_20`,`ind_3_6`,`ind_3_7`,`ind_3_8`) VALUES (1,3,3,true,true,true,false,true,true,true,true,true,false,true,true,true,true,true,false,false,true,true,false);
INSERT INTO `saaes`.`t910indicadores` (`t906_tipo_ato_id`, `t905_modalidade_id`, `t907_tipo_curso_id`,`ind_2_2`,`ind_2_3`,`ind_2_4`,`ind_2_5`,`ind_2_6`,`ind_2_7`,`ind_2_8`,`ind_2_9`,`ind_2_10`,`ind_2_11`,`ind_2_12`,`ind_2_13`,`ind_2_15`,`ind_2_17`,`ind_2_18`,`ind_2_19`,`ind_2_20`,`ind_3_6`,`ind_3_7`,`ind_3_8`) VALUES (1,3,2,true,true,true,false,true,true,true,true,false,true,true,true,true,true,true,false,false,true,true,false);
INSERT INTO `saaes`.`t910indicadores` (`t906_tipo_ato_id`, `t905_modalidade_id`, `t907_tipo_curso_id`,`ind_2_2`,`ind_2_3`,`ind_2_4`,`ind_2_5`,`ind_2_6`,`ind_2_7`,`ind_2_8`,`ind_2_9`,`ind_2_10`,`ind_2_11`,`ind_2_12`,`ind_2_13`,`ind_2_15`,`ind_2_17`,`ind_2_18`,`ind_2_19`,`ind_2_20`,`ind_3_6`,`ind_3_7`,`ind_3_8`) VALUES (2,1,1,true,false,true,true,false,true,true,true,true,false,true,false,true,false,false,false,false,true,true,true);
INSERT INTO `saaes`.`t910indicadores` (`t906_tipo_ato_id`, `t905_modalidade_id`, `t907_tipo_curso_id`,`ind_2_2`,`ind_2_3`,`ind_2_4`,`ind_2_5`,`ind_2_6`,`ind_2_7`,`ind_2_8`,`ind_2_9`,`ind_2_10`,`ind_2_11`,`ind_2_12`,`ind_2_13`,`ind_2_15`,`ind_2_17`,`ind_2_18`,`ind_2_19`,`ind_2_20`,`ind_3_6`,`ind_3_7`,`ind_3_8`) VALUES (2,1,3,true,false,true,true,false,true,true,true,true,false,true,false,true,false,false,false,false,true,true,true);
INSERT INTO `saaes`.`t910indicadores` (`t906_tipo_ato_id`, `t905_modalidade_id`, `t907_tipo_curso_id`,`ind_2_2`,`ind_2_3`,`ind_2_4`,`ind_2_5`,`ind_2_6`,`ind_2_7`,`ind_2_8`,`ind_2_9`,`ind_2_10`,`ind_2_11`,`ind_2_12`,`ind_2_13`,`ind_2_15`,`ind_2_17`,`ind_2_18`,`ind_2_19`,`ind_2_20`,`ind_3_6`,`ind_3_7`,`ind_3_8`) VALUES (2,1,2,true,false,true,true,false,true,true,true,false,true,true,false,true,false,false,false,false,true,true,true);
INSERT INTO `saaes`.`t910indicadores` (`t906_tipo_ato_id`, `t905_modalidade_id`, `t907_tipo_curso_id`,`ind_2_2`,`ind_2_3`,`ind_2_4`,`ind_2_5`,`ind_2_6`,`ind_2_7`,`ind_2_8`,`ind_2_9`,`ind_2_10`,`ind_2_11`,`ind_2_12`,`ind_2_13`,`ind_2_15`,`ind_2_17`,`ind_2_18`,`ind_2_19`,`ind_2_20`,`ind_3_6`,`ind_3_7`,`ind_3_8`) VALUES (2,3,1,true,true,true,false,true,true,true,true,true,false,true,true,true,true,true,false,false,true,true,false);
INSERT INTO `saaes`.`t910indicadores` (`t906_tipo_ato_id`, `t905_modalidade_id`, `t907_tipo_curso_id`,`ind_2_2`,`ind_2_3`,`ind_2_4`,`ind_2_5`,`ind_2_6`,`ind_2_7`,`ind_2_8`,`ind_2_9`,`ind_2_10`,`ind_2_11`,`ind_2_12`,`ind_2_13`,`ind_2_15`,`ind_2_17`,`ind_2_18`,`ind_2_19`,`ind_2_20`,`ind_3_6`,`ind_3_7`,`ind_3_8`) VALUES (2,3,3,true,true,true,false,true,true,true,true,true,false,true,true,true,true,true,false,false,true,true,false);
INSERT INTO `saaes`.`t910indicadores` (`t906_tipo_ato_id`, `t905_modalidade_id`, `t907_tipo_curso_id`,`ind_2_2`,`ind_2_3`,`ind_2_4`,`ind_2_5`,`ind_2_6`,`ind_2_7`,`ind_2_8`,`ind_2_9`,`ind_2_10`,`ind_2_11`,`ind_2_12`,`ind_2_13`,`ind_2_15`,`ind_2_17`,`ind_2_18`,`ind_2_19`,`ind_2_20`,`ind_3_6`,`ind_3_7`,`ind_3_8`) VALUES (2,3,2,true,true,true,false,true,true,true,true,false,true,true,true,true,true,true,false,false,true,true,false);
INSERT INTO `saaes`.`t910indicadores` (`t906_tipo_ato_id`, `t905_modalidade_id`, `t907_tipo_curso_id`,`ind_2_2`,`ind_2_3`,`ind_2_4`,`ind_2_5`,`ind_2_6`,`ind_2_7`,`ind_2_8`,`ind_2_9`,`ind_2_10`,`ind_2_11`,`ind_2_12`,`ind_2_13`,`ind_2_15`,`ind_2_17`,`ind_2_18`,`ind_2_19`,`ind_2_20`,`ind_3_6`,`ind_3_7`,`ind_3_8`) VALUES (3,1,1,true,false,true,true,false,true,true,true,false,false,true,false,true,false,false,false,false,true,true,true);
INSERT INTO `saaes`.`t910indicadores` (`t906_tipo_ato_id`, `t905_modalidade_id`, `t907_tipo_curso_id`,`ind_2_2`,`ind_2_3`,`ind_2_4`,`ind_2_5`,`ind_2_6`,`ind_2_7`,`ind_2_8`,`ind_2_9`,`ind_2_10`,`ind_2_11`,`ind_2_12`,`ind_2_13`,`ind_2_15`,`ind_2_17`,`ind_2_18`,`ind_2_19`,`ind_2_20`,`ind_3_6`,`ind_3_7`,`ind_3_8`) VALUES (3,1,3,true,false,true,true,false,true,true,true,true,false,true,false,true,false,false,false,false,true,true,true);
INSERT INTO `saaes`.`t910indicadores` (`t906_tipo_ato_id`, `t905_modalidade_id`, `t907_tipo_curso_id`,`ind_2_2`,`ind_2_3`,`ind_2_4`,`ind_2_5`,`ind_2_6`,`ind_2_7`,`ind_2_8`,`ind_2_9`,`ind_2_10`,`ind_2_11`,`ind_2_12`,`ind_2_13`,`ind_2_15`,`ind_2_17`,`ind_2_18`,`ind_2_19`,`ind_2_20`,`ind_3_6`,`ind_3_7`,`ind_3_8`) VALUES (3,1,2,true,false,true,true,false,true,true,true,false,true,true,false,true,false,false,false,false,true,true,true);
INSERT INTO `saaes`.`t910indicadores` (`t906_tipo_ato_id`, `t905_modalidade_id`, `t907_tipo_curso_id`,`ind_2_2`,`ind_2_3`,`ind_2_4`,`ind_2_5`,`ind_2_6`,`ind_2_7`,`ind_2_8`,`ind_2_9`,`ind_2_10`,`ind_2_11`,`ind_2_12`,`ind_2_13`,`ind_2_15`,`ind_2_17`,`ind_2_18`,`ind_2_19`,`ind_2_20`,`ind_3_6`,`ind_3_7`,`ind_3_8`) VALUES (3,3,1,true,true,true,false,true,true,true,true,true,false,true,true,true,true,true,false,false,true,true,false);
INSERT INTO `saaes`.`t910indicadores` (`t906_tipo_ato_id`, `t905_modalidade_id`, `t907_tipo_curso_id`,`ind_2_2`,`ind_2_3`,`ind_2_4`,`ind_2_5`,`ind_2_6`,`ind_2_7`,`ind_2_8`,`ind_2_9`,`ind_2_10`,`ind_2_11`,`ind_2_12`,`ind_2_13`,`ind_2_15`,`ind_2_17`,`ind_2_18`,`ind_2_19`,`ind_2_20`,`ind_3_6`,`ind_3_7`,`ind_3_8`) VALUES (3,3,3,true,true,true,false,true,true,true,true,true,false,true,true,true,true,true,false,false,true,true,false);
INSERT INTO `saaes`.`t910indicadores` (`t906_tipo_ato_id`, `t905_modalidade_id`, `t907_tipo_curso_id`,`ind_2_2`,`ind_2_3`,`ind_2_4`,`ind_2_5`,`ind_2_6`,`ind_2_7`,`ind_2_8`,`ind_2_9`,`ind_2_10`,`ind_2_11`,`ind_2_12`,`ind_2_13`,`ind_2_15`,`ind_2_17`,`ind_2_18`,`ind_2_19`,`ind_2_20`,`ind_3_6`,`ind_3_7`,`ind_3_8`) VALUES (3,3,2,true,true,true,false,true,true,true,false,false,false,true,true,true,true,true,true,false,true,true,true);
INSERT INTO `saaes`.`t910indicadores` (`t906_tipo_ato_id`, `t905_modalidade_id`, `t907_tipo_curso_id`,`ind_2_2`,`ind_2_3`,`ind_2_4`,`ind_2_5`,`ind_2_6`,`ind_2_7`,`ind_2_8`,`ind_2_9`,`ind_2_10`,`ind_2_11`,`ind_2_12`,`ind_2_13`,`ind_2_15`,`ind_2_17`,`ind_2_18`,`ind_2_19`,`ind_2_20`,`ind_3_6`,`ind_3_7`,`ind_3_8`) VALUES (4,4,4,true,false,true,true,false,true,true,true,true,true,true,false,true,false,false,true,true,true,true,true);