select
  eu.*,
  d.DEPT_NAME
from 
  ESQ_USER eu
left outer join 
  DEPT d
  on 
  eu.DEPT_ID = d.DEPT_ID 
   where eu.ESQ_ID = /*id*/'li9010' 