-- 코드를 입력하세요
SELECT g.title, g.board_id, r.reply_id, r.writer_id, r.contents, TO_CHAR(r.created_date, 'yyyy-mm-dd') created_date
FROM used_goods_board g, used_goods_reply r
WHERE g.board_id = r.board_id 
AND TO_CHAR(g.created_date, 'yyyymmdd') BETWEEN '20221001' AND '20221031'
ORDER BY r.created_date , g.title;