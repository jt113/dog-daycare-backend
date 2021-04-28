select * from client;
select * from dog;
select * from visit;

INSERT INTO `client` VALUES
(1, 'juan', 'trejo', '123 elm street, dallas, tx, 75252', 'juantrj@gmail.com', '2145555555', '10');

INSERT INTO `dog` VALUES
(1, 'rockypr', 'trejo', 'retriever', '', '2 cups of food', 'img.example.com/abc.jpg', 1);

INSERT INTO `visit` VALUES
(1, 1, "groom", now(), null); 