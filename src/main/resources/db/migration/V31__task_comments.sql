INSERT INTO task_comment (id, comment, published_date_time, publisher_id, task_id)
VALUES (1, 'Комментарий к задаче 2. Комментарий номер 0', '2021-06-14 18:03:48.000000', 3, 2),
       (2, 'Комментарий к задаче 2. Комментарий номер 1', '2021-06-14 17:03:48.000000', 3, 2),
       (3, 'Комментарий к задаче 2. Комментарий номер 2', '2021-06-15 04:03:48.000000', 2, 2),
       (4, 'Комментарий к задаче 2. Комментарий номер 3', '2021-06-14 19:03:48.000000', 4, 2),
       (5, 'Комментарий к задаче 4. Комментарий номер 0', '2021-06-28 03:03:48.000000', 3, 4),
       (6, 'Комментарий к задаче 4. Комментарий номер 1', '2021-06-27 16:03:48.000000', 1, 4),
       (7, 'Комментарий к задаче 4. Комментарий номер 2', '2021-06-28 09:03:48.000000', 1, 4),
       (8, 'Комментарий к задаче 4. Комментарий номер 3', '2021-06-27 09:03:48.000000', 3, 4),
       (9, 'Комментарий к задаче 5. Комментарий номер 0', '2021-05-05 00:03:48.000000', 5, 5),
       (10, 'Комментарий к задаче 5. Комментарий номер 1', '2021-05-04 18:03:48.000000', 3, 5),
       (11, 'Комментарий к задаче 7. Комментарий номер 0', '2021-07-20 14:03:48.000000', 1, 7),
       (12, 'Комментарий к задаче 7. Комментарий номер 1', '2021-07-21 07:03:48.000000', 4, 7),
       (13, 'Комментарий к задаче 7. Комментарий номер 2', '2021-07-20 23:03:48.000000', 1, 7),
       (14, 'Комментарий к задаче 9. Комментарий номер 0', '2021-05-22 11:03:48.000000', 5, 9),
       (15, 'Комментарий к задаче 16. Комментарий номер 0', '2021-07-01 02:03:48.000000', 3, 16),
       (16, 'Комментарий к задаче 16. Комментарий номер 1', '2021-06-30 10:03:48.000000', 3, 16),
       (17, 'Комментарий к задаче 16. Комментарий номер 2', '2021-06-30 22:03:48.000000', 4, 16),
       (18, 'Комментарий к задаче 17. Комментарий номер 0', '2021-08-04 03:03:48.000000', 3, 17),
       (19, 'Комментарий к задаче 17. Комментарий номер 1', '2021-08-03 12:03:48.000000', 5, 17),
       (20, 'Комментарий к задаче 18. Комментарий номер 0', '2021-06-14 15:03:48.000000', 3, 18),
       (21, 'Комментарий к задаче 18. Комментарий номер 1', '2021-06-14 22:03:48.000000', 4, 18),
       (22, 'Комментарий к задаче 18. Комментарий номер 2', '2021-06-15 06:03:48.000000', 3, 18);
SELECT setval('task_comment_id_seq', max(id))
FROM task_comment