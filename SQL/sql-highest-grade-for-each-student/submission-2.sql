SELECT e.student_id, MIN(e.exam_id) AS exam_id, e.score
FROM exam_results e
JOIN (
    SELECT student_id, MAX(score) AS max_score
    FROM exam_results
    GROUP BY student_id
) max_table 
    ON e.student_id = max_table.student_id AND e.score = max_table.max_score
GROUP BY e.student_id, e.score;