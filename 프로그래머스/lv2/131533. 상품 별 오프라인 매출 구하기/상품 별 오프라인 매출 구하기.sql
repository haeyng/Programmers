-- 코드를 입력하세요
SELECT p.PRODUCT_CODE, sum(p.price * o.SALES_AMOUNT) "SALES"
from PRODUCT p , OFFLINE_SALE o
where p.PRODUCT_ID = o.PRODUCT_ID
group by p.product_code
order by SALES desc , PRODUCT_CODE asc;