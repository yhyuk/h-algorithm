-- 코드를 작성해주세요

select 
    ID, EMAIL, FIRST_NAME, LAST_NAME
from DEVELOPER_INFOS where skill_1 LIKE '%Python%' 
OR skill_2 LIKE '%Python%'
OR skill_3 LIKE '%Python%'
order by id;