CREATE TABLE IF NOT EXISTS `Users` (
    `user_id`   VARCHAR(50) NOT NULL,
    `password`  VARCHAR(50) NOT NULL,
    agr int not null

    PRIMARY KEY(`user_id`)
);

MERGE INTO `Users` KEY ( `user_id` ) VALUES ( 'admin', '12345' );
MERGE INTO `Users` KEY ( `user_id` ) VALUES ( 'dongmyo', '67890' );


-- EXISTS, MERGE :  H2에있는 명령어 (초기에 시작할 때 있는지 체크해서 실행)

-- (Optimizer가 성능 개선을 위해 inner Join으로 바꿔서 실행한다.)
-- cross join
-- select *
-- from UserDevice A, Users B
-- where A.user_id = B.user_id;
-- -- inner join
-- select *
-- from UserDevice A
-- inner join Users B
--     on A.user_id = B.user_id;
