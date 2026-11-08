WITH RankedExams AS (
    SELECT 
        student_id, 
        exam_id, 
        score,
        ROW_NUMBER() OVER (PARTITION BY student_id ORDER BY score DESC, exam_id ASC) as rn
    FROM exam_results
)
SELECT student_id, exam_id, score
FROM RankedExams
WHERE rn = 1;