select
  ed.*,d.DEPT_NAME
from 
  ENQUETE_DEPT ed 
left outer join 
  DEPT d 
  on 
  ed.DEPT_ID = d.DEPT_ID 
  where ed.ENQUETE_ID = /*id*/6