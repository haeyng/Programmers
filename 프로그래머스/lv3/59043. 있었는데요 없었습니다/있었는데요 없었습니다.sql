-- 코드를 입력하세요
SELECT ai.ANIMAL_ID, ai.NAME
from ANIMAL_INS ai, ANIMAL_OUTS ao
where ai.ANIMAL_ID = ao.ANIMAL_ID
    and ai.datetime > ao.datetime
order by ai.datetime;