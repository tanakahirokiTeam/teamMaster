select
  e.*,
  es.ENQUETE_STATE ,eu.USER_NAME
from 
  ENQUETE e 
left outer join 
  ENQUETE_STATE es
  on 
  e.ENQUETE_STATE_ID = es.ENQUETE_STATE_ID 
left outer join 
  ESQ_USER eu
  on 
  eu.ESQ_ID = e.CREATE_USER_ID
   where e.ENQUETE_ID = /*id*/3 