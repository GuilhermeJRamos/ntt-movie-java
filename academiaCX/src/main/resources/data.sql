-- Usuários
INSERT INTO usuários (nome)
VALUES ('Guilherme'),
       ('Bernardo'),
       ('Matheus'),
       ('Rosângela'),
       ('Eliébio');

-- Gêneros
INSERT INTO gêneros (nome)
VALUES ('Aventura'),
       ('Animação'),
       ('Romance'),
       ('Fantasia'),
       ('Mistério');

-- Estúdios
INSERT INTO estúdios (país, nome)
VALUES ('Brasil', 'Vera Cruz'),
       ('Austrália', 'Koala Pictures'),
       ('Espanha', 'Iberia Films'),
       ('Índia', 'Bollywood Studios'),
       ('Coreia do Sul', 'Seoul Cinema');

-- Filmes
INSERT INTO filmes (duração, id_franchise, id_gênero, imdbid, lançado, id_estúdio, país)
VALUES (118.0, 6, 1, DEFAULT, '2022-09-30', 2, 'Austrália'),
       (142.0, 7, 4, DEFAULT, '2023-11-12', 4, 'Índia'),
       (126.0, 8, 5, DEFAULT, '2024-03-02', 1, 'Canadá'),
       (134.0, 9, 3, DEFAULT, '2023-07-19', 5, 'Coreia do Sul'),
       (150.0, 10, 2, DEFAULT, '2022-05-06', 3, 'Espanha');

--Franquias
INSERT INTO franquias (nome)
VALUES ('Piratas do Caribe'),
       ('O Senhor dos Anéis'),
       ('Velozes e Furiosos'),
       ('Toy Story'),
       ('Jurassic World');

--Diretores
INSERT INTO diretores (data_nascimento, país, nome)
VALUES ('1983-07-07', 'Reino Unido', 'Christopher Nolan'),
       ('1970-12-18', 'Canadá', 'Denis Villeneuve'),
       ('1975-03-02', 'Austrália', 'Baz Luhrmann'),
       ('1988-09-15', 'Coreia do Sul', 'Bong Joon-ho'),
       ('1978-05-20', 'Espanha', 'Guillermo del Toro');

--Atores
INSERT INTO atores (data_nascimento, país, nome)
VALUES ('1986-11-25', 'Estados Unidos', 'Emma Stone'),
       ('1979-08-08', 'Canadá', 'Ryan Reynolds'),
       ('1990-04-04', 'Reino Unido', 'Maisie Williams'),
       ('1982-06-30', 'Austrália', 'Chris Hemsworth'),
       ('1995-02-12', 'Coreia do Sul', 'Park Seo-joon');

--Streammings
INSERT INTO serviços_de_streaming (nome, url)
VALUES ('Apple TV+', 'https://www.apple.com/apple-tv-plus/'),
       ('Paramount+', 'https://www.paramountplus.com/'),
       ('Peacock', 'https://www.peacocktv.com/'),
       ('Crave', 'https://www.crave.ca/'),
       ('Mubi', 'https://mubi.com/');


