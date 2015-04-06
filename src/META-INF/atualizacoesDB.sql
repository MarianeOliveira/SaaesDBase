CREATE TABLE `t400cursos` (
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
	`usuario_cadastro` INT(11) NULL DEFAULT NULL,
	`ativo` TINYINT(4) NULL DEFAULT '0',
	PRIMARY KEY (`id`),
	INDEX `FK_t400cursos_t300ies` (`id_ies`),
	CONSTRAINT `FK_t400cursos_t300ies` FOREIGN KEY (`id_ies`) REFERENCES `t300ies` (`id`)
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB;


CREATE TABLE `t200docente` (
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`id_curso` BIGINT(20) NOT NULL DEFAULT '0',
	`nome` VARCHAR(100) NULL DEFAULT '0',
	`expr_coord_cur_dist` INT(11) NULL DEFAULT '0',
	`expr_prof_magist_coord` INT(11) NULL DEFAULT '0',
	`regime_trab_coord` INT(11) NULL DEFAULT '0',
	`carga_horaria` INT(11) NULL DEFAULT '0',
	`tit_corpo_docente` INT(11) NULL DEFAULT '0',
	`perc_doutores` INT(11) NULL DEFAULT '0',
	`regime_trab_docente` INT(11) NULL DEFAULT '0',
	`exp_prof_corp_docente` INT(11) NULL DEFAULT '0',
	`exp_exerc_docencia_educ` INT(11) NULL DEFAULT '0',
	`exp_magist_super_corp_docente` INT(11) NULL DEFAULT '0',
	`relac_docente_estudante` INT(11) NULL DEFAULT '0',
	`prod_cien_cult_art_tec` INT(11) NULL DEFAULT '0',
	`exp_corpo_tutores_educ_dist` INT(11) NULL DEFAULT '0',
	`relac_docente_tutor_educ_dist` INT(11) NULL DEFAULT '0',
	`respons_docente_assist_med` INT(11) NULL DEFAULT '0',
	`nucleo_apoio_exp_docente` INT(11) NULL DEFAULT '0',
	`usuario_cadastro` INT(11) NULL DEFAULT '0',
	`dt_cadastro` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY (`id`, `id_curso`),
	INDEX `FK_t200docente_t400cursos` (`id_curso`),
	CONSTRAINT `FK_t200docente_t400cursos` FOREIGN KEY (`id_curso`) REFERENCES `t400cursos` (`id`)
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB;

CREATE TABLE `t100avaliacao` (
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`id_t900Usuario` BIGINT(20) NOT NULL DEFAULT '0',
	`id_curso` BIGINT(20) NOT NULL DEFAULT '0',
	`id_docente` BIGINT(20) NOT NULL DEFAULT '0',
	`modalidade` INT(11) NULL DEFAULT '0',
	`tipo_ato` INT(11) NULL DEFAULT '0',
	PRIMARY KEY (`id`, `id_t900Usuario`, `id_curso`, `id_docente`),
	INDEX `FK__t900_usuario` (`id_t900Usuario`),
	INDEX `FK__t400cursos` (`id_curso`),
	INDEX `FK__t200docente` (`id_docente`),
	CONSTRAINT `FK__t200docente` FOREIGN KEY (`id_docente`) REFERENCES `t200docente` (`id`),
	CONSTRAINT `FK__t400cursos` FOREIGN KEY (`id_curso`) REFERENCES `t400cursos` (`id`),
	CONSTRAINT `FK__t900_usuario` FOREIGN KEY (`id_t900Usuario`) REFERENCES `t900_usuario` (`id`)
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB;


CREATE TABLE `t201coordenador` (
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
	`usuario_cadastro` INT(11) NULL DEFAULT NULL,
	`dt_cadastro` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY (`id`, `id_curso`),
	INDEX `FK_t201Coordenador_t400cursos` (`id_curso`),
	CONSTRAINT `FK_t201Coordenador_t400cursos` FOREIGN KEY (`id_curso`) REFERENCES `t400cursos` (`id`)
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB;


CREATE TABLE `t300ies` (
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`nome` VARCHAR(200) NULL DEFAULT '0',
	`campus` VARCHAR(200) NULL DEFAULT '0',
	`usuario_cadastro` INT(11) NULL DEFAULT '0',
	`dt_cadastro` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY (`id`)
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB
AUTO_INCREMENT=2;



CREATE TABLE `t500biografia` (
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`id_curso` BIGINT(20) NULL DEFAULT '0',
	`media_basica` INT(11) NULL DEFAULT '0',
	`media_completa` INT(11) NULL DEFAULT '0',
	`qnt_disciplina` INT(11) NULL DEFAULT '0',
	`qnt_basica` INT(11) NULL DEFAULT '0',
	`qnt_completa` INT(11) NULL DEFAULT '0',
	`periodico` INT(11) NULL DEFAULT '0',
	`usuario_cadastro` INT(11) NULL DEFAULT '0',
	`dt_cadastro` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY (`id`),
	INDEX `FK_t500biografia_t400cursos` (`id_curso`),
	CONSTRAINT `FK_t500biografia_t400cursos` FOREIGN KEY (`id_curso`) REFERENCES `t400cursos` (`id`)
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB;



CREATE TABLE `t901conceitos` (
	`id` INT(11) NOT NULL DEFAULT '0',
	`descricao` VARCHAR(50) NULL DEFAULT NULL,
	PRIMARY KEY (`id`)
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB;


INSERT INTO `saaes`.`t901conceitos` (`id`,`descricao`) VALUES (1, 'NÃO EXISTENTE');
INSERT INTO `saaes`.`t901conceitos` (`id`,`descricao`) VALUES (2, 'INSUFICIENTE');
INSERT INTO `saaes`.`t901conceitos` (`id`,`descricao`) VALUES (3, 'SUFICIENTE');
INSERT INTO `saaes`.`t901conceitos` (`id`,`descricao`) VALUES (4, 'MUITO BOM/MUITO BEM');
INSERT INTO `saaes`.`t901conceitos` (`id`,`descricao`) VALUES (5, 'EXCELENTE');
