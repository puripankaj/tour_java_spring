DROP TABLE IF EXISTS TodoEntity;
 
CREATE TABLE TODOENTITY(
  Id INT AUTO_INCREMENT  PRIMARY KEY,
  userId VARCHAR(250) NOT NULL,
  title VARCHAR(250) NOT NULL,
  completed BOOLEAN
);
 
INSERT INTO TODOENTITY(userId, title, completed) VALUES
  ('1', 'Walking', 'false'),
  ('1', 'Running', 'true'),
  ('1', 'Throw Garbage', 'false');