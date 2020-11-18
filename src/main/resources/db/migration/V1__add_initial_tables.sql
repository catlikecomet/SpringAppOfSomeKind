CREATE TABLE quiz_reference (
    quizId int AUTO_INCREMENT NOT NULL PRIMARY KEY,
    quiz_name varchar(255)
);

CREATE TABLE quiz_questions (
    questionId int AUTO_INCREMENT NOT NULL PRIMARY KEY,
    quizId int NOT NULL,
    questionDescription varchar(255),
    FOREIGN KEY (quizId) REFERENCES quiz_reference(quizId)
);

CREATE TABLE quiz_answers (
    answerId int AUTO_INCREMENT NOT NULL PRIMARY KEY,
    questionId int NOT NULL,
    answerDescription varchar(255),
    FOREIGN KEY (questionId) REFERENCES quiz_questions(questionId)
);

COMMIT;