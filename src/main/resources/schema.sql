
DROP TABLE IF EXISTS tournament_participants;
DROP TABLE IF EXISTS tournament;
DROP TABLE IF EXISTS member;


CREATE TABLE member (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    address VARCHAR(255),
    email VARCHAR(100) UNIQUE,
    phone_number VARCHAR(15),
    start_date DATE,
    membership_duration INT
);


CREATE TABLE tournament (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    start_date DATE,
    end_date DATE,
    location VARCHAR(255),
    entry_fee DECIMAL(10, 2),
    cash_prize DECIMAL(10, 2)
);


CREATE TABLE tournament_participants (
    participant_id INT AUTO_INCREMENT PRIMARY KEY,
    tournament_id BIGINT,
    member_id BIGINT,
    FOREIGN KEY (tournament_id) REFERENCES tournament(id),
    FOREIGN KEY (member_id) REFERENCES member(id)
);
