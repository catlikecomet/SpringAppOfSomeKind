--Create some quizzes

INSERT INTO quiz_reference (quiz_name) VALUES ('Quiz one');
INSERT INTO quiz_reference (quiz_name) VALUES ('Quiz two');
INSERT INTO quiz_reference (quiz_name) VALUES ('Quiz three');
INSERT INTO quiz_reference (quiz_name) VALUES ('Quiz four');
INSERT INTO quiz_reference (quiz_name) VALUES ('Quiz five');

--Create some questions

INSERT INTO quiz_questions (quizId, questionDescription) VALUES (1, 'test one');
INSERT INTO quiz_questions (quizId, questionDescription) VALUES (2, 'test two');
INSERT INTO quiz_questions (quizId, questionDescription) VALUES (3, 'test tgree');
INSERT INTO quiz_questions (quizId, questionDescription) VALUES (4, 'test fd');
INSERT INTO quiz_questions (quizId, questionDescription) VALUES (5, 'test asd');
INSERT INTO quiz_questions (quizId, questionDescription) VALUES (5, 'test vd');
INSERT INTO quiz_questions (quizId, questionDescription) VALUES (5, 'test v');

--Create some answers

INSERT INTO quiz_answers (questionId, answerDescription) VALUES (1, 'test test fgb');
INSERT INTO quiz_answers (questionId, answerDescription) VALUES (2, 'test test fb');
INSERT INTO quiz_answers (questionId, answerDescription) VALUES (3, 'test test c');
INSERT INTO quiz_answers (questionId, answerDescription) VALUES (4, 'test test x');
INSERT INTO quiz_answers (questionId, answerDescription) VALUES (5, 'test test a');
INSERT INTO quiz_answers (questionId, answerDescription) VALUES (6, 'test test s');
INSERT INTO quiz_answers (questionId, answerDescription) VALUES (6, 'test test f');
INSERT INTO quiz_answers (questionId, answerDescription) VALUES (7, 'test test w');
