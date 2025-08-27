-- 코드를 입력하세요
SELECT fh.flavor
FROM first_half fh, icecream_info ii
WHERE fh.flavor = ii.flavor
AND fh.total_order > 3000 AND ii.INGREDIENT_TYPE like 'fruit_based'
