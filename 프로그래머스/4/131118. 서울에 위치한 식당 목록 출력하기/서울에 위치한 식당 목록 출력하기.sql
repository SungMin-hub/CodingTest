-- 코드를 입력하세요
SELECT
       a.REST_ID
     , a.REST_NAME
     , a.FOOD_TYPE
     , a.FAVORITES
     , a.ADDRESS
     , ROUND(AVG(b.REVIEW_SCORE),2) as SCORE
  from REST_INFO a
  join REST_REVIEW b on a.REST_ID = b.REST_ID
 where a.ADDRESS LIKE '서울%'
 group by a.REST_ID, a.REST_NAME, a.FOOD_TYPE, a.FAVORITES, a.ADDRESS
 order by SCORE DESC,a.FAVORITES DESC;