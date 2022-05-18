create schema topicos;
use topicos;

CREATE TABLE pessoa(
        id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
        nome VARCHAR(255),
        email VARCHAR(255)
    );