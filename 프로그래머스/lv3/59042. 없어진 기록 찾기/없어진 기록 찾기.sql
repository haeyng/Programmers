-- 코드를 입력하세요
SELECT ao.ANIMAL_ID, ao.NAME
from ANIMAL_OUTS ao
where ao.ANIMAL_ID not in (select ANIMAL_ID from ANIMAL_INS ai where ai.ANIMAL_ID = ao.ANIMAL_ID)
order by ANIMAL_ID;

