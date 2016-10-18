select
  q.*,qt.QUESTION_TYPE
from 
  QUESTION_TYPE qt 
left outer join 
  QUESTION q 
  on 
  qt.QUESTION_TYPE_ID = q.QUESTION_TYPE_ID 
  where q.ENQUETE_ID = /*id*/1;