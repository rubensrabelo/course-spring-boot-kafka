CREATE TABLE IF NOT EXISTS clients (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(150) NOT NULL,
    cpf VARCHAR(11) NOT NULL,
    street VARCHAR(100),
    number VARCHAR(10),
    neighborhood VARCHAR(100),
    email VARCHAR(150),
    phone VARCHAR(20),
    is_active BOOLEAN DEFAULT TRUE NOT NULL
);