select  C.*,eu.USER_NAME
from  (
      select A.ENQUETE_ID, A.ENQUETE_NAME, A.ENQUETE_STATE_ID,A.CREATE_USER_ID,A.CREATE_DATE,
       A.START_DATE,A.FINISH_DATE,A.ENQUETE_SUBTEXT,A.VERSION,B.ENQUETE_ANSWER_ID
      from (
            select *
            from ENQUETE e
            where e.ENQUETE_ID in (
              select
                ed.ENQUETE_ID
              from
                ENQUETE_DEPT ed
              where
                ed.DEPT_ID = /*deptId*/2
            )
          ) A
      left outer join (
            select *
            from ENQUETE_ANSWER ea
            where ea.ESQ_ID = /*esqId*/'li9012'
      ) B
      on
        A.ENQUETE_ID = B.ENQUETE_ID
    ) C
  inner join
    ESQ_USER eu
  on
    C.CREATE_USER_ID = eu.ESQ_ID
  where C.ENQUETE_STATE_ID = 3