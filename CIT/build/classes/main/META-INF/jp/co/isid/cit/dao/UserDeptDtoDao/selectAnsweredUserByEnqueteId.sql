select u.*,d.DEPT_NAME
from ESQ_USER u
left outer join DEPT d
on u.DEPT_ID = d.DEPT_ID
left outer join ENQUETE_ANSWER e
on u.ESQ_ID = e.ESQ_ID
where e.ENQUETE_ID =/*id*/1