select count(*)
from 
  ESQ_USER eu 
left outer join 
  ENQUETE_ANSWER ea 
  on 
  ea.ESQ_ID = eu.ESQ_ID 
  where ea.ENQUETE_ID = /*enqueteId */1 and eu.DEPT_ID = /*deptId */1