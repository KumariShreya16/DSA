# Write your MySQL query statement below
select machine_id, ROUND(AVG (b.timestamp-a.timestamp),3) AS processing_time
FROM Activity a
JOIN Activity b USING(machine_id,process_id)
where a.activity_type='start' AND b.activity_type='end'
group by machine_id;