SELECT DISTINCT c.customer_id, c.customer_name
FROM customers c
JOIN orders oA 
    ON c.customer_id = oA.customer_id AND oA.product_name = 'A'
JOIN orders oB 
    ON c.customer_id = oB.customer_id AND oB.product_name = 'B'
LEFT JOIN orders oC 
    ON c.customer_id = oC.customer_id AND oC.product_name = 'C'
WHERE oC.customer_id IS NULL
ORDER BY c.customer_name;