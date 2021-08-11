INSERT INTO invoice (id, comment, data, is_spend, type_of_invoice, company_id, contractor_id, warehouse_id)
VALUES (1, 'Комментарий 0', '2021-08-10 09:03:49.618745', false, 1, 1, 1, 1),
       (2, 'Комментарий 1', '2021-08-10 09:03:49.647741', false, 1, 1, 1, 2),
       (3, 'Комментарий 2', '2021-08-10 09:03:49.649740', false, 1, 1, 1, 3),
       (4, 'Комментарий 3', '2021-08-10 09:03:49.652745', false, 1, 1, 2, 1),
       (5, 'Комментарий 4', '2021-08-10 09:03:49.654741', false, 1, 1, 2, 2),
       (6, 'Комментарий 5', '2021-08-10 09:03:49.655741', false, 1, 1, 2, 3),
       (7, 'Комментарий 6', '2021-08-10 09:03:49.656739', false, 0, 1, 3, 1),
       (8, 'Комментарий 7', '2021-08-10 09:03:49.659738', false, 1, 1, 3, 2),
       (9, 'Комментарий 8', '2021-08-10 09:03:49.660738', false, 1, 1, 3, 3),
       (10, 'Комментарий 9', '2021-08-10 09:03:49.662743', false, 1, 2, 1, 1),
       (11, 'Комментарий 10', '2021-08-10 09:03:49.663739', false, 0, 2, 1, 2),
       (12, 'Комментарий 11', '2021-08-10 09:03:49.666746', false, 1, 2, 1, 3),
       (13, 'Комментарий 12', '2021-08-10 09:03:49.667739', false, 1, 2, 2, 1),
       (14, 'Комментарий 13', '2021-08-10 09:03:49.668744', false, 1, 2, 2, 2),
       (15, 'Комментарий 14', '2021-08-10 09:03:49.670740', false, 0, 2, 2, 3),
       (16, 'Комментарий 15', '2021-08-10 09:03:49.673743', false, 1, 2, 3, 1),
       (17, 'Комментарий 16', '2021-08-10 09:03:49.675737', false, 1, 2, 3, 2),
       (18, 'Комментарий 17', '2021-08-10 09:03:49.676741', false, 1, 2, 3, 3),
       (19, 'Комментарий 18', '2021-08-10 09:03:49.677743', false, 0, 3, 1, 1),
       (20, 'Комментарий 19', '2021-08-10 09:03:49.680740', false, 0, 3, 1, 2),
       (21, 'Комментарий 20', '2021-08-10 09:03:49.681739', false, 0, 3, 1, 3),
       (22, 'Комментарий 21', '2021-08-10 09:03:49.683742', false, 0, 3, 2, 1),
       (23, 'Комментарий 22', '2021-08-10 09:03:49.684742', false, 1, 3, 2, 2),
       (24, 'Комментарий 23', '2021-08-10 09:03:49.687738', false, 1, 3, 2, 3),
       (25, 'Комментарий 24', '2021-08-10 09:03:49.689739', false, 0, 3, 3, 1),
       (26, 'Комментарий 25', '2021-08-10 09:03:49.690738', false, 1, 3, 3, 2),
       (27, 'Комментарий 26', '2021-08-10 09:03:49.691738', false, 0, 3, 3, 3);
SELECT setval('invoice_id_seq', max(id))
FROM invoice