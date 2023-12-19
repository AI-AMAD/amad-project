CREATE TABLE `test_table` (
  `id` int NOT NULL,
  `mb_id` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

insert into test_table (`id`, `mb_id`) values (111, 'aaa');
insert into test_table (`id`, `mb_id`) values (222, 'bbb');
insert into test_table (`id`, `mb_id`) values (333, 'ccc');
