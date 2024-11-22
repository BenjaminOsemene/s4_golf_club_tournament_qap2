
INSERT INTO member (name, address, email, phone_number, start_date, membership_duration)
VALUES
    ('John Doe', '123 Golf St, City', 'john.doe@email.com', '555-0101', '2023-01-15', 12),
    ('Jane Smith', '456 Fairway Ave, Town', 'jane.smith@email.com', '555-0202', '2023-02-20', 6),
    ('Mike Johnson', '789 Putt Lane, Village', 'mike.johnson@email.com', '555-0303', '2023-03-10', 24),
    ('Emily Brown', '321 Birdie Rd, County', 'emily.brown@email.com', '555-0404', '2023-04-05', 12),
    ('David Wilson', '654 Eagle Dr, State', 'david.wilson@email.com', '555-0505', '2023-05-12', 6),
    ('Sarah Davis', '987 Bogey Blvd, Country', 'sarah.davis@email.com', '555-0606', '2023-06-18', 12),
    ('Tom White', '159 Par Court, Province', 'tom.white@email.com', '555-0707', '2023-07-22', 24);


INSERT INTO tournament (name, start_date, end_date, location, entry_fee, cash_prize_amount)
VALUES
    ('Spring Classic', '2024-04-15', '2024-04-17', 'Greenfield Golf Club', 150.00, 5000.00),
    ('Summer Open', '2024-07-20', '2024-07-22', 'Sunny Meadows Golf Resort', 200.00, 7500.00),
    ('Fall Championship', '2024-09-10', '2024-09-12', 'Autumn Links Golf Course', 250.00, 10000.00),
    ('Winter Challenge', '2025-01-05', '2025-01-07', 'Frostbite Valley Golf Club', 175.00, 6000.00),
    ('Masters Pro-Am', '2024-05-01', '2024-05-03', 'Elite Greens Country Club', 500.00, 25000.00),
    ('Charity Golf Classic', '2024-08-15', '2024-08-16', 'Community Golf Links', 100.00, 2000.00),
    ('Senior Golf Cup', '2024-06-10', '2024-06-12', 'Golden Age Golf Resort', 125.00, 4000.00);


INSERT INTO tournament_participants (tournament_id, member_id)
VALUES
    (1, 1),
    (1, 2),
    (2, 3),
    (2, 4),
    (3, 5),
    (4, 6),
    (5, 7);


