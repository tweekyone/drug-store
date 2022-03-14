CREATE TABLE users (
    users_id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY ,
    name VARCHAR(15) NOT NULL ,
    password VARCHAR(20) NOT NULL ,
    role VARCHAR(10) NOT NULL
);

CREATE TABLE substance (
    substance_id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY ,
    name VARCHAR(255) NOT NULL ,
    pharm_group VARCHAR(50) NOT NULL ,
    is_vital BOOLEAN NOT NULL
);

CREATE TABLE owner_producer (
    op_id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY ,
    name VARCHAR(255) NOT NULL ,
    country VARCHAR(50) NOT NULL
);

CREATE TABLE drug (
    drug_id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY ,
    trade_name VARCHAR(255) ,
    price FLOAT ,
    margin FLOAT ,
    wholesale_margin FLOAT ,
    substance_id BIGINT NOT NULL ,
    producer_id BIGINT NOT NULL ,
    owner_id BIGINT NOT NULL ,
    balance INT NOT NULL ,
    best_before DATE ,
    series VARCHAR(255) ,
    code VARCHAR(255) ,
    certificate_number VARCHAR(20) NOT NULL,
    CONSTRAINT fc_substance FOREIGN KEY (substance_id) REFERENCES substance(substance_id) ,
    CONSTRAINT fc_producer FOREIGN KEY (producer_id) REFERENCES owner_producer(op_id) ,
    CONSTRAINT fc_owner FOREIGN KEY (owner_id) REFERENCES owner_producer(op_id)
);

