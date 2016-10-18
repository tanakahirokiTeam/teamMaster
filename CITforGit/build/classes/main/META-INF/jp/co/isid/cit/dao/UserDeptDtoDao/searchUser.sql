select
  eu.*,
  d.DEPT_NAME
from 
  ESQ_USER eu
left outer join 
  DEPT d
  on 
  eu.DEPT_ID = d.DEPT_ID 
where 
eu.ESQ_ID like CASE WHEN /*esqId*/'li9010' IS NULL THEN '%%' ELSE /*@infix(esqId)*/'%9020%' END
and d.DEPT_ID >= CASE WHEN /*deptId*/2 = 0 THEN 0 ELSE /*deptId*/2 END
and d.DEPT_ID <= CASE WHEN /*deptId*/2 = 0 THEN 2500 ELSE /*deptId*/2 END
and eu.USER_NAME like CASE WHEN /*userName*/'上野' IS NULL THEN '%%' ELSE /*@infix(userName)*/'%上野%' END