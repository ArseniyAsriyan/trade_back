INSERT INTO task (id, completed, creation_date_time, deadline_date_time, description, task_author_id,
                  task_employee_id)
VALUES (1, true, '2021-07-31 09:03:48.000000', '2021-09-24 09:03:48.000000', 'Описание задачи номер 0.', 5, 4),
       (2, true, '2021-06-14 09:03:48.000000', '2021-10-24 09:03:48.000000', 'Описание задачи номер 1.', 2, 4),
       (3, true, '2021-05-23 09:03:48.000000', '2021-09-29 09:03:48.000000', 'Описание задачи номер 2.', 1, 1),
       (4, true, '2021-06-27 09:03:48.000000', '2021-10-19 09:03:48.000000', 'Описание задачи номер 3.', 3, 3),
       (5, true, '2021-05-04 09:03:48.000000', '2021-08-23 09:03:48.000000', 'Описание задачи номер 4.', 3, 4),
       (6, true, '2021-06-06 09:03:48.000000', '2021-10-22 09:03:48.000000', 'Описание задачи номер 5.', 1, 5),
       (7, false, '2021-07-20 09:03:48.000000', '2021-11-01 09:03:48.000000', 'Описание задачи номер 6.', 4, 3),
       (8, true, '2021-07-06 09:03:48.000000', '2021-11-16 09:03:48.000000', 'Описание задачи номер 7.', 5, 3),
       (9, false, '2021-05-22 09:03:48.000000', '2021-10-25 09:03:48.000000', 'Описание задачи номер 8.', 5, 5),
       (10, true, '2021-07-21 09:03:48.000000', '2021-08-26 09:03:48.000000', 'Описание задачи номер 9.', 4, 1),
       (11, false, '2021-07-26 09:03:48.000000', '2021-10-16 09:03:48.000000', 'Описание задачи номер 10.', 4, 1),
       (12, false, '2021-06-04 09:03:48.000000', '2021-08-18 09:03:48.000000', 'Описание задачи номер 11.', 1, 5),
       (13, false, '2021-07-07 09:03:48.000000', '2021-08-30 09:03:48.000000', 'Описание задачи номер 12.', 2, 2),
       (14, true, '2021-05-29 09:03:48.000000', '2021-09-15 09:03:48.000000', 'Описание задачи номер 13.', 3, 3),
       (15, false, '2021-05-26 09:03:48.000000', '2021-09-27 09:03:48.000000', 'Описание задачи номер 14.', 2, 3),
       (16, true, '2021-06-30 09:03:48.000000', '2021-08-16 09:03:48.000000', 'Описание задачи номер 15.', 1, 3),
       (17, true, '2021-08-03 09:03:48.000000', '2021-09-27 09:03:48.000000', 'Описание задачи номер 16.', 5, 4),
       (18, true, '2021-06-14 09:03:48.000000', '2021-11-14 09:03:48.000000', 'Описание задачи номер 17.', 2, 3),
       (19, true, '2021-07-22 09:03:48.000000', '2021-10-11 09:03:48.000000', 'Описание задачи номер 18.', 1, 2),
       (20, true, '2021-06-16 09:03:48.000000', '2021-08-28 09:03:48.000000', 'Описание задачи номер 19.', 5, 5);
SELECT setval('task_id_seq', max(id))
FROM task