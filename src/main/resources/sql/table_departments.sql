CREATE TABLE departments (
    id BIGSERIAL NOT NULL,
    name VARCHAR(10) NOT NULL,
    description TEXT DEFAULT NULL,
    CONSTRAINT departments_pk PRIMARY KEY (id)
);
CREATE INDEX name_id ON departments(LOWER(name));

INSERT INTO departments(name, description) values ('인프라웹팁', '우리는 웹을 개발합니다.');
INSERT INTO departments(name, description) values ('코어팀', '우리는 장비 정보 수집을 위한 프로그램을 만든다.');
INSERT INTO departments(name, description) values ('QA팀', '열심히 테스트 합시다.');
INSERT INTO departments(name, description) values ('디자인팀', '초괴의 UI/UX를 지향합니다.');
INSERT INTO departments(name, description) values ('차세대', '앞으로의 먹거리를 만들어봅시다.');
INSERT INTO departments(name) values ('?');