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
ESQ_ID=to_single_byte(/*esqId*/'ｌi９０１０') 
or eu.ESQ_ID like/*@prefix(esqId)*/'%9020%'
or eu.ESQ_ID like/*@suffix(esqId)*/'%9020%'
or d.DEPT_ID=/*deptId*/2 
or eu.USER_NAME like/*@prefix(userName)*/'%上野%'
or eu.USER_NAME like/*@suffix(userName)*/'%上野%'