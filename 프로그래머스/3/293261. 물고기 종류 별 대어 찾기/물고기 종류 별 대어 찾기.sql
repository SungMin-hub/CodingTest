-- 코드를 작성해주세요
SELECT
       a.ID as ID
     , b.FISH_NAME as FISH_NAME
     , a.LENGTH as LENGTH
  FROM FISH_INFO a
  JOIN FISH_NAME_INFO b ON a.FISH_TYPE = b.FISH_TYPE
 WHERE a.LENGTH = (SELECT MAX(c.LENGTH)
                     FROM FISH_INFO c
                    WHERE c.FISH_TYPE = a.FISH_TYPE)
 ORDER BY a.ID;