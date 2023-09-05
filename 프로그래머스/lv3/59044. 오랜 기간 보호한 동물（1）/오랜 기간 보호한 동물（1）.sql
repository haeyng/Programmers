-- 코드를 입력하세요

select name, datetime
from(
SELECT ai.NAME, ai.DATETIME, row_number()over(order by datetime) rn
from ANIMAL_INS ai 
where ai.ANIMAL_ID not in (select ANIMAL_ID from ANIMAL_OUTS ao where ai.animal_id = ao.animal_id)
ORDER BY ai.DATETIME) f
where rn <= 3;
