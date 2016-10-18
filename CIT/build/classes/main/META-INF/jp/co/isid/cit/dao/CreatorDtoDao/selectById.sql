select
  e.*,eu.USER_NAME
from 
  ENQUETE e 

left outer join 
  ESQ_USER eu
  on 
  eu.ESQ_ID = e.CREATE_USER_ID
   where e.ENQUETE_ID = /*id*/3 