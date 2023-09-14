insert into skill (SkillName, SkillDescription, SkillCategory) VALUES ('Forklift Training Certificate', 'Allows allocated Staff member access to the forklift', 1);
insert into skill (SkillName, SkillDescription, SkillCategory) VALUES ('Electrical Installation (18th amendment)', 'Allows allocated Staff member access to electrical resources/tools', 2);
insert into skill (SkillName, SkillDescription, SkillCategory) VALUES ('Internal CMS System Training', 'Shows whether allocated Staff member has been trained to use our internal workplace CMS System', 3);
CREATE SEQUENCE skill_id START WITH (select max(SkillID) + 1 from skill);

insert into category (SkillCategory, CategoryDescription) VALUES ('MechanicalSkills', 'Category for containing Skills allocated to Electro Mechanical Staff Members');
insert into category (SkillCategory, CategoryDescription) VALUES ('ElectronicsSkills', 'Category for containing Skills allocated to Electronics/Drives Staff Members');
insert into category (SkillCategory, CategoryDescription) VALUES ('OfficeSkills', 'Category for containing Skills allocated to Office Staff Members');
CREATE SEQUENCE category_id START WITH (select max(CategoryID) + 1 from category);