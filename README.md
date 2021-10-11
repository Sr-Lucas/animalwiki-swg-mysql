# animalwiki-swg-mysql

# Trabalho para Laboratório de programação

## SCRIP MYSQL:

```
CREATE DATABASE dbanimals;

USE dbanimals;

CREATE TABLE especies (
    descricao VARCHAR(255),
    CONSTRAINT pkdesc PRIMARY KEY (descricao)
);

CREATE TABLE animals (
    codigo INT UNSIGNED AUTO_INCREMENT,
    tempoDeVida VARCHAR(255),
    detalhes VARCHAR(1500),
    habitat VARCHAR(300),
    especieCod VARCHAR(255),
    CONSTRAINT codigopk PRIMARY KEY (codigo),
    CONSTRAINT especiefk FOREIGN KEY (especieCod) REFERENCES especies(descricao)
);


INSERT INTO especies (descricao) VALUES ('Especie mock 1'),
                                        ('Especie mock 2'),
                                        ('Especie mock 3'),
                                        ('Especie mock 4');

```
