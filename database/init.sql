CREATE TABLE system_property
(
    name  VARCHAR(100) PRIMARY KEY,
    value VARCHAR(1000) NOT NULL
);

INSERT INTO system_property(name, value)
VALUES ('count','0');