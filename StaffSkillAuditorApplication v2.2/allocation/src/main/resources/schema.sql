CREATE TABLE skill(
    SkillID INT AUTO_INCREMENT PRIMARY KEY,
    SkillName CHAR(100) NOT NULL UNIQUE,
    SkillDescription CHAR(100) NOT NULL UNIQUE,
    SkillCategory decimal not null
);

CREATE TABLE category(
    CategoryID INT AUTO_INCREMENT PRIMARY KEY,
    SkillCategory CHAR(20) NOT NULL UNIQUE,
    CategoryDescription CHAR(100) NOT NULL UNIQUE
);