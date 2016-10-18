select
  eau.*,
  d.DEPT_NAME ,eu.USER_NAME
from 
  ENQUETE_Admin_USER eau 
left outer join 
  ESQ_USER eu
  on 
  eau.ESQ_ID = eu.ESQ_ID 
left outer join 
  DEPT d
  on 
  eu.DEPT_ID = d.DEPT_ID
   where eau.ENQUETE_ID = /*id*/3 
   and eau.DELETE_FLAG = 0