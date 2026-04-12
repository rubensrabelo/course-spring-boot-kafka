CREATE TABLE IF NOT EXISTS orders (
    id SERIAL PRIMARY KEY,
    id_client BIGINT NOT NULL,
    order_date TIMESTAMP NOT NULL,
    total NUMERIC(16,2) NOT NULL,
    payment_key VARCHAR(255),
    observations TEXT,
    status VARCHAR(50) NOT NULL,
    tracking_code VARCHAR(100),
    url_invoice VARCHAR(255)
);