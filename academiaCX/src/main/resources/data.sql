-- Usuários
INSERT INTO users (name)
VALUES ('Guilherme'),
       ('Bernardo'),
       ('Matheus'),
       ('Rosângela'),
       ('Eliébio');

-- Gêneros
INSERT INTO genres (name)
VALUES ('Aventura'),
       ('Animação'),
       ('Romance'),
       ('Fantasia'),
       ('Mistério');

-- Estúdios
INSERT INTO studios (country, name)
VALUES ('Brasil', 'Vera Cruz'),
       ('Austrália', 'Koala Pictures'),
       ('Espanha', 'Iberia Films'),
       ('Índia', 'Bollywood Studios'),
       ('Coreia do Sul', 'Seoul Cinema');

-- Filmes
INSERT INTO movies (runtime, franchise_id, genre_id, imdbid, released, studio_id, country, language, awards, poster,
                    title, plot)
VALUES (118.0, 6, 1, DEFAULT, '2022-09-30', 2, 'Austrália', 'Inglês', 'Prêmio de Melhor Filme Estrangeiro',
        'https://example.com/poster6.jpg', 'Lost in Sydney',
        'Um casal se perde nas ruas de Sydney durante uma viagem de férias.'),
       (142.0, 7, 4, DEFAULT, '2023-11-12', 4, 'Índia', 'Hindi', 'Prêmio de Melhor Filme Estrangeiro',
        'https://example.com/poster7.jpg', 'Maharaja: The Legend Begins',
        'A história épica de um príncipe indiano lutando pela justiça e amor.'),
       (126.0, 8, 5, DEFAULT, '2024-03-02', 1, 'Canadá', 'Inglês', 'Indicação ao Globo de Ouro de Melhor Atriz',
        'https://example.com/poster8.jpg', 'The Secret Garden',
        'Uma menina descobre um jardim mágico escondido em sua casa de campo.'),
       (134.0, 9, 3, DEFAULT, '2023-07-19', 5, 'Coreia do Sul', 'Coreano', 'Prêmio de Melhor Direção de Arte',
        'https://example.com/poster9.jpg', 'Moonlit Sonata',
        'Um músico de rua e uma bailarina se apaixonam em Seul sob a luz do luar.'),
       (150.0, 10, 2, DEFAULT, '2022-05-06', 3, 'Espanha', 'Espanhol', 'Prêmio Goya de Melhor Direção',
        'https://example.com/poster10.jpg', 'La Casa del Mar',
        'Um drama romântico ambientado em uma remota vila de pescadores espanhola.');

--Franquias
INSERT INTO franchises (name)
VALUES ('Piratas do Caribe'),
       ('O Senhor dos Anéis'),
       ('Velozes e Furiosos'),
       ('Toy Story'),
       ('Jurassic World');

--Diretores
INSERT INTO directors (birthdate, country, name)
VALUES ('1983-07-07', 'Reino Unido', 'Christopher Nolan'),
       ('1970-12-18', 'Canadá', 'Denis Villeneuve'),
       ('1975-03-02', 'Austrália', 'Baz Luhrmann'),
       ('1988-09-15', 'Coreia do Sul', 'Bong Joon-ho'),
       ('1978-05-20', 'Espanha', 'Guillermo del Toro');

--Atores
INSERT INTO directors (birthdate, country, name)
VALUES ('1986-11-25', 'Estados Unidos', 'Emma Stone'),
       ('1979-08-08', 'Canadá', 'Ryan Reynolds'),
       ('1990-04-04', 'Reino Unido', 'Maisie Williams'),
       ('1982-06-30', 'Austrália', 'Chris Hemsworth'),
       ('1995-02-12', 'Coreia do Sul', 'Park Seo-joon');

--Streammings
INSERT INTO streammings (name, url)
VALUES ('Apple TV+', 'https://www.apple.com/apple-tv-plus/'),
       ('Paramount+', 'https://www.paramountplus.com/'),
       ('Peacock', 'https://www.peacocktv.com/'),
       ('Crave', 'https://www.crave.ca/'),
       ('Mubi', 'https://mubi.com/');


