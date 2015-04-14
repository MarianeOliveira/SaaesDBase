CREATE TABLE `t200ies` (
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`nome` VARCHAR(200) NULL DEFAULT '0',
	`campus` VARCHAR(200) NULL DEFAULT '0',
	`id_t900_usuario` BIGINT(20) NULL DEFAULT '0',
	`dt_cadastro` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY (`id`),
	INDEX `FK_t300ies_t900_usuario` (`id_t900_usuario`),
	CONSTRAINT `FK_t200ies_t900_usuario` FOREIGN KEY (`id_t900_usuario`) REFERENCES `t900_usuario` (`id`)
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB;


CREATE TABLE `t300cursos` (
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`id_ies` BIGINT(20) NULL DEFAULT '0',
	`nome` VARCHAR(100) NULL DEFAULT '0',
	`carga_horaria` BIGINT(20) NULL DEFAULT '0',
	`duracao_curso` BIGINT(20) NULL DEFAULT '0',
	`num_alunos` INT(11) NULL DEFAULT '0',
	`num_disciplinas` INT(11) NULL DEFAULT '0',
	`num_egressos` INT(11) NULL DEFAULT '0',
	`num_vagas` INT(11) NULL DEFAULT '0',
	`turno` ENUM('MANHA','TARDE','NOITE','INTEGRAL') NULL DEFAULT NULL,
	`dt_cadastro` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
	`id_t900_usuario` BIGINT(20) NULL DEFAULT NULL,
	`ativo` TINYINT(4) NULL DEFAULT '0',
	PRIMARY KEY (`id`),
	INDEX `FK_t200cursos_t200ies` (`id_ies`),
	INDEX `FK_t200cursos_t900_usuario` (`id_t900_usuario`),
	CONSTRAINT `FK_t200cursos_t900_usuario` FOREIGN KEY (`id_t900_usuario`) REFERENCES `t900_usuario` (`id`),
	CONSTRAINT `FK_t200cursos_t200ies` FOREIGN KEY (`id_ies`) REFERENCES `t200ies` (`id`)
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB;



CREATE TABLE `t400docente` (
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`id_curso` BIGINT(20) NOT NULL DEFAULT '0',
	`id_t900_usuario` BIGINT(20) NULL DEFAULT '0',
	`nome` VARCHAR(100) NULL DEFAULT '0',
	`expr_coord_cur_dist` INT(11) NULL DEFAULT '0',
	`expr_prof_magist_coord` INT(11) NULL DEFAULT '0',
	`regime_trab_coord` INT(11) NULL DEFAULT '0',
	`carga_horaria` INT(11) NULL DEFAULT '0',
	`tit_corpo_docente` INT(11) NULL DEFAULT '0',
	`perc_doutores` INT(11) NULL DEFAULT '0',
	`regime_trab_docente` INT(11) NULL DEFAULT '0',
	`vinculo_trabalho` INT(11) NULL DEFAULT '0',
	`dt_admissao` DATE NULL DEFAULT NULL,
	`exp_prof_corp_docente` INT(11) NULL DEFAULT '0',
	`exp_exerc_docencia_educ` INT(11) NULL DEFAULT '0',
	`exp_magist_super_corp_docente` INT(11) NULL DEFAULT '0',
	`relac_docente_estudante` INT(11) NULL DEFAULT '0',
	`prod_cien_cult_art_tec` INT(11) NULL DEFAULT '0',
	`exp_corpo_tutores_educ_dist` INT(11) NULL DEFAULT '0',
	`relac_docente_tutor_educ_dist` INT(11) NULL DEFAULT '0',
	`respons_docente_assist_med` INT(11) NULL DEFAULT '0',
	`nucleo_apoio_exp_docente` INT(11) NULL DEFAULT '0',
	`dt_cadastro` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY (`id`, `id_curso`),
	INDEX `FK_t400docente_t300cursos` (`id_curso`),
	INDEX `FK_t400docente_t900_usuario` (`id_t900_usuario`),
	CONSTRAINT `FK_t400docente_t300cursos` FOREIGN KEY (`id_curso`) REFERENCES `t300cursos` (`id`),
	CONSTRAINT `FK_t400docente_t900_usuario` FOREIGN KEY (`id_t900_usuario`) REFERENCES `t900_usuario` (`id`)
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB;





CREATE TABLE `t500coordenador` (
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`id_curso` BIGINT(20) NOT NULL DEFAULT '0',
	`nome` VARCHAR(100) NULL DEFAULT NULL,
	`atuacao_coord` VARCHAR(100) NULL DEFAULT NULL,
	`carga_horaria` BIGINT(20) NULL DEFAULT NULL,
	`ens_dist` INT(11) NULL DEFAULT NULL,
	`ens_super` INT(11) NULL DEFAULT NULL,
	`ens_tec` INT(11) NULL DEFAULT NULL,
	`gest_academica` INT(11) NULL DEFAULT NULL,
	`regime_trab` INT(11) NULL DEFAULT NULL,
	`titulacao` INT(11) NULL DEFAULT NULL,
	`id_t900_usuario` BIGINT(20) NULL DEFAULT NULL,
	`dt_cadastro` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY (`id`, `id_curso`),
	INDEX `FK_t500Coordenador_t300cursos` (`id_curso`),
	INDEX `FK_t500coordenador_t900_usuario` (`id_t900_usuario`),
	CONSTRAINT `FK_t500coordenador_t900_usuario` FOREIGN KEY (`id_t900_usuario`) REFERENCES `t900_usuario` (`id`),
	CONSTRAINT `FK_t500Coordenador_t300cursos` FOREIGN KEY (`id_curso`) REFERENCES `t300cursos` (`id`)
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB;


CREATE TABLE `t600biografia` (
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`id_curso` BIGINT(20) NULL DEFAULT '0',
	`media_basica` INT(11) NULL DEFAULT '0',
	`media_completa` INT(11) NULL DEFAULT '0',
	`qnt_disciplina` INT(11) NULL DEFAULT '0',
	`qnt_basica` INT(11) NULL DEFAULT '0',
	`qnt_completa` INT(11) NULL DEFAULT '0',
	`periodico` INT(11) NULL DEFAULT '0',
	`id_t900_usuario` BIGINT(20) NULL DEFAULT '0',
	`dt_cadastro` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY (`id`),
	INDEX `FK_t600biografia_t300cursos` (`id_curso`),
	INDEX `FK_t600biografia_t900_usuario` (`id_t900_usuario`),
	CONSTRAINT `FK_t600biografia_t900_usuario` FOREIGN KEY (`id_t900_usuario`) REFERENCES `t900_usuario` (`id`),
	CONSTRAINT `FK_t600biografia_t300cursos` FOREIGN KEY (`id_curso`) REFERENCES `t300cursos` (`id`)
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB;


CREATE TABLE `t700avaliacao` (
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`id_t900Usuario` BIGINT(20) NOT NULL DEFAULT '0',
	`id_curso` BIGINT(20) NOT NULL DEFAULT '0',
	`id_docente` BIGINT(20) NOT NULL DEFAULT '0',
	`modalidade` INT(11) NULL DEFAULT '0',
	`tipo_ato` INT(11) NULL DEFAULT '0',
	PRIMARY KEY (`id`, `id_t900Usuario`, `id_curso`, `id_docente`),
	INDEX `FK__t900_usuario` (`id_t900Usuario`),
	INDEX `FK__t300cursos` (`id_curso`),
	INDEX `FK__t400docente` (`id_docente`),
	CONSTRAINT `FK__t400docente` FOREIGN KEY (`id_docente`) REFERENCES `t400docente` (`id`),
	CONSTRAINT `FK__t300cursos` FOREIGN KEY (`id_curso`) REFERENCES `t300cursos` (`id`),
	CONSTRAINT `FK__t900_usuario` FOREIGN KEY (`id_t900Usuario`) REFERENCES `t900_usuario` (`id`)
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB;



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

INSERT INTO `saaes`.`t901conceitos` (`id`,`descricao`) VALUES (1, 'NÃO EXISTENTE');
INSERT INTO `saaes`.`t901conceitos` (`id`,`descricao`) VALUES (2, 'INSUFICIENTE');
INSERT INTO `saaes`.`t901conceitos` (`id`,`descricao`) VALUES (3, 'SUFICIENTE');
INSERT INTO `saaes`.`t901conceitos` (`id`,`descricao`) VALUES (4, 'MUITO BOM/MUITO BEM');
INSERT INTO `saaes`.`t901conceitos` (`id`,`descricao`) VALUES (5, 'EXCELENTE');
