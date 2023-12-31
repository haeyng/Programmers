--  게시글 제목, 게시글 ID, 댓글 ID, 댓글 작성자 ID, 댓글 내용, 댓글 작성일
SELECT USED_GOODS_BOARD.TITLE, USED_GOODS_BOARD.BOARD_ID, USED_GOODS_REPLY.REPLY_ID
,USED_GOODS_REPLY.WRITER_ID,USED_GOODS_REPLY.CONTENTS
,TO_CHAR(USED_GOODS_REPLY.CREATED_DATE,'YYYY-MM-DD') CREATED_DATE

FROM USED_GOODS_BOARD, USED_GOODS_REPLY

WHERE USED_GOODS_BOARD.BOARD_ID = USED_GOODS_REPLY.BOARD_ID
AND TO_CHAR(USED_GOODS_BOARD.CREATED_DATE,'YYYY-MM') = '2022-10'

ORDER BY USED_GOODS_REPLY.CREATED_DATE,USED_GOODS_BOARD.TITLE ASC;