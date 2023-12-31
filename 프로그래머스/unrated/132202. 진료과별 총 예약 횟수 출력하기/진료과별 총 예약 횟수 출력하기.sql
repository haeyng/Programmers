-- 코드를 입력하세요
SELECT MCDP_CD "진료과코드"
      ,COUNT(APNT_NO) "5월예약건수"
FROM APPOINTMENT
WHERE TO_CHAR(APNT_YMD,'MM') = 05
GROUP BY MCDP_CD
ORDER BY "5월예약건수" ASC, MCDP_CD ASC;