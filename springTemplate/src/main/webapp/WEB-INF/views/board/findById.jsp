<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <table class="table">
       <tr>
          <td>${board.bno}</td>
          <td>${board.title}</td>
          <td>${board.content}</td>
          <td>${board.writer}</td>
           <td><fmt:formatDate pattern="yyyy-MM-dd" value="${board.regdate }"/></td>
        	   <td><fmt:formatDate pattern="yyyy-MM-dd" value="${board.updatedate }"/></td>
       </tr>
   </table>
   <div>
  <!-- 댓글 입력 폼 -->
  <div class="mb-3">
    <textarea 
      id="txtReply"
      class="form-control mb-2"
      rows="3"
      placeholder="댓글을 입력하세요..."
    ></textarea>
    <button class="btn btn-primary" id="btnReplyAdd">댓글 작성</button>
  </div>

  <hr />

  <!-- 댓글 리스트 -->
  <div class="reply mb-4">
    <div class="d-flex justify-content-between">
      <strong>user123</strong>
      <small class="text-muted">2025-05-22</small>
    </div>
    <p class="mb-1">좋은 글이네요!</p>
    <div>
      <button class="btn btn-sm btn-outline-secondary">수정</button>
      <button class="btn btn-sm btn-outline-danger">삭제</button>
    </div>
  </div>
</div>
<script src="/springTemplate/resources/js/findById.js"></script>
<script type="text/javascript">
   document.querySelector('#btnReplyAdd').addEventListener('click',function(e){
	   const reply = document.querySelector('#txtReply').value;
	   console.log(reply)
	   const data = {reply :'가가가' , replyer : '홍길동'};
	   register(data);
	   console.log(data)
   })
</script>
</body>
</html>