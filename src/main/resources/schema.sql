CREATE TABLE groups (
    group_id VARCHAR(255) PRIMARY KEY,
    group_name VARCHAR(255) NOT NULL,
    member VARCHAR(255),
    description VARCHAR(255) NOT NULL,
    admin VARCHAR(255)
);
